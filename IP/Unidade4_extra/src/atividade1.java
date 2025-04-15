import java.util.Scanner;

public class atividade1 {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
        int A = 0, B = 0, C = 0, D = 0, somaAB = 0, somaCD = 0, restoA = 0;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        restoA = A % 2;
        somaAB = A + B;
        somaCD = C + D;
        if((B > C && D > A) && (somaCD > somaAB) && (C > 0 && D > 0) && restoA == 0){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
        sc.close();
	}
}
