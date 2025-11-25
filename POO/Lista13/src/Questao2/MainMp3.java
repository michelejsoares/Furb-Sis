package Questao2;

import java.util.Scanner;

public class MainMp3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o nome do arquivo MP3: ");
        String caminho = sc.nextLine();
        try {
            ArquivoMp3 mp3 = new ArquivoMp3(caminho);
            TagMp3 tag = mp3.getTag();
            System.out.println("\n=== TAGS MP3 ===");
            System.out.println("Título:     " + tag.getTitulo());
            System.out.println("Artista:    " + tag.getArtista());
            System.out.println("Álbum:      " + tag.getAlbum());
            System.out.println("Ano:        " + tag.getAno());
            System.out.println("Comentário: " + tag.getComentario());
            System.out.println("Faixa:      " + tag.getFaixa());
            System.out.println("Gênero:     " + tag.getGenero());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();
    }
}
