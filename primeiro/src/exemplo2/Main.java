package exemplo2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Moto moto = new Moto();
		Scanner sc = new Scanner(System.in);
		String cor;
		String marca;
		int velocidade, acelerar, frear, cilindros;
		System.out.println("Cor: ");
		cor = sc.nextLine();
		System.out.println("Marca: ");
		marca = sc.nextLine();
		System.out.println("Velocidade: ");
		velocidade = sc.nextInt();
		System.out.println("Cilandros: ");
		cilindros = sc.nextInt();
		acelerar = moto.acelerar(velocidade);
		frear = moto.frear(velocidade);
		
		moto.cor = cor;
		moto.marca = marca;
		moto.velocidade = velocidade;
		moto.cilindro = cilindros;
		System.out.println("Resultado:");
		System.out.println("Cor: "+moto.cor);
		System.out.println("Marca: "+moto.marca);
		System.out.println("Velocidade: "+moto.velocidade);
		System.out.println("Cilindros: "+moto.cilindro);
		System.out.println("Acelerar: "+acelerar);
		System.out.println("Frear: "+frear);
		
		sc.close();
	}

}
