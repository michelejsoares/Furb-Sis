import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df_2 = new DecimalFormat("0.00");
		int qtdAzulejo = 0;
		double comprimento = 0.0, altura = 0.0, tamanhoParede = 0.0, valor = 0.0;
		System.out.println("Informe o Comprimento: ");
		comprimento = sc.nextFloat();
		System.out.println("Informe a Altura: ");
		altura = sc.nextFloat();
		tamanhoParede = altura * comprimento;
		qtdAzulejo = (int) Math.ceil(tamanhoParede * 9);
		valor = qtdAzulejo * 12.50;
		System.out.println("Area: "+tamanhoParede);
		System.out.println("Quantidade Azulejo: "+qtdAzulejo);
		System.out.println("Valor: R$"+df_2.format(valor));
		sc.close();
	}
}
