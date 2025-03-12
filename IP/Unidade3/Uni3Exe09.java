import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        int raio = 0, altura = 0;
        float pi = 3.14159f;
        double volume = 0.0;
        System.out.println("Raio:");
        raio = sc.nextInt();
        System.out.println("Altura:");
        altura = sc.nextInt();
        volume = pi * Math.pow(raio, 2) * altura;
        System.out.println("O volume da lata de óleo é: "+df_2.format(volume));
        sc.close();
    }
}
