import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Exemplo2 exemplo = new Exemplo2();
        Scanner sc = new Scanner(System.in);
        double n1  = 0.0, n2 = 0.0, n3 = 0.0, totalMultiplicacao = 0.0, totalDivisao = 0.0;
        System.out.println("Multiplicação:");
        System.out.print("n1 = ");
        n1 = sc.nextDouble();
        System.out.print("n2 = ");
        n2 = sc.nextDouble();
        System.out.print("n3 = ");
        n3 = sc.nextDouble();
        totalMultiplicacao = exemplo.multiplica(n1, n2, n3);
        System.out.println("Total Multiplicacao: "+totalMultiplicacao);
        System.out.println("Divisão: :");
        System.out.print("n1 = ");
        n1 = sc.nextDouble();
        System.out.print("n2 = ");
        n2 = sc.nextDouble();
        totalDivisao = exemplo.divide(n1, n2);
        System.out.println("Total Divisao: "+totalDivisao);
        sc.close();

    }
    public double multiplica(double n1, double n2, double n3){
        double total = 0.0;
        total = n1 * n2 * n3;
        return total;
    }

    public double divide(double n1, double n2){
        double total = 0.0;
        total = n1 / n2;
        return total;
    }
}