import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe02 {
	public static void main(String[] args) {
		int valorCalcado = 0;
		float porcentoDesconto = 0.12f, valorDesconto = 0.0f, valorFinal = 0.0f;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df_2 = new DecimalFormat("0.00");
		valorCalcado = sc.nextInt();
		valorDesconto = valorCalcado * porcentoDesconto;
		valorFinal = valorCalcado - valorDesconto;
		System.out.println("O valor do desconto é de R$"+df_2.format(valorDesconto));
		System.out.println("O preço do par de sapatos com desconto é R$"+df_2.format(valorFinal));
		sc.close();
	}
}
