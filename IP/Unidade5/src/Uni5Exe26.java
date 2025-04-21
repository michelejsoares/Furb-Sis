import java.util.Scanner;

public class Uni5Exe26 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double valorMaximo = 0.0, pedagio = 0.0;
		int trechosAcimaValor = 0, totalTrechos = 0, trechosAceitosAcima150km = 0, distancia = 0;
        System.out.print("Valor máximo de pedágio: R$ ");
        valorMaximo = sc.nextDouble();

		while (true) {
            System.out.print("Valor do pedágio (digite valor negativo para encerrar): R$ ");
            pedagio = sc.nextDouble();
            if (pedagio < 0) {
                break;
            }
            System.out.print("Distância do trecho (em km): ");
            distancia = sc.nextInt();

            totalTrechos++;

            if (pedagio > valorMaximo) {
                trechosAcimaValor++;
            } else {
                if (distancia > 150) {
                    trechosAceitosAcima150km++;
                }
            }
        }
        System.out.println(trechosAcimaValor + " (trechos com valor acima do qual ele nega-se a pagar)");
        System.out.println(totalTrechos + " (quantidade de trechos informados)");
        System.out.println(trechosAceitosAcima150km + " (trechos acima de 150km com valor aceito por ele)");

        sc.close();
	}
}
