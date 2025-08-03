import java.util.Random;
import java.util.Scanner;

public class TrabalhoFinal_entrega {

    public static void main(String[] args) {
        new TrabalhoFinal_entrega(); //Chama a classe iniciando o jogo
    }

    private TrabalhoFinal_entrega() {
        iniciarJogo(); //Chama o método principal que executa o jogo
    }

    private void iniciarJogo() {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        //Mapa para o jogador
        String[][] mapa = new String[8][8];
        //Mapa com as posições dos navios
        String[][] navios = new String[8][8];
        //Vetor para guardar coordenadas dos navios
        int[][] naviosCoordenadas = new int[10][2];

        int qtdJogadas = 30;
        int qtdAcertos = 0;

        mapa = inicializarMapa(mapa); //Preenche o mapa com ~
        naviosCoordenadas = posicionarNavios(navios, gerador); //Posiciona navios aleatoriamente

        //Loop principal do jogo
        while (qtdJogadas > 0 && qtdAcertos < 10) {
            imprimirMapa(mapa);
            System.out.println("Jogadas restantes: " + qtdJogadas);
            int[] coordenadas = lerCoordenadas(sc); //Lê entrada do jogador

            int linha = coordenadas[0];
            int coluna = coordenadas[1];

            if (verificaCoordenadas(linha, coluna)) {
                //Verifica se a posição já foi jogada
                if (!mapa[linha][coluna].equals("~")) {
                    System.out.println("Você já atacou essa posição. Tente novamente.");
                    continue;
                }

                //Verifica se há navio na posição
                if (verificaNavio(naviosCoordenadas, linha, coluna)) {
                    mapa[linha][coluna] = "A"; //Acerto
                    qtdAcertos++;
                    System.out.println("Você acertou um navio!");
                } else {
                    mapa[linha][coluna] = "X"; //Erro
                    System.out.println("Você errou.");
                }

                qtdJogadas--;
            } else {
                //Coordenadas inválidas: perde a jogada mesmo assim
                qtdJogadas--;
            }
        }

        exibirResultadoFinal(mapa, navios, qtdAcertos); //Exibe resultado final
        sc.close();
    }

    //Inicializa o mapa com o símbolo "~" indicando posição não jogada
    private String[][] inicializarMapa(String[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = "~";
            }
        }
        return mapa;
    }

    //Posiciona 10 navios aleatoriamente no tabuleiro e salva suas coordenadas
    private int[][] posicionarNavios(String[][] navios, Random gerador) {
        int[][] coordenadas = new int[10][2];
        for (int i = 0; i < 10; i++) {
            int linha, coluna;
            do {
                linha = gerador.nextInt(8);
                coluna = gerador.nextInt(8);
            } while (navios[linha][coluna] != null); //Garante que não haja repetição

            navios[linha][coluna] = "N";
            coordenadas[i][0] = linha;
            coordenadas[i][1] = coluna;
            System.out.println("Navio " + (i + 1) + " em: " + linha + ", " + coluna);
        }
        return coordenadas;
    }

    //Lê do jogador as coordenadas para o ataque
    private int[] lerCoordenadas(Scanner sc) {
        System.out.print("Digite as coordenadas para atacar (linha e coluna): ");
        int linha = sc.nextInt();
        int coluna = sc.nextInt();
        return new int[]{linha, coluna};
    }

    //Verifica se as coordenadas estão dentro dos limites do mapa
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

    //Verifica se há um navio nas coordenadas fornecidas
    private boolean verificaNavio(int[][] naviosCoordenadas, int linha, int coluna) {
        for (int[] coordenada : naviosCoordenadas) {
            if (coordenada[0] == linha && coordenada[1] == coluna) {
                return true;
            }
        }
        return false;
    }

    //Imprime o mapa atual no console
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

    //Exibe o resultado final do jogo e os dois mapas (jogadas e navios)
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