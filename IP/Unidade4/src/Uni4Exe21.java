import java.util.Scanner;

public class Uni4Exe21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int massa = 0;
		float altura = 0.0f;
		double IMC = 0.0;
		System.out.println("Altura: ");
		altura = sc.nextFloat();
		System.out.println("Massa: ");
		massa = sc.nextInt();
		IMC = massa / (Math.pow(altura, 2));
		if(IMC < 18.5){
			System.out.println("Magreza");
		}else if(IMC >= 18.5 && IMC <= 24.9){
			System.out.println("Saudavel");
		}else if(IMC >= 25 && IMC <= 29.9){
			System.out.println("Sobrepeso");
		}else if(IMC >= 30 && IMC <= 34.9){
			System.out.println("Obesidade Grau I");
		}else if(IMC >= 35 && IMC <= 39.9){
			System.out.println("Obesidade Grau II (severa)");
		}else{
			System.out.println("Obesidade Grau III (mórbida)");
		}
		sc.close();
	}
}
