package Questao2;

public class TagMp3 {
    private String titulo;
    private String artista;
    private String album;
    private String ano;
    private String comentario;
    private int faixa;
    private int genero;
    public TagMp3(String titulo, String artista, String album, String ano, String comentario, int faixa, int genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.ano = ano;
        this.comentario = comentario;
        this.faixa = faixa;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public String getAno() {
        return ano;
    }

    public String getComentario() {
        return comentario;
    }

    public int getFaixa() {
        return faixa;
    }

    public int getGenero() {
        return genero;
    }
}
