import java.util.Scanner;

public class Uni2Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorA = 0;
        int valorB = 0;
        int valorC = 0;
        int valorD = 0;
        int diferenca = 0;

        System.out.println("Valor A:");
        valorA = sc.nextInt();
        System.out.println("Valor B:");
        valorB = sc.nextInt();
        System.out.println("Valor C:");
        valorC = sc.nextInt();
        System.out.println("Valor D:");
        valorD = sc.nextInt();
        
        diferenca = ((valorA * valorB) - (valorC * valorD));
        System.out.println("Diferenca do produto: "+diferenca);


        sc.close();
    }
}
