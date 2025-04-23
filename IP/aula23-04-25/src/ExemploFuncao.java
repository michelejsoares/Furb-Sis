import java.util.Scanner;

public class ExemploFuncao {
    public static void main(String[] args) {
        ExemploFuncao exemplo = new ExemploFuncao();
        Scanner sc = new Scanner(System.in);
        int total = somar(10,20);
        System.out.println("Total: "+total);
        total = somar(40, 70);
        System.out.println("Total: "+total);
        /*double a = 0.0, b = 0.0, totalDouble = 0.0;
        System.out.println("Informe o valor de a: ");
        a = sc.nextDouble();
        System.out.println("Informe o valor de b: ");
        b = sc.nextDouble();
        totalDouble = somarDouble(a, b);
        System.out.println("Total: "+totalDouble);*/
        System.out.println("Jogador: "+exemplo.jogadorDaVez(5));
        sc.close();
    }
    public static int somar(int a, int b){
        int soma = 0;
        soma = a + b;
        return soma;
    }
    public static double somarDouble(double a, double b ){
        double soma = 0.0;
        soma = a + b;
        return soma;
    }
    public String jogadorDaVez(int numeroJogada){
        if(numeroJogada %2 == 0){
            return "Jogador 2";
        }else{
            return "Jogador 1";
        }
    }
}
