import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        float valorGasolina = 0.0f, valorPagamento = 0.0f, litroGasolina = 0.0f;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.println("Preço do litro de gasolina: ");
        valorGasolina = sc.nextFloat();
        System.out.println("Valor do pagamento:");
        valorPagamento = sc.nextFloat();
        litroGasolina = valorPagamento / valorGasolina;
        System.out.println("O motorista conseguiu colocar: "+df_2.format(litroGasolina)+" litros.");
        sc.close();
    }
}
