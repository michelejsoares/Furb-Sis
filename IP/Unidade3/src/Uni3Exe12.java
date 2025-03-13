import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		DecimalFormat df_2 = new DecimalFormat("0.00");
		String nome = "";
		int numHoras = 0, numDependentes = 0;
		double salarioTrabalhador = 0.0f, salarioDependentes = 0.0f, salarioBruto = 0.0f, salarioLiquido = 0.0f, descontoInss = 0.0f, descontoIR = 0.0f;

		System.out.println("Nome: ");
		nome = sc.next();
		System.out.println("Quantidade de horas trabalhadas no mês: ");
		numHoras = sc.nextInt();
		System.out.println("Número de dependentes: ");
		numDependentes = sc.nextInt();
		salarioTrabalhador = numHoras * 10;
		salarioDependentes = numDependentes * 60;
		salarioBruto = salarioDependentes + salarioTrabalhador;
		descontoInss = salarioTrabalhador * 0.085;
		descontoIR = salarioTrabalhador * 0.05;
		salarioLiquido = salarioBruto - (descontoInss + descontoIR);
        System.out.println("O funcionário "+nome+" possui um salário bruto de R$"+df_2.format(salarioBruto)+" e um salário líquido de R$"+df_2.format(salarioLiquido));
		sc.close();
    }
}
