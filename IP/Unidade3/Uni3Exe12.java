import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        int qtdHorasTrabalhadas = 0, numDependentes = 0;
        double totalHora = 0.0, totalDependentes;

        System.out.println("Nome: ");
        nome = sc.next();
        System.out.println("Quantidade de horas trabalhadas no mês:");
        qtdHorasTrabalhadas = sc.nextInt();
        System.out.println("Número de dependentes:");
        numDependentes = sc.nextInt();

        totalHora = qtdHorasTrabalhadas * 10;
        totalDependentes = numDependentes * 60;
        
        sc.close();
    }
}
