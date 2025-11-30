package model;

import controle.IdGerador;

public abstract class Midia {
	private int id;
    private String local;
    private long tamanhoBytes;
    private String titulo;
    private long duracao;
    private String categoria;

	// CONSTRUTOR PARA NOVAS MÍDIAS (usa IdGenerator)
    public Midia(String local, long tamanhoBytes, String titulo, long duracao, String categoria) {
        this.id = IdGerador.novoId();
        this.local = local;
        this.tamanhoBytes = tamanhoBytes;
        this.titulo = titulo;
        this.duracao = duracao;
        this.categoria = categoria;
    }


    // CONSTRUTOR PARA CARREGAR DO DISCO (recebe id)
    public Midia(int id, String local, long tamanhoBytes, String titulo, long duracao, String categoria) {
        this.id = id;
        this.local = local;
        this.tamanhoBytes = tamanhoBytes;
        this.titulo = titulo;
        this.duracao = duracao;
        this.categoria = categoria;
    }


    
    public int getId() { 
    	return id;
    }
    public void setId(int id) { 
    	this.id = id; 
    }
    
    public String getLocal() {
    	return local;
    }
    public void setLocal(String local) { 
    	this.local = local;
    }
    public long getTamanhoBytes() { 
    	return tamanhoBytes; 
    }
    public void setTamanhoBytes(long tamanhoBytes) { 
    	this.tamanhoBytes = tamanhoBytes;
    }
    public String getTitulo() { 
    	return titulo;
    }
    public void setTitulo(String titulo) { 
    	this.titulo = titulo; 
    }
    public long getDuracao() { 
    	return duracao; 
    }
    public void setDuracao(long duracao) { 
    	this.duracao = duracao; 
    }
    public String getCategoria() { 
    	return categoria; 
    }
    public void setCategoria(String categoria) { 
    	this.categoria = categoria; 
    }
    public abstract String getTipo();
    public abstract String exibirAtributosEspecificos();

    @Override
    public String toString() {
        return String.format("%s [%s] (%s)", titulo, getTipo(), categoria);
    }
}
