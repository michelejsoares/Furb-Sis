package Exe01Questao2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Pessoa ps = new Pessoa();
		Scanner sc = new Scanner(System.in);
		double imc;
		System.out.println("Altura:");
		ps.altura = sc.nextDouble();
		System.out.println("Peso:");
		ps.peso = sc.nextDouble();
		imc = ps.calcularImc();
		System.out.println("O IMC é: "+imc);
		sc.close();
		
	}
}
