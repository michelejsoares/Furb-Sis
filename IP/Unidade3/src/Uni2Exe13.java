import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df_2 = new DecimalFormat("0.00");
		double qtdAzulejo = 0;
		double comprimento = 0.0, altura = 0.0, tamanhoParede = 0.0, valor = 0.0;
		System.out.println("Altura: ");
		altura = sc.nextFloat();
		System.out.println("Comprimento: ");
		comprimento = sc.nextFloat();
		tamanhoParede = altura * comprimento;
		qtdAzulejo = tamanhoParede * 9;
		valor = qtdAzulejo * 12.50;
		System.out.println("O valor final é R$"+df_2.format(valor));
		sc.close();
	}
}