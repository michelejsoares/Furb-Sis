import java.util.Scanner;

public class Uni5Exe20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double massaInicialKg = 0.0, massa = 0.0, tempo = 0.0, meiaVida = 0.0, massaFinal = 0.0;

        System.out.print("Digite a massa inicial (em Kg): ");
        massaInicialKg = sc.nextDouble();

        massa = massaInicialKg * 1000;
        tempo = 0;
        meiaVida = 50;

        while (massa >= 0.5) {
            massa = massa / 2;
            tempo += meiaVida;
        }

        massaFinal = massa;

        System.out.printf("Massa inicial: %.2f Kg\n", massaInicialKg);
        System.out.printf("Massa final: %.6f g\n", massaFinal);
        System.out.printf("Tempo necessário: %.0f segundos\n", tempo);

		sc.close();
	}
}
