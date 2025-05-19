import java.util.Scanner;

public class Uni6Exe09 {
    private final int TOTAL = 4;
    private int[] sexo = new int[TOTAL];
    private int[] nota = new int[TOTAL];
    private int[] idade = new int[TOTAL];

    public static void main(String[] args) {
        new Uni6Exe09();
    }

    private Uni6Exe09() {
        lerDados();
        double mediaGeral = calcularMediaGeral();
        double mediaHomens = calcularMediaHomens();
        int notaMulherMaisJovem = notaMulherMaisJovem();
        int mulheresAcima50 = mulheres50MaisQueMedia(mediaGeral);

        System.out.printf("\nNota média geral: %.2f\n", mediaGeral);
        System.out.printf("Nota média dos homens: %.2f\n", mediaHomens);
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Mulheres com mais de 50 anos que deram nota acima da média: " + mulheresAcima50);
    }

    private void lerDados() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < TOTAL; i++) {
            System.out.println("\nCliente " + (i + 1));
            
            do {
                System.out.print("Sexo (1=feminino, 2=masculino): ");
                sexo[i] = sc.nextInt();
            } while (sexo[i] != 1 && sexo[i] != 2);

            do {
                System.out.print("Nota (0 a 10): ");
                nota[i] = sc.nextInt();
            } while (nota[i] < 0 || nota[i] > 10);

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        sc.close();
    }

    private double calcularMediaGeral() {
        int soma = 0;
        for (int i = 0; i < TOTAL; i++) {
            soma += nota[i];
        }
        return (double) soma / TOTAL;
    }

    private double calcularMediaHomens() {
        int soma = 0;
        int cont = 0;
        for (int i = 0; i < TOTAL; i++) {
            if (sexo[i] == 2) {
                soma += nota[i];
                cont++;
            }
        }
        return cont > 0 ? (double) soma / cont : 0.0;
    }

    private int notaMulherMaisJovem() {
        int menorIdade = Integer.MAX_VALUE;
        int notaMaisJovem = -1;

        for (int i = 0; i < TOTAL; i++) {
            if (sexo[i] == 1 && idade[i] < menorIdade) {
                menorIdade = idade[i];
                notaMaisJovem = nota[i];
            }
        }

        return notaMaisJovem;
    }

    private int mulheres50MaisQueMedia(double media) {
        int cont = 0;
        for (int i = 0; i < TOTAL; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > media) {
                cont++;
            }
        }
        return cont;
    }
}
