import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df_2 = new DecimalFormat("0.00");
		int qtd = 0;
		float valorCompra = 0.0f;
		double valorFinal = 0.0, desconto = 0.0;
		while (true) {
			System.out.println("Valor Compra: ");
			valorCompra = sc.nextInt();
			if(valorCompra == 0.0 && qtd != 0){
				break;
			}
			if(valorCompra > 500){
				desconto = valorCompra * 0.2;
				valorFinal = valorCompra - desconto;
			}else if(valorCompra <= 500){
				desconto = valorCompra * 0.15;
				valorFinal = valorCompra - desconto;
			}
			System.out.println("Valor a pagar: R$"+df_2.format(valorFinal));
			qtd++;
		}
		sc.close();
	}
}
