import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14159f;
        float r = 0;
        double area = 0;

        System.out.println("Informe o raio:");
        r = sc.nextFloat();
        area = pi * Math.pow(r, 2);
        System.out.println("A area é: "+area);
        
        sc.close();
    }
}
