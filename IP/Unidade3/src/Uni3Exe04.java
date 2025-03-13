import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        int nota1 = 0, nota2 = 0, nota3 = 0;
        double media = 0.0;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        nota1 = sc.nextInt();
        nota2 = sc.nextInt();
        nota3 = sc.nextInt();
        float peso1 = (5 * nota1);
        float peso2 = (3 * nota2);
        float peso3 = (2 * nota3);
        float soma = peso1 + peso2 + peso3;
        float somaPeso = (5 + 3 + 2);
        media =  soma / somaPeso;
        System.out.println(df_2.format(media));
        sc.close();
    }
}
