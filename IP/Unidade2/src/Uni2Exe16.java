import java.util.Scanner;

public class Uni2Exe16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  qtdLata350 = 0, qtdLata600 = 0, qtdLata2000 = 0;
		float ml350 = 0.0f, ml600 = 0.0f, ml2000 = 0.0f, qtdMl = 0.0f, qtdL = 0.0f;

		System.out.println("Informe a quantidade de lata 350ml: ");
		qtdLata350 = sc.nextInt();
		System.out.println("Informe a quantidade de lata 600ml: ");
		qtdLata600 = sc.nextInt();
		System.out.println("Informe a quantidade de lata 2l: ");
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
		System.out.println("Quantidade de Litros: "+qtdL);
		sc.close();
	}
}
