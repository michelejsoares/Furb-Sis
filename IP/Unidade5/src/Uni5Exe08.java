import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, somaPositivos = 0, contPositivos = 0, numero = 0;
        Integer menorNegativo = null;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numero = sc.nextInt();
            if (numero < 0) {
                if (menorNegativo == null || numero < menorNegativo) {
                    menorNegativo = numero;
                }
            } else if (numero > 0) {
                somaPositivos += numero;
                contPositivos++;
            }
        }

        if (menorNegativo != null) {
            System.out.println("Menor valor negativo: " + menorNegativo);
        } else {
            System.out.println("Não houve números negativos.");
        }

        if (contPositivos > 0) {
            double media = (double) somaPositivos / contPositivos;
            System.out.println("Média dos números positivos: " + media);
        } else {
            System.out.println("Não houve números positivos.");
        }
        sc.close();
    }
}
