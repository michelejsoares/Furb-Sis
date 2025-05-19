import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        new Uni6Exe06();
    }

    private Uni6Exe06() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = sc.nextInt();

        if (n > 0) {
            double[] vetor = lerVetor(sc, n);

            System.out.print("Informe um valor para buscar: ");
            double valorBusca = sc.nextDouble();

            if (existeValor(vetor, valorBusca)) {
                System.out.println("Valor encontrado no vetor.");
            } else {
                System.out.println("Valor não encontrado no vetor.");
            }

        } else {
            System.out.println("Informe um valor maior que 0.");
        }

        sc.close();
    }

    private double[] lerVetor(Scanner sc, int n) {
        double[] vetor = new double[n];
        System.out.println("Informe os valores reais:");
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
        }
        return vetor;
    }

    private boolean existeValor(double[] vetor, double valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }
}
