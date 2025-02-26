import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1 = 0;
        int valor2 = 0;
        int soma = 0;

        System.out.println("Digite o primeiro valor: ");
        valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor2 = sc.nextInt();

        soma = valor1 + valor2;

        System.out.println("Soma: "+soma);

        sc.close();
    }
}
