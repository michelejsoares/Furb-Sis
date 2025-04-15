import java.util.Scanner;

public class Uni5Exe01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }
        }

		sc.close();
	}
}
