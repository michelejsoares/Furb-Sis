import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        String nomeVendedor = "";
        float salarioFixo = 0.0f;
        float totalVendas = 0.0f;
        float comissao = 0.15f;
        float totalSalario = 0.0f;

        System.out.println("Informe o nome do vendedor: ");
        nomeVendedor = sc.next();
        System.out.println("Informe o salario fixo do vendedor: ");
        salarioFixo = sc.nextFloat();
        System.out.println("Informe o total de vendas do vendedor: ");
        totalVendas = sc.nextFloat();

        totalSalario = ((totalVendas * comissao) + salarioFixo);
        System.out.println("Total do salario do vendedor "+nomeVendedor+" (Salario Fixo + Vendas): "+df_2.format(totalSalario));

        sc.close();
    }
}
