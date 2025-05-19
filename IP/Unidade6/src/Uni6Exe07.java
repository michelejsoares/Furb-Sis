import java.util.Scanner;

public class Uni6Exe07 {
    private int n;
    private int[] vetor;

    public static void main(String[] args) {
        new Uni6Exe07();
    }

    private Uni6Exe07() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor (máximo 20): ");
        n = sc.nextInt();

        while (n <= 0 || n > 20) {
            System.out.print("Valor inválido! Informe um valor entre 1 e 20: ");
            n = sc.nextInt();
        }

        vetor = new int[n];

        inserirValores(sc);
        ordenarVetor();
        mostrarVetor();

        sc.close();
    }

    private void inserirValores(Scanner sc) {
        int contador = 0;

        while (contador < n) {
            System.out.print("Informe um valor inteiro: ");
            int valor = sc.nextInt();

            if (!valorExiste(valor, contador)) {
                vetor[contador] = valor;
                contador++;
            } else {
                System.out.println("Valor já existe! Digite outro.");
            }
        }
    }

    private boolean valorExiste(int valor, int limite) {
        for (int i = 0; i < limite; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    private void ordenarVetor() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    private void mostrarVetor() {
        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        System.out.println();
    }
}
