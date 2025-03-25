import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcao, maiuscula;
        int base = 0, altura = 0, lado = 0, b = 0, h = 0, r = 0;
        double area;
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.println("'T': calcular a área de um triângulo de base b e altura h");
        System.out.println("'Q': calcular a área de um quadrado de lado l");
        System.out.println("'R': calcular a área de um retângulo de base b e altura h");
        System.out.println("'C': calcular a área de um círculo de raio r");
        opcao = sc.next().charAt(0);
        maiuscula = Character.toUpperCase(opcao);
        switch (maiuscula) {
            case 'T':
                System.out.println("Digite a base e altura do triangulo: ");
                base = sc.nextInt();
                altura = sc.nextInt();
                area = base * (altura / 2);
                System.out.println("Area do triangulo: "+area);
                break;
            case 'Q':
                System.out.println("Digite o lado: ");
                lado = sc.nextInt();
                area = lado * lado;
                System.out.println("Area do quadrado: "+area);
                break;
            case 'R':
                System.out.println("Digite a base e a altura do retangulo: ");
                b = sc.nextInt();
                h = sc.nextInt();
                area = b * h;
                System.out.println("Area do retangulo: "+area);
                break;
            case 'C':
                System.out.println("Digite o raio: ");
                r = sc.nextInt();
                area = Math.PI * Math.pow(r, 2);
                System.out.println("Area do circulo: "+df_2.format(area));
                break;
            default:
                break;
        }
        sc.close();
    }
}
