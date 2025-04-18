import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df_2 = new DecimalFormat("0.00");
		int qtdF = 0, qtd = 0;
		float altura = 0.0f, somaF = 0.0f, soma = 0.0f, media = 0.0f, mediaF = 0.0f;
		String genero, generoMaiusculo;
		while (true) {
			System.out.println("Altura: ");
			altura = sc.nextFloat();
			if(altura == 0.0 && qtd != 0){
				break;
			}
			System.out.println("Genero: ");
			genero = sc.next();
			generoMaiusculo = genero.toUpperCase();
			if(generoMaiusculo.equals("F")){
				somaF += altura;
				qtdF++;
			}
			soma += altura;
			qtd++;
		}
		media = soma / qtd;
		mediaF = somaF / qtdF;
		System.out.println("A média da altura das mulheres é: "+df_2.format(mediaF));
		System.out.println("A média de altura do grupo é: "+df_2.format(media));
		sc.close();
	}
}
