import java.util.Scanner;

public class Uni6Exe08 {
    private int n;
    private double[] vetor;

    public static void main(String[] args) {
        new Uni6Exe08();
    }

    private Uni6Exe08() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor (máximo 20): ");
        n = sc.nextInt();

        while (n <= 0 || n > 20) {
            System.out.print("Valor inválido! Informe um valor entre 1 e 20: ");
            n = sc.nextInt();
        }

        vetor = new double[n];

        lerValores(sc);
        contarFrequencia();

        sc.close();
    }

    private void lerValores(Scanner sc) {
        System.out.println("Informe os valores reais:");
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = sc.nextDouble();
        }
    }

    private void contarFrequencia() {
        boolean[] contado = new boolean[n];

        System.out.println("\nValor\tFrequencia");

        for (int i = 0; i < n; i++) {
            if (!contado[i]) {
                int cont = 1;
                for (int j = i + 1; j < n; j++) {
                    if (vetor[i] == vetor[j]) {
                        cont++;
                        contado[j] = true;
                    }
                }
                System.out.printf("%.2f\t%d\n", vetor[i], cont);
            }
        }
    }
}
