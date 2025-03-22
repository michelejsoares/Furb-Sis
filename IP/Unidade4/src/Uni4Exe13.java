import java.util.Scanner;

public class Uni4Exe13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int carta1 = 0, carta2 = 0, carta3 = 0, qtdCartasBoas = 0;
		carta1 = sc.nextInt();
		carta2 = sc.nextInt();
		carta3 = sc.nextInt();
		qtdCartasBoas = contarBoas(carta1, carta2, carta3);
		if(qtdCartasBoas == 1){
			System.out.println("TRUCO");
		}else if(qtdCartasBoas == 2){
			System.out.println("SEIS");
		}else if(qtdCartasBoas == 3){
			System.out.println("NOVE");
		}else{
			System.out.println("-");
		}
		sc.close();
	}
	public static int contarBoas(int c1, int c2, int c3) {
        int count = 0;
        int[] cartas = {c1, c2, c3};
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i] == 1 || cartas[i] == 2 || cartas[i] == 3) {
                count++;
            }
        }
        return count;
    }
}
