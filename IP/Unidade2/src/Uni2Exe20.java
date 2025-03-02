import java.util.Scanner;

public class Uni2Exe20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o número de dobras (sempre par): ");
        int dobras = sc.nextInt();

        // Verifica se o número é par
        if (dobras % 2 != 0) {
            System.out.println("O número de dobras deve ser par!");
        } else {
            // Cálculo da quantidade de quadrados
            int quadrados = (int) Math.pow(4, dobras / 2);
            System.out.println("Quantidade de quadrados visíveis: " + quadrados);
        }
		sc.close();
	}
}
