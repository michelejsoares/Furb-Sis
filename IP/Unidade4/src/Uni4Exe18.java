import java.util.Scanner;

public class Uni4Exe18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diaVencimento = 0, diaPagamento = 0, valorPrestacao = 0, diferencaDia = 0;
		double desconto = 0.0, valorFinal = 0.0;
		System.out.println("Dia do vencimento: ");
		diaVencimento = sc.nextInt();
		System.out.println("Dia do pagamento: ");
		diaPagamento = sc.nextInt();
		System.out.println("Valor da prestação: ");
		valorPrestacao = sc.nextInt();
		diferencaDia = diaPagamento - diaVencimento;
		if(diaPagamento < diaVencimento){
			desconto = valorPrestacao * 0.10; 
			valorFinal = valorPrestacao - desconto;
			System.out.println("O pagamento está em dia. O valor da prestação = R$ "+valorFinal);
		}else if(diferencaDia >= 1 && diferencaDia <= 5){
			valorFinal = valorPrestacao;
			System.out.println("O pagamento é sem desconto. R$"+valorFinal);
		}else{
			valorFinal = (diferencaDia * 2) + valorPrestacao;
			System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$ "+valorFinal);
		}
		System.out.println();
		sc.close();
	}
}
