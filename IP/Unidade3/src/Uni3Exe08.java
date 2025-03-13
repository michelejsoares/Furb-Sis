import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        int qtdDolares = 0;
        float cotacaoDolar = 0.0f, valorReal = 0.0f;
        System.out.println("Valor em dólares recebido pelo cliente: ");
        qtdDolares = sc.nextInt();
        System.out.println("Cotação do dólar hoje:");
        cotacaoDolar = sc.nextFloat();
        valorReal = qtdDolares * cotacaoDolar;
        System.out.println("O atendente deve devolver R$"+df_2.format(valorReal)+" para o cliente.");

        sc.close();
    }
}
