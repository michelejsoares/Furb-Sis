import java.util.Scanner;

public class Uni3Exe01 {
	public static void main(String[] args) {
		int comprimento = 0, largura = 0, area = 0;
		Scanner sc = new Scanner(System.in);
		comprimento = sc.nextInt();
		largura = sc.nextInt();
		area = comprimento * largura;
		System.out.println(area);
		sc.close();
	}
}
