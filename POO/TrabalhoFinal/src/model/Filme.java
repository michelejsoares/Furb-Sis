package model;

public class Filme extends Midia{
	private String idiomaAudio;

    public Filme(String local, long tamanhoBytes, String titulo, long duracaoMinutes, String categoria, String idiomaAudio) {
        super(local, tamanhoBytes, titulo, duracaoMinutes, categoria);
        this.idiomaAudio = idiomaAudio;
    }
    
    public Filme(int id, String local, long tamanhoBytes, String titulo, long duracaoMinutes, String categoria, String idiomaAudio) {
        super(id, local, tamanhoBytes, titulo, duracaoMinutes, categoria);
        this.idiomaAudio = idiomaAudio;
    }

    public String getIdiomaAudio() { return idiomaAudio; }
    public void setIdiomaAudio(String idiomaAudio) {
    	this.idiomaAudio = idiomaAudio;
    }

    @Override
    public String getTipo() { 
    	return "FILME";
    }

    @Override
    public String exibirAtributosEspecificos() {
        return "Idioma áudio: " + idiomaAudio + " | Duração(min): " + getDuracao();
    }
}
