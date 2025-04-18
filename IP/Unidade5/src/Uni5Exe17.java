import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df_2 = new DecimalFormat("0.00");
		int numInscricao = 0, qtd = 0, numMaisBaixo = 0, numMaisAlto = 0;
		float altura = 0.0f, maisAlto = 0.0f, maisBaixo = 0.0f, soma = 0.0f, media = 0.0f;
		while (true) {
			System.out.println("Nº de inscrição: ");
			numInscricao = sc.nextInt();
			if(numInscricao == 0 && qtd != 0){
				break;
			}
			System.out.println("Altura: ");
			altura = sc.nextFloat();
			if(qtd == 0){
				maisAlto = altura;
				maisBaixo = altura;
			}
			if(altura > maisAlto){
				maisAlto = altura;
				numMaisAlto = numInscricao;
			}
			if(altura < maisBaixo){
				maisBaixo = altura;
				numMaisBaixo = numInscricao;

			}
			soma += altura;
			qtd++;
		}
		media = soma / qtd;
		System.out.println("O atleta mais baixo tem "+maisBaixo+"m e o seu número de inscrição é "+numMaisBaixo);
		System.out.println("O atleta mais alto tem "+maisAlto+"m e o seu número de inscrição é "+numMaisAlto);
		System.out.println("A altura média do grupo de atletas é: "+df_2.format(media));
		sc.close();
	}
}
