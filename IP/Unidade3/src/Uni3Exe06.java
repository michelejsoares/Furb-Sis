import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        int valorRefeicao = 25;
        float pesoPratoComida = 0.75f, pesoPrato = 0.0f, valorFinal = 0.0f;
        pesoPrato = sc.nextFloat();
        pesoPrato = pesoPrato - pesoPratoComida;
        valorFinal = pesoPrato * valorRefeicao;
        System.out.println("O valor do prato do cliente é R$"+df_2.format(valorFinal));
        sc.close();
    }
}
