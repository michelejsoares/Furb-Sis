import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        int numeroFuncionario = 0;
        int numeroHoras = 0;
        int valorHora = 0;
        int salario = 0;

        System.out.println("Numero funcionario: ");
        numeroFuncionario = sc.nextInt();
        System.out.println("Numero Horas: ");
        numeroHoras = sc.nextInt();
        System.out.println("Valor Horas: ");
        valorHora = sc.nextInt();
        
        salario = numeroHoras * valorHora;

        System.out.println("O Numero do funcionario é: "+numeroFuncionario+" e o Salario recebido é: "+df_2.format(salario));

        sc.close();
    }
}
