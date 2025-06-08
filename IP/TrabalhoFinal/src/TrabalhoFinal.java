import java.util.Random;
import java.util.Scanner;

public class TrabalhoFinal {
    public static void main(String[] args) {
        new TrabalhoFinal();
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        String[][] mapa = new String[8][8];
        String[][] navios = new String[10][10];
        int[][] naviosCoordenadas = new int[10][2];
        int qtdJogadas = 4;

        // Inicializa o mapa com "~"
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = "~";
            }
        }

        // Gera navios em posições aleatórias (sem repetir)
        for (int i = 0; i < 10; i++) {
            int linha, coluna;
            do {
                linha = gerador.nextInt(8);
                coluna = gerador.nextInt(8);
            } while (navios[linha][coluna] != null); // já tem navio

            naviosCoordenadas[i][0] = linha;
            naviosCoordenadas[i][1] = coluna;
            navios[linha][coluna] = "N";

            // DEBUG: Mostrar posições dos navios
            System.out.println("Navio " + (i + 1) + " em: " + linha + ", " + coluna);
        }

        // Laço principal do jogo
        while (qtdJogadas > 0) {
            imprimirMapa(mapa);

            System.out.println("Jogadas restantes: " + qtdJogadas);
            System.out.print("Digite as coordenadas para atacar (linha e coluna): ");
            int linhaUsuario = sc.nextInt();
            int colunaUsuario = sc.nextInt();

            if (verificaCoordenadas(linhaUsuario, colunaUsuario)) {
                String cRetorno = verificaNavio(naviosCoordenadas, linhaUsuario, colunaUsuario);

                if (cRetorno.equals("A")) {
                    mapa[linhaUsuario][colunaUsuario] = "A";
                    System.out.println("Você acertou um navio!");
                } else {
                    mapa[linhaUsuario][colunaUsuario] = "X";
                    System.out.println("Você errou.");
                }
            }

            qtdJogadas--;
        }

        System.out.println("\nFim de jogo!");
        sc.close();
    }

    private static boolean verificaCoordenadas(int linhaUsuario, int colunaUsuario) {
        boolean lRetorno = true;
        if (linhaUsuario < 0 || linhaUsuario >= 8) {
            System.out.println("Linha fora do mapa, você perdeu uma jogada.");
            lRetorno = false;
        }
        if (colunaUsuario < 0 || colunaUsuario >= 8) {
            System.out.println("Coluna fora do mapa, você perdeu uma jogada.");
            lRetorno = false;
        }
        return lRetorno;
    }

    private static String verificaNavio(int[][] naviosCoordenadas, int linhaUsuario, int colunaUsuario) {
        for (int i = 0; i < naviosCoordenadas.length; i++) {
            if (naviosCoordenadas[i][0] == linhaUsuario && naviosCoordenadas[i][1] == colunaUsuario) {
                return "A"; // Acertou
            }
        }
        return "X"; // Errou
    }

    private static void imprimirMapa(String[][] mapa) {
        System.out.println("\nMapa Atual:");
        System.out.print("  ");
        for (int i = 0; i < mapa[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < mapa.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
