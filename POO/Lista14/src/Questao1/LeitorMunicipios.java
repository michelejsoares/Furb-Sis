package Questao1;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class LeitorMunicipios {
	public static List<Municipio> lerArquivo(String caminho) throws Exception{
		File f = new File(caminho);
		if(!f.exists()) {
			throw new FileNotFoundException("Arquivo não localizado.");
		}
		List<Municipio> lista = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
		String linha;
		boolean primeira = true;
		
		while((linha = br.readLine()) != null) {
			if(primeira) {
				primeira = false;
				continue;
			}
			String[] partes = linha.split(";");
			String codigoIBGE = partes[0];
			String cidade = partes[1];
			String estado = partes[2];
			int populacao = Integer.parseInt(partes[3]);
			lista.add(new Municipio(codigoIBGE, cidade, estado, populacao));
		}
		br.close();
		return lista;
	}
}
