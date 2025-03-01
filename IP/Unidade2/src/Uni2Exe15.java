import java.util.Scanner;

public class Uni2Exe15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        double valor = sc.nextDouble();

        int centavos = (int) Math.round(valor * 100);

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            int quantidade = centavos / notas[i];
            centavos %= notas[i];
            System.out.println(quantidade + " nota(s) de R$ " + (notas[i] / 100.0));
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length; i++) {
            int quantidade = centavos / moedas[i];
            centavos %= moedas[i];
            System.out.println(quantidade + " moeda(s) de R$ " + (moedas[i] / 100.0));
        }

        sc.close();
	}
}
