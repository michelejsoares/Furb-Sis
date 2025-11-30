package model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Livro extends Midia{
	private String autores;

    public Livro(String local, long tamanhoBytes, String titulo, long paginas, String categoria, String autores) {
        super(local, tamanhoBytes, titulo, paginas, categoria);
        this.autores = autores;
    }
    
    public Livro(int id, String local, long tamanhoBytes, String titulo, long paginas, String categoria, String autores) {
        super(id, local, tamanhoBytes, titulo, paginas, categoria);
        this.autores = autores;
    }

    public List<String> getAutoresList() {
        if (autores == null || autores.trim().isEmpty()) return Arrays.asList();
        return Arrays.stream(autores.split(",")).map(String::trim).collect(Collectors.toList());
    }

    public String getAutores() { return autores; }
    public void setAutores(String autores) {
    	this.autores = autores;
    }

    @Override
    public String getTipo() {
    	return "LIVRO";
    }

    @Override
    public String exibirAtributosEspecificos() {
        return "Autores: " + autores + " | Páginas: " + getDuracao();
    }
}
