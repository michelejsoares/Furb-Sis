import java.util.Scanner;

public class Uni3Exe15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = 0, Y = 0, Z = 0, valor = 0;
		valor = sc.nextInt();
		X = valor / 100;
		Y = (valor % 100) / 10;
		Z = valor % 10;
		System.out.println(X+" centena(s) "+Y+" dezena(s) "+Z+" unidade(s)");
		sc.close();
	}
}
