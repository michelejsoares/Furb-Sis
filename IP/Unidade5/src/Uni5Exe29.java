import java.util.Scanner;

public class Uni5Exe29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;

        while (true) {
            System.out.print("\nInforme o valor a ser sacado (0 para sair): ");
            valor = sc.nextInt();

            if (valor == 0) {
                break;
            }

            if (valor < 0) {
                System.out.println("Valor inválido! Digite um valor positivo.");
                continue;
            }

            int ced20 = valor / 20;
            valor = valor % 20;

            int ced10 = valor / 10;
            valor = valor % 10;

            int ced5 = valor / 5;
            valor = valor % 5;

            int ced2 = valor / 2;
            valor = valor % 2;

            int ced1 = valor;

            System.out.println("Cédulas fornecidas:");
            if (ced20 > 0) System.out.println("20: " + ced20);
            if (ced10 > 0) System.out.println("10: " + ced10);
            if (ced5 > 0) System.out.println("5: " + ced5);
            if (ced2 > 0) System.out.println("2: " + ced2);
            if (ced1 > 0) System.out.println("1: " + ced1);
        }

        sc.close();
	}
}
