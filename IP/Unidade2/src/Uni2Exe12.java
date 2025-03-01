import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df_4 = new DecimalFormat("0.0000");
		double x1 = 0.0, x2 = 0.0, y1 = 0.0, y2 = 0.0, distancia = 0.0;

		System.out.println("Informe o valor de x1");
		x1 = sc.nextDouble();
		System.out.println("Informe o valor de x2");
		x2 = sc.nextDouble();
		System.out.println("Informe o valor de y1");
		y1 = sc.nextDouble();
		System.out.println("Informe o valor de y2");
		y2 = sc.nextDouble();

		distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println(df_4.format(distancia));

		sc.close();
	}
}
