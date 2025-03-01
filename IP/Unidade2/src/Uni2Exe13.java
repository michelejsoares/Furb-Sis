import java.util.Scanner;

public class Uni2Exe13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distancia = 0;
		int tempo = 0;
		System.out.println("Informe a distacia: ");
		distancia = sc.nextInt();
		tempo = distancia * 2;
		System.out.println("Tempo: "+tempo+" min");

		sc.close();
	}
}
