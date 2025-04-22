import java.util.Scanner;

public class Uni5Exe31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0, divisor = 0;

        System.out.print("Digite um número inteiro positivo: ");
        numero = sc.nextInt();

        System.out.println("número\tdecomposição");

        divisor = 2;

        while (numero > 1) {
            if (numero % divisor == 0) {
                System.out.println(numero + "\t" + divisor);
                numero = numero / divisor;
            } else {
                divisor++;
            }
        }

        System.out.println("1\t");
        sc.close();
	}
}
