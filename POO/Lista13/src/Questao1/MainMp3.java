package Questao1;

import java.io.File;
import java.io.IOException;

public class MainMp3 {
	public static void main(String[] args) {
		File arquivo = new File("");
		try {
			ArquivoMp3 mp3 = new ArquivoMp3(arquivo);
			TagMp3 tag = mp3.getTag();
			System.out.println(tag.getTitulo());
			System.out.println(tag.getArtista());
			System.out.println(tag.getAno());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
