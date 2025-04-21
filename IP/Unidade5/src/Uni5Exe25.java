import java.util.Scanner;

public class Uni5Exe25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String vencedor = "";
		int pontoD = 0, pontoE = 0, diferencaD = 0, diferencaE = 0;
		while (true) {
			System.out.println("Informe os pontos do lado Direito:");
			pontoD += sc.nextInt();
			System.out.println("Informe os pontos do lado Esquerdo:");
			pontoE += sc.nextInt();
			diferencaD = pontoD - pontoE;
			diferencaE = pontoE - pontoD;
			if(pontoD == 21 && diferencaD >= 2){
				vencedor = "Direito";
				break;
			}
			if(pontoE == 21 && diferencaE >= 2){
				vencedor = "Esquerdo";
				break;
			}

		}
		System.out.println("Vendedor é o lado "+vencedor);
		sc.close();
	}
}
