import java.util.Random;
import java.util.Scanner;

public class TrabalhoFinal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        String[][] mapa = new String[8][8];
        int[][] navios = new int[8][8];
        int[] linha = new int[10];
        int[] coluna = new int[10];
        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa.length; j++){
                mapa[i][j] = "~";
            }
        }
        for(int i = 0; i < mapa.length; i++){
            if(i == 0){
                System.out.print("  ");
            }
            System.out.print(i + " ");
        }
        for(int i = 0; i < mapa.length; i++){
            if(i == 0){
                System.out.println();
                System.out.print(i + " ");
            }else{
                System.out.print(i + " ");
            }
            for(int j = 0; j < mapa.length; j++){

                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < 10; i++){
            linha[i] = gerador.nextInt(7);
            coluna[i] = gerador.nextInt(7);
            System.out.println(linha[i]+" "+coluna[i]);
        }
        
        for (int i = 0; i < navios.length; i++) {
            boolean encontrou = false;

            // Verifica se 'i' existe em qualquer posição de linha[]
            for (int j = 0; j < linha.length; j++) {
                if (linha[j] == i) {
                    encontrou = true;
                    break; // já achou, não precisa continuar
                }
            }

            if (encontrou) {
                System.out.println("Linha " + i + " é igual a algum valor em linha[]");
            } else {
                System.out.println("Linha " + i + " não está em linha[]");
            }
        }

        sc.close();
    }
}
