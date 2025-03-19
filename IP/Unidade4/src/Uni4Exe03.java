import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        int valor1 = 0, valor2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor 1: ");
        valor1 = sc.nextInt();
        System.out.println("Valor 2: ");
        valor2 = sc.nextInt();
        if(valor1 > valor2){
            System.out.println("O valor "+valor1+" é maior que o valor "+valor2);
        }else{
            System.out.println("O valor "+valor2+" é maior que o valor "+valor1);
        }
        sc.close();
    }
}
