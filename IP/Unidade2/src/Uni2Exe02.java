import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1 = 0;
        int valor2 = 0;
        int resultado = 0;

        System.out.println("Digite o primeiro valor: ");
        valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor2 = sc.nextInt();


        resultado = valor1 * valor2;

        System.out.println("Resultado: "+resultado);

        sc.close();
    }
}
