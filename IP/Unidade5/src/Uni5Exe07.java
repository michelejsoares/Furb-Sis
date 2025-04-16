import java.util.Scanner;

public class Uni5Exe07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
		double numero, numeroMaior, numeroMenor;
		n =  sc.nextInt();

        numero = sc.nextDouble();
        numeroMaior = numero;
        numeroMenor = numero;

        for (int i = 1; i < n; i++) {
            numero = sc.nextDouble();

            if (numero > numeroMaior) {
                numeroMaior = numero;
            }
            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }

        System.out.println("Maior número: " + numeroMaior);
        System.out.println("Menor número: " + numeroMenor);

		sc.close();
	}
}
