package Questao1;

import java.util.List;

public class App {

	public static void main(String[] args) {
		try {
			String caminho = "C:\\Users\\Michele\\Downloads\\L14_municipios.csv";
			List<Municipio> lista = LeitorMunicipios.lerArquivo(caminho);
			if(!lista.isEmpty()) {
				System.out.println("Nenhum municipio encontrado.");
				return;
			}
			Municipio menor = lista.get(0);
            Municipio maior = lista.get(0);

            for (Municipio m : lista) {
                if (m.getPopulacao() < menor.getPopulacao()) {
                    menor = m;
                }
                if (m.getPopulacao() > maior.getPopulacao()) {
                    maior = m;
                }
            }
            System.out.println("===== RESULTADOS =====");
            System.out.println("Menor população: " + menor);
            System.out.println("Maior população: " + maior);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
	}

}
