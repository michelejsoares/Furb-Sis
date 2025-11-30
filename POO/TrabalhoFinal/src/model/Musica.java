package model;

public class Musica extends Midia{
	private String artista;

	public Musica(String local, long tamanhoBytes, String titulo, long duracao, String categoria, String artista) {
        super(local, tamanhoBytes, titulo, duracao, categoria); // gera novo id
        this.artista = artista;
    }

    // para carregar do disco (com id)
    public Musica(int id, String local, long tamanhoBytes, String titulo, long duracao, String categoria, String artista) {
        super(id, local, tamanhoBytes, titulo, duracao, categoria); // usa id passado
        this.artista = artista;
    }

    public String getArtista() { return artista; }
    public void setArtista(String artista) { 
    	this.artista = artista; 
    }

    @Override
    public String getTipo() { 
    	return "MUSICA"; 
    }

    @Override
    public String exibirAtributosEspecificos() {
        return "Artista: " + artista + " | Duração(s): " + getDuracao();
    }
}
