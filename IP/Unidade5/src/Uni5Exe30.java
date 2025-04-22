import java.util.Scanner;

public class Uni5Exe30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, k = 0, m = 0, atual = 0, somaDentro = 0, somaFora = 0;
		String elementos = "", entrou = "", fora = "";
        System.out.print("Informe o valor de N (início da sequência): ");
        n = sc.nextInt();

        System.out.print("Informe o valor de K (decremento): ");
        k = sc.nextInt();

        System.out.print("Informe o tamanho da mochila (M): ");
        m = sc.nextInt();

		atual = n;
        while (atual > 0) {
            elementos += atual + " ";
            if (somaDentro + atual <= m) {
                entrou += atual + " ";
                somaDentro += atual;
            } else {
                fora += atual + " ";
                somaFora += atual;
            }
            atual -= k;
        }

        System.out.println("Elementos que serão colocados na mochila: " + elementos);
        System.out.println("Elementos que entraram na mochila: " + entrou);
        System.out.println("Elementos que ficaram fora da mochila: " + fora);
        System.out.println("Soma dos que entraram: " + somaDentro);
        System.out.println("Soma dos que ficaram fora: " + somaFora);

        sc.close();
	}
}
