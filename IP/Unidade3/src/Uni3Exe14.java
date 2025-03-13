import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df_2 = new DecimalFormat();
		float distancia = 0.0f, tempo = 0.0f, qtdLitros = 0.0f, velocidade = 0.0f;
		distancia = sc.nextFloat();
		tempo = sc.nextFloat();
		qtdLitros = distancia / 12;
		velocidade = distancia / tempo;
		System.out.println("A velocidade média foi de "+df_2.format(velocidade)+" km/h e a quantidade de combustível usado foi "+df_2.format(qtdLitros)+" litros.");
		sc.close();
		
	}
}
