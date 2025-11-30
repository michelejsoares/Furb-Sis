package dao;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import model.*;

public class FileMidiaDAO implements MidiaDAO{
	private Path storageDir = null;
	
    public FileMidiaDAO(Path storageDir) throws IOException {
        this.storageDir = storageDir;
        if (!Files.exists(storageDir)) Files.createDirectories(storageDir);
    }

    @Override
    public void salvar(Midia m) throws Exception {
        Path p = storageDir.resolve(m.getId() + ".tpoo");
        try (BufferedWriter w = Files.newBufferedWriter(p)) {
            Map<String,String> map = toMap(m);
            for (Map.Entry<String,String> e : map.entrySet()) {
                w.write(e.getKey() + "=" + e.getValue());
                w.newLine();
            }
        } 
    }

    @Override
    public boolean deletar(int id) throws Exception {
        Path p = storageDir.resolve(id + ".tpoo");
        if (Files.exists(p)) { 
            Files.delete(p);
            return true;
        }
        return false;
    }

    @Override
    public void atualizar(Midia m) throws Exception {
        salvar(m);
    }

    @Override
    public List<Midia> listarTodos() throws Exception {
        if (!Files.exists(storageDir)) return Collections.emptyList();
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(storageDir, "*.tpoo")) {
            List<Midia> list = new ArrayList<>();
            for (Path p : ds) {
            	Midia m = fromFile(p);
                if (m != null) list.add(m);
            }
            return list;
        }
    }

    @Override
    public Optional<Midia> buscarPorId(int id) throws Exception {
        Path p = storageDir.resolve(id + ".tpoo");
        if (Files.exists(p)) {
            return Optional.ofNullable(fromFile(p));
        }
        return Optional.empty();
    }

    private Map<String,String> toMap(Midia m) {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("id", String.valueOf(m.getId()));
        map.put("tipo", m.getTipo());
        if (m.getLocal() == null) {
            map.put("local", "");
        }else{
            map.put("local", m.getLocal());
        }
        map.put("tamanhoBytes", String.valueOf(m.getTamanhoBytes()));
        if (m.getTitulo() == null) {
            map.put("titulo", "");
        }else{
            map.put("titulo", m.getTitulo());
        }
        map.put("duracao", String.valueOf(m.getDuracao()));
        if (m.getCategoria() == null) {
            map.put("categoria", "");
        }else{
            map.put("categoria", m.getCategoria());
        }
        if (m instanceof Musica) {
            Musica mus = (Musica) m;
            if (mus.getArtista() == null) {
                map.put("artista", "");
            }else{
                map.put("artista", mus.getArtista());
            } 
        }else if (m instanceof Filme){
            Filme f = (Filme) m;
            if (f.getIdiomaAudio() == null) {
                map.put("idiomaAudio", "");
            }else{
                map.put("idiomaAudio", f.getIdiomaAudio());
            }
        }else if (m instanceof Livro){
            Livro l = (Livro) m;
            if (l.getAutores() == null) {
                map.put("autores", "");
            }else{
                map.put("autores", l.getAutores());
            }
        }
        map.put("duracaoCalculada", String.valueOf(m.isDuracaoCalculada()));
        return map;
    }

    private Midia fromFile(Path p) {
        try {
            List<String> lines = Files.readAllLines(p);
            Map<String,String> map = new HashMap<>();
            for (String l : lines) {
                int idx = l.indexOf('=');
                if (idx>0) {
                    String k = l.substring(0,idx);
                    String v = l.substring(idx+1);
                    map.put(k,v);
                }
            }
            String tipo = map.getOrDefault("tipo","");
            String local = map.getOrDefault("local","");
            int id = Integer.parseInt(map.getOrDefault("id","0")); // parse int
            long tamanho = Long.parseLong(map.getOrDefault("tamanhoBytes","0"));
            String titulo = map.getOrDefault("titulo","");
            long dur = Long.parseLong(map.getOrDefault("duracao","0"));
            String categoria = map.getOrDefault("categoria","");
            boolean durCalc = Boolean.parseBoolean(map.getOrDefault("duracaoCalculada", "false"));
            switch(tipo) {
                case "MUSICA":
                    //return new Musica(id, local, tamanho, titulo, dur, categoria, map.getOrDefault("artista",""));
                    return new Musica(id, local, tamanho, titulo, dur, categoria, map.getOrDefault("artista",""), durCalc);
                case "FILME":
                    return new Filme(id, local, tamanho, titulo, dur, categoria, map.getOrDefault("idiomaAudio",""), durCalc);
                case "LIVRO":
                    return new Livro(id, local, tamanho, titulo, dur, categoria, map.getOrDefault("autores",""), durCalc);
                default:
                    return null;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
