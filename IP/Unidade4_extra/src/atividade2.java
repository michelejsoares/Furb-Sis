import java.util.Scanner;

public class atividade2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor = 0.0;
		valor = sc.nextDouble();
		if (valor >= 0.00000 && valor <= 25.00000) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25.00000 && valor <= 50.00000) {
            System.out.println("Intervalo (25,50]");
        } else if (valor > 50.00000 && valor <= 75.00000) {
            System.out.println("Intervalo (50,75]");
        } else if (valor > 75.00000 && valor <= 100.00000) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

		sc.close();
	}
}
