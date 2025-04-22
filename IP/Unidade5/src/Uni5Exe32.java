import java.util.Scanner;

public class Uni5Exe32 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int p = 0, n = 0, diaDaSemana = 1;

        System.out.print("Digite o dia da semana do primeiro dia do mês (1=Domingo,...,7=Sábado): ");
        p = sc.nextInt();

        System.out.print("Digite o número de dias do mês: ");
        n = sc.nextInt();

        System.out.println("D\tS\tT\tQ\tQ\tS\tS");

        while (diaDaSemana < p) {
            System.out.print("\t");
            diaDaSemana++;
        }

        for (int dia = 1; dia <= n; dia++) {
            System.out.print(dia + "\t");

            if ((diaDaSemana) % 7 == 0) {
                System.out.println();
            }

            diaDaSemana++;
        }

        System.out.println();
        sc.close();
	}
}
