import java.util.Scanner;

public class Uni6Exe05 {

    private int[] respostasR = new int[5];
    private int[] respostasM = new int[5];
    private int somaI = 0;
    private String[] perguntas = new String[5];
    private Scanner sc;

    public static void main(String[] args) {
        new Uni6Exe05();
    }

    private Uni6Exe05() {
        sc = new Scanner(System.in);
        perguntas();
        lerRespostas(respostasR, "Rapaz");
        lerRespostas(respostasM, "Moça");
        calcularAfinidade();
        mostrarResultado();
        sc.close();
    }

    private void perguntas() {
        perguntas[0] = "Gosta de música sertaneja?";
        perguntas[1] = "Gosta de futebol?";
        perguntas[2] = "Gosta de seriados?";
        perguntas[3] = "Gosta de redes sociais?";
        perguntas[4] = "Gosta da Oktoberfest?";
    }

    private void lerRespostas(int[] respostas, String pessoa) {
        System.out.println("Respostas de " + pessoa + ":");
        for (int i = 0; i < perguntas.length; i++) {
            int resp = 0;
            while (resp < 1 || resp > 3) {
                System.out.println(perguntas[i] + " (1 - SIM; 2 - NÃO; 3 - IND)");
                resp = sc.nextInt();
                if (resp < 1 || resp > 3) {
                    System.out.println("Resposta inválida. Tente novamente.");
                }
            }
            respostas[i] = resp;
        }
    }

    private void calcularAfinidade() {
        for (int i = 0; i < perguntas.length; i++) {
            int r = respostasR[i];
            int m = respostasM[i];

            if (r == m) {
                somaI += 3;
            } else if (r == 3 || m == 3) {
                somaI += 1;
            } else if ((r == 1 && m == 2) || (r == 2 && m == 1)) {
                somaI -= 2;
            }
        }
    }

    private void mostrarResultado() {
        System.out.println("\nÍndice de afinidade: " + somaI);
        if (somaI == 15) {
            System.out.println("Casem!");
        } else if (somaI >= 10 && somaI <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (somaI >= 5 && somaI <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (somaI >= 0 && somaI <= 4) {
            System.out.println("Vale um encontro.");
        } else if (somaI >= -9 && somaI <= -1) {
            System.out.println("Melhor não perder tempo.");
        } else if (somaI <= -10) {
            System.out.println("Vocês se odeiam!");
        }
    }
}
