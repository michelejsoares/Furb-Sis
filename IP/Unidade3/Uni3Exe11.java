import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valorC = 0.0f;
        double valorF = 0.0f, multiplicacao = 0.0;
        valorC = sc.nextFloat();
        multiplicacao = (1.8 * valorC);
        valorF = multiplicacao + 32;
        System.out.println(valorF);
        sc.close();
    }
}
