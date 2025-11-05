package Questao1;

import java.io.File;

public class App {
	public static long tamanhoArquivo(File file) {
		if(file.isFile()) {
			return file.length();
		}
		long total = 0;
		for(File f: file.listFiles()) {
			total += tamanhoArquivo(f);
		}
		return total;
	}
	
	public static void main(String[] args) {
		File arquivo = new File("C:\\Users\\michelejaginski\\Downloads\\Nova pasta\\TrabalhoFinal\\src");
		long tamanho = tamanhoArquivo(arquivo);
		float tamanhoMB = tamanho / (1024f * 1024f);
		System.out.println("Tamanho da pasta: "+tamanhoMB);
	}
}
