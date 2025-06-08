import java.util.Random;
import java.util.Scanner;

public class TrabalhoFinal {
    public static void main(String[] args) {
        new TrabalhoFinal();
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        String[][] mapa = new String[8][8];
        String[][] navios = new String[8][8];
        int[][] naviosCoordenadas = new int[10][2];
        int qtdJogadas = 4;

        // Inicializa o mapa do jogador
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = "~";
            }
        }

        // Posiciona os navios aleatoriamente
        for (int i = 0; i < 10; i++) {
            int linha, coluna;
            do {
                linha = gerador.nextInt(8);
                coluna = gerador.nextInt(8);
            } while (navios[linha][coluna] != null);

            naviosCoordenadas[i][0] = linha;
            naviosCoordenadas[i][1] = coluna;
            navios[linha][coluna] = "N";

            // Descomente a linha abaixo para ver onde os navios estão durante o jogo
            // System.out.println("Navio " + (i + 1) + " em: " + linha + ", " + coluna);
        }

        int qtdAcertos = 0;

        while (qtdJogadas > 0 && qtdAcertos < 10) {
            imprimirMapa(mapa);

            System.out.println("Jogadas restantes: " + qtdJogadas);
            System.out.print("Digite as coordenadas para atacar (linha e coluna): ");
            int linhaUsuario = sc.nextInt();
            int colunaUsuario = sc.nextInt();

            if (verificaCoordenadas(linhaUsuario, colunaUsuario)) {
                if (!mapa[linhaUsuario][colunaUsuario].equals("~")) {
                    System.out.println("Você já atacou essa posição. Tente novamente.");
                    continue;
                }

                String cRetorno = verificaNavio(naviosCoordenadas, linhaUsuario, colunaUsuario);

                if (cRetorno.equals("A")) {
                    mapa[linhaUsuario][colunaUsuario] = "A";
                    qtdAcertos++;
                    System.out.println("Você acertou um navio!");
                } else {
                    mapa[linhaUsuario][colunaUsuario] = "X";
                    System.out.println("Você errou.");
                }

                qtdJogadas--;
            } else {
                qtdJogadas--; // perde a jogada mesmo com erro de coordenada
            }
        }

        sc.close();

        // Resultado final
        System.out.println("\n=== FIM DE JOGO ===");
        if (qtdAcertos == 10) {
            System.out.println("Parabéns! Você afundou todos os navios!");
        } else {
            System.out.println("Você perdeu! Nem todos os navios foram encontrados.");
        }

        System.out.println("\nMapa com seus acertos (A) e erros (X):");
        imprimirMapa(mapa);

        System.out.println("\nMapa dos navios reais (N):");
        imprimirMapa(navios);
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
                return "A";
            }
        }
        return "X";
    }

    private static void imprimirMapa(String[][] mapa) {
        System.out.println("\n  0 1 2 3 4 5 6 7");
        for (int i = 0; i < mapa.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == null) {
                    System.out.print("~ ");
                } else {
                    System.out.print(mapa[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
