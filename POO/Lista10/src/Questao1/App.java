package Questao1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figura figura = null;
        System.out.println("Escolha o tipo de figura geométrica:");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Triângulo");
        System.out.println("4 - Círculo");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.print("Digite o lado do quadrado: ");
                double lado = sc.nextDouble();
                figura = new Quadrado(lado);
                break;
            case 2:
                System.out.print("Digite a altura do retângulo: ");
                double altura = sc.nextDouble();
                System.out.print("Digite a largura do retângulo: ");
                double largura = sc.nextDouble();
                figura = new Retangulo(altura, largura);
                break;
            case 3:
                System.out.print("Digite o lado 1 do triângulo: ");
                double lado1 = sc.nextDouble();
                System.out.print("Digite o lado 2 do triângulo: ");
                double lado2 = sc.nextDouble();
                System.out.print("Digite o lado 3 do triângulo: ");
                double lado3 = sc.nextDouble();
                figura = new Triangulo(lado1, lado2, lado3);
                break;
            case 4:
                System.out.print("Digite o raio do círculo: ");
                double raio = sc.nextDouble();
                figura = new Circulo(raio);
                break;

            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }

        System.out.printf("A área da figura é: %.2f\n", figura.calcularArea());
        sc.close();
    }
}