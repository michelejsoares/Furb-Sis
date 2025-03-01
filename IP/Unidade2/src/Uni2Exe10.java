import java.util.Scanner;

public class Uni2Exe10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int duracaoSegundos = 0;
		int horas = 0;
		int minutos = 0;
		int segundos = 0;

		System.out.println("Informe o tempo em segundos do evento na Fabrica: ");
		duracaoSegundos = sc.nextInt();
		horas = duracaoSegundos / 3600;
        minutos = (duracaoSegundos % 3600) / 60;
        segundos = duracaoSegundos % 60;
		System.out.println(horas+":"+minutos+":"+segundos);
		sc.close();
	}
}
