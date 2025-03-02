import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df_2 = new DecimalFormat("0.00");
		String nome = "";
		int numHoras = 0, numDependentes = 0;
		double salarioTrabalhador = 0.0f, salarioDependentes = 0.0f, salarioBruto = 0.0f, salarioLiquido = 0.0f, descontoInss = 0.0f, descontoIR = 0.0f;

		System.out.println("Informe o nome: ");
		nome = sc.next();
		System.out.println("Informe o numero de horas trabalhadas: ");
		numHoras = sc.nextInt();
		System.out.println("Informe o numero de dependentes: ");
		numDependentes = sc.nextInt();
		salarioTrabalhador = numHoras * 10;
		salarioDependentes = numDependentes * 60;
		salarioBruto = salarioDependentes + salarioTrabalhador;
		descontoInss = salarioTrabalhador * 0.085;
		descontoIR = salarioTrabalhador * 0.05;
		salarioLiquido = salarioBruto - (descontoInss + descontoIR);

		System.out.println("Nome: "+nome);
		System.out.println("Salario Bruto: R$ "+df_2.format(salarioBruto));
		System.out.println("Salario Liquido: R$ "+df_2.format(salarioLiquido));
		sc.close();
	}
}
