import java.util.Scanner;

public class Uni5Exe12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, numero = 1;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numero + " ");
                numero++;
            }
            System.out.println();
        }
		sc.close();
	}
}
