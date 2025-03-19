import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado1 = 0, lado2 = 0, lado3 = 0;
        lado1 = sc.nextInt();
        lado2 = sc.nextInt();
        lado3 = sc.nextInt();
        if(lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado3)){
            System.out.println("Não formam um triangulo.");
        }
        sc.close();
    }
}
