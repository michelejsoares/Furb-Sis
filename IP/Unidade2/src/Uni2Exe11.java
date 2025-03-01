import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df_2 = new DecimalFormat("0.00");
		float A = 0.0f;
		float B = 0.0f;
		float C = 0.0f;
		double area = 0.0f;
		float pi = 3.14159f;
		String opcao = "";
		
		System.out.println("Escolha qual opção calcular: ");
		System.out.println("a) a área do triângulo retângulo que tem A por base e C por altura.");
		System.out.println("b) a área do círculo de raio C.");
		System.out.println("c) a área do trapézio que tem A e B por bases e C por altura.");
		System.out.println("d) a área do quadrado que tem lado B.");
		System.out.println("e) a área do retângulo que tem lados A e B.");
		opcao = sc.next();
		opcao = opcao.toUpperCase();

		if(opcao.equals("A")) {
			System.out.println("Informe o valor da Base (A)");
			A = sc.nextFloat();
			System.out.println("Informe o valor da Altura (C)");
			C = sc.nextFloat();
			area = (A*C) / 2;
			System.out.println("Area: "+df_2.format(area));
		}else if(opcao.equals("B")){
			System.out.println("Informe o valor do Raio (C)");
			C = sc.nextFloat();
			area = pi * Math.pow(C, 2);
			System.out.println("Area: "+df_2.format(area));
		}else if(opcao.equals("C")){
			System.out.println("Informe o valor da Base Menor (A)");
			A = sc.nextFloat();
			System.out.println("Informe o valor da Base Maior (B)");
			B = sc.nextFloat();
			System.out.println("Informe o valor da Altura (C)");
			C = sc.nextFloat();
			area = ((B + A) * C) / 2;
			System.out.println("Area: "+df_2.format(area));
		}else if(opcao.equals("D")){
			System.out.println("Informe o valor do Lado (B)");
			B = sc.nextFloat();
			area = B * B;
			System.out.println("Area: "+df_2.format(area));
		}else if(opcao.equals("E")){
			System.out.println("Informe o valor do Lado (A)");
			A = sc.nextFloat();
			System.out.println("Informe o valor do Lado (B)");
			B = sc.nextFloat();
			area = A * B;
			System.out.println("Area: "+df_2.format(area));
		}else{
			System.out.println("Opcao informada incorreta.");
			sc.close();
			return;
		}

		sc.close();
	}
}
