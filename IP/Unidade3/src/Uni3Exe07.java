import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        int  qtdLata350 = 0, qtdLata600 = 0, qtdLata2000 = 0;
		float ml350 = 0.0f, ml600 = 0.0f, ml2000 = 0.0f, qtdMl = 0.0f, qtdL = 0.0f;

		System.out.println("Quantidade de 350ml:");
		qtdLata350 = sc.nextInt();
		System.out.println("Quantidade de 600ml:");
		qtdLata600 = sc.nextInt();
		System.out.println("Quantidade de 2L:");
		qtdLata2000 = sc.nextInt();

		if(qtdLata350 > 0){
			ml350 = qtdLata350 * 350;
		}
		if(qtdLata600 > 0){
			ml600 = qtdLata600 * 600;
		}
		if(qtdLata2000 > 0){
			ml2000 = qtdLata2000 * 2000;
		}
		qtdMl = ml350 + ml600 + ml2000;
		if(qtdMl > 0){
			qtdL = qtdMl / 1000;
		}
		System.out.println("O cliente comprou ao total "+df_2.format(qtdL)+" litros");
        sc.close();
    }
}
