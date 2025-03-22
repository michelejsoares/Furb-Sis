import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df_2 = new DecimalFormat("0.00");
		float nota1 = 0.0f, nota2 = 0.0f, nota3 = 0.0f, notaE = 0.0f;
		double media = 0.0;
		char conceito;
		String situacao;
		nota1 = sc.nextFloat();
		nota2 = sc.nextFloat();
		nota3 = sc.nextFloat();
		notaE = sc.nextFloat();
		media = (nota1 + (nota2 * 2) + (nota3 * 3) + notaE) / 7;
		if(media > 9){
			conceito = 'A';
		}else if(media >= 7.5 && media < 9){
			conceito = 'B';
		}else if(media >= 6 && media < 7.5){
			conceito = 'C';
		}else if(media >= 4 && media < 6){
			conceito = 'D';
		}else{
			conceito = 'E';
		}
		if(conceito == 'A' || conceito == 'B' || conceito == 'C'){
			situacao = "Aprovado";
		}else{
			situacao = "Reprovado";
		}
		System.out.println("A média de aproveitamento foi: "+df_2.format(media)+". Conceito: "+conceito+". "+situacao);
		sc.close();
	}
}
