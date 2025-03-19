import java.util.Scanner;

public class Uni4Exe07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Digite o peso da carta em gramas: ");
        double pesoCarta = sc.nextDouble();
        
        double custoSelo = 0.45;        
        if (pesoCarta > 50) {
            double excessoPeso = pesoCarta - 50;
            int adicionais = (int) Math.ceil(excessoPeso / 20) + 1;
            custoSelo += adicionais * 0.45;
        }
        
        System.out.print(custoSelo);
		sc.close();

	}
}
