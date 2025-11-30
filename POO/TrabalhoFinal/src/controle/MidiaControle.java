package controle;

import java.io.File;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import dao.MidiaDAO;
import model.Midia;

public class MidiaControle {
	private final MidiaDAO dao;

    public MidiaControle(MidiaDAO dao) {
        this.dao = dao;
    }

    public Midia incluirMedia(Midia m) throws Exception {
        dao.salvar(m);
        return m;
    }


    public void editarMedia(Midia m) throws Exception {
        dao.atualizar(m);
    }

    public boolean removerMidia(int i) throws Exception {
        Optional<Midia> opt = dao.buscarPorId(i);
        if (opt.isPresent()) {
            Midia m = opt.get();

            // NORMALIZAR O CAMINHO (trocar \ por /)
            String caminho = m.getLocal().replace("\\", "/");
            Path arquivo = Paths.get(caminho).normalize();

            // apagar o arquivo físico, se existir
            if (Files.exists(arquivo)) {
                Files.delete(arquivo);
            }
            System.out.println("Tentando deletar: " + arquivo.toAbsolutePath());
            System.out.println("Existe? " + Files.exists(arquivo));
            // remover o .tpoo
            return dao.deletar(i);
        }
        return false;
    }


    public void moverMedia(int id, Path destinoDir) throws Exception {
        Optional<Midia> opt = dao.buscarPorId(id);
        if (opt.isPresent()) {
            Midia m = opt.get();
            Path origem = Paths.get(m.getLocal());

            // cria a pasta de destino
            if (!Files.exists(destinoDir)) Files.createDirectories(destinoDir);

            Path alvo = destinoDir.resolve(origem.getFileName());

            // mover fisicamente
            Files.move(origem, alvo, StandardCopyOption.REPLACE_EXISTING);

            // atualizar o caminho no objeto
            m.setLocal(alvo.toString());

            // salvar NO .tpoo
            dao.atualizar(m);

        } else {
            throw new IllegalArgumentException("Arquivo não encontrado: " + id);
        }
    }

    public void renomearArquivo(int id, String novoNome) throws Exception {
        Optional<Midia> opt = dao.buscarPorId(id);
        if (opt.isPresent()) {
            Midia m = opt.get();
            Path origem = Paths.get(m.getLocal());

            // Extrair extensão do arquivo original
            String nomeOriginal = origem.getFileName().toString();
            int idx = nomeOriginal.lastIndexOf(".");
            String extensao = (idx >= 0) ? nomeOriginal.substring(idx) : "";

            // Remover qualquer extensão que o usuário tenha digitado
            int idx2 = novoNome.lastIndexOf(".");
            if (idx2 >= 0) {
                novoNome = novoNome.substring(0, idx2);
            }

            // Montar novo nome com a extensão original
            String novoNomeCompleto = novoNome + extensao;

            // Caminho final
            Path novo = origem.resolveSibling(novoNomeCompleto);

            // Renomear fisicamente
            Files.move(origem, novo, StandardCopyOption.REPLACE_EXISTING);

            // Atualizar caminho na mídia
            m.setLocal(novo.toString()); 

            // Atualizar o arquivo .tpoo
            dao.atualizar(m);

        } else {
            throw new IllegalArgumentException("Arquivo não encontrado: " + id);
        }
    }



    public List<Midia> listarTodos() throws Exception {
        return dao.listarTodos();
    }

    public List<Midia> listarFiltrados(Optional<String> tipoOpt, Optional<String> categoriaOpt, Optional<String> ordenar) throws Exception {
        List<Midia> all = listarTodos();
        Stream<Midia> s = all.stream();
        if (tipoOpt.isPresent()) {
            String t = tipoOpt.get();
            s = s.filter(m -> m.getTipo().equalsIgnoreCase(t));
        }
        if (categoriaOpt.isPresent()) {
            String c = categoriaOpt.get();
            s = s.filter(m -> m.getCategoria()!=null && m.getCategoria().equalsIgnoreCase(c));
        }
        List<Midia> res = s.collect(Collectors.toList());
        if (ordenar.isPresent()) {
            String o = ordenar.get();
            if ("ALFABETICA".equalsIgnoreCase(o)) {
                res.sort(Comparator.comparing(Midia::getTitulo, Comparator.nullsLast(String::compareToIgnoreCase)));
            } else if ("DURACAO".equalsIgnoreCase(o)) {
                res.sort(Comparator.comparingLong(Midia::getDuracao));
            }
        }
        return res;
    }
    private long calcularDuracaoKB(String caminho) {
        try {
            File f = new File(caminho);
            if (!f.exists()) return 0;

            long kb = (f.length() + 1023) / 1024; // arredonda corretamente

            return kb;
        } catch (Exception e) {
            return 0;
        }
    }


}
