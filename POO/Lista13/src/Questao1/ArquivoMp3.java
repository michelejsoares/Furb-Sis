package Questao1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ArquivoMp3 {
	private TagMp3 tag;
	
	private String lerBytes(byte[] dado, int indice, int nBytes) {
		byte[] texto = new byte[nBytes];
		for(int i = indice; i < (indice + nBytes); i++) {
			texto[i-indice] = dado[i];
		}
		return new String(texto);
	}
	private void importarArquivo(File arquivo) throws IOException {
		byte[] cabecalho = new byte[128];
		try {
			FileInputStream fis = new FileInputStream(arquivo);
			fis.skip(arquivo.length()-128);
			fis.read(cabecalho);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String textoTag = lerBytes(cabecalho, 0, 3);
		if(!textoTag.equals("TAG")) {
			throw new ArquivoNaoTemMp3("Arquivo nao tem tag");
		}
		tag = new TagMp3();
		tag.setTitulo(lerBytes(cabecalho, 3, 30));
		tag.setArtista(lerBytes(cabecalho, 33, 30));
		tag.setAlbum(lerBytes(cabecalho, 63, 30));
		String textAno = lerBytes(cabecalho, 93, 4);
		if(!textAno.isEmpty()) {
			int ano = Integer.parseInt(textAno);
			tag.setAno(ano);
		}
				
	}
	public ArquivoMp3(File arquivo)  throws IOException{
		if(!arquivo.exists()) {
			throw new FileNotFoundException("Arquivo nao existe");
		}
		importarArquivo(arquivo);
	}
	public TagMp3 getTag() {
		return tag;
	}
	
}
