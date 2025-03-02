import java.util.Scanner;

public class Uni2Exe19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0, B = 0, C = 0, D = 0;
		System.out.println("Informe o Valor de B: ");
		B = sc.nextInt();
		System.out.println("Informe o Valor de C: ");
		C = sc.nextInt();
		System.out.println("Informe o Valor de D: ");
		D = sc.nextInt();
		A = B;
		C = D;
		System.out.println("Valo de A: "+A);

		sc.close();
	}
}
