import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        int qtdFrango = 0;
        double valorMarcaFrango = 0.0;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df_1 = new DecimalFormat("0.0");
        qtdFrango = sc.nextInt();
        valorMarcaFrango = qtdFrango * 11;
        System.out.println("O gasto total para marcar "+qtdFrango+" é R$"+df_1.format(valorMarcaFrango));
        sc.close();
    }
}
