import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random gerador = new Random();
        int linha, coluna;
        for(int i = 0; i < 10; i++){
            linha = gerador.nextInt(7);
            coluna = gerador.nextInt(7);
            System.out.println(linha + " "+ coluna);
        }
    }
}
