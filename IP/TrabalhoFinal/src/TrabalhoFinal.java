import java.util.Random;
import java.util.Scanner;

public class TrabalhoFinal {

    public static void main(String[] args) {
        new TrabalhoFinal();
    }
    private TrabalhoFinal(){
        iniciarJogo();
    }
    private void iniciarJogo() {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        String[][] mapa = new String[8][8];
        String[][] navios = new String[8][8];
        int[][] naviosCoordenadas = new int[10][2];

        int qtdJogadas = 10;
        int qtdAcertos = 0;

        mapa = inicializarMapa(mapa);
        naviosCoordenadas = posicionarNavios(navios, gerador);

        while (qtdJogadas > 0 && qtdAcertos < 10) {
            imprimirMapa(mapa);
            System.out.println("Jogadas restantes: " + qtdJogadas);
            int[] coordenadas = lerCoordenadas(sc);

            int linha = coordenadas[0];
            int coluna = coordenadas[1];

            if (verificaCoordenadas(linha, coluna)) {
                if (!mapa[linha][coluna].equals("~")) {
                    System.out.println("Você já atacou essa posição. Tente novamente.");
                    continue;
                }

                if (verificaNavio(naviosCoordenadas, linha, coluna)) {
                    mapa[linha][coluna] = "A";
                    qtdAcertos++;
                    System.out.println("Você acertou um navio!");
                } else {
                    mapa[linha][coluna] = "X";
                    System.out.println("Você errou.");
                }

                qtdJogadas--;
            } else {
                qtdJogadas--; // perde a jogada mesmo com coordenada inválida
            }
        }

        exibirResultadoFinal(mapa, navios, qtdAcertos);
        sc.close();
    }

    private String[][] inicializarMapa(String[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = "~";
            }
        }
        return mapa;
    }

    private int[][] posicionarNavios(String[][] navios, Random gerador) {
        int[][] coordenadas = new int[10][2];
        for (int i = 0; i < 10; i++) {
            int linha, coluna;
            do {
                linha = gerador.nextInt(8);
                coluna = gerador.nextInt(8);
            } while (navios[linha][coluna] != null);

            navios[linha][coluna] = "N";
            coordenadas[i][0] = linha;
            coordenadas[i][1] = coluna;

            // Para debug:
            // System.out.println("Navio " + (i + 1) + " em: " + linha + ", " + coluna);
        }

        return coordenadas;
    }

    private int[] lerCoordenadas(Scanner sc) {
        System.out.print("Digite as coordenadas para atacar (linha e coluna): ");
        int linha = sc.nextInt();
        int coluna = sc.nextInt();
        return new int[]{linha, coluna};
    }

    private boolean verificaCoordenadas(int linha, int coluna) {
        boolean valido = true;
        if (linha < 0 || linha >= 8) {
            System.out.println("Linha fora do mapa, você perdeu uma jogada.");
            valido = false;
        }
        if (coluna < 0 || coluna >= 8) {
            System.out.println("Coluna fora do mapa, você perdeu uma jogada.");
            valido = false;
        }
        return valido;
    }

    private boolean verificaNavio(int[][] naviosCoordenadas, int linha, int coluna) {
        for (int[] coordenada : naviosCoordenadas) {
            if (coordenada[0] == linha && coordenada[1] == coluna) {
                return true;
            }
        }
        return false;
    }

    private void imprimirMapa(String[][] mapa) {
        System.out.println("\n  0 1 2 3 4 5 6 7");
        for (int i = 0; i < mapa.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print((mapa[i][j] == null ? "~" : mapa[i][j]) + " ");
            }
            System.out.println();
        }
    }

    private void exibirResultadoFinal(String[][] mapa, String[][] navios, int qtdAcertos) {
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
}
