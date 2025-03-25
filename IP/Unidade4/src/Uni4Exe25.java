import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1 = 0, valor2 = 0, opcao = 0;
        double valorOperacao = 0;
        System.out.println("Valor 1: ");
        valor1 = sc.nextInt();
        System.out.println("Valor 2: ");
        valor2 = sc.nextInt();
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero)");
        opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                valorOperacao = valor1 + valor2;
                System.out.println(valorOperacao);
                break;
            case 2: 
                valorOperacao = valor1 - valor2;
                System.out.println(valorOperacao);
                break;
            case 3: 
                valorOperacao = valor1 * valor2;
                System.out.println(valorOperacao);
                break;
            case 4: 
                if(valor1 != 0 && valor2 != 0){
                    valorOperacao = valor1 / valor2;
                    System.out.println(valorOperacao);
                }
                break;
            default:
                break;
        }
        sc.close();
    }
}
