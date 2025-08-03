package Exe01Questao3;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Pessoa ps = new Pessoa();
		Scanner sc = new Scanner(System.in);
		int nPessoa = 1;
		for(int i = 0; i < 3; i ++) {
			System.out.println("Informe a Altura e Peso da "+nPessoa+"ª pessoa: ");
			double imc;
			System.out.println("Altura:");
			ps.altura = sc.nextDouble();
			System.out.println("Peso:");
			ps.peso = sc.nextDouble();
			imc = ps.calcularImc();
			System.out.println("O IMC da "+nPessoa+"ª é: "+imc);
			nPessoa++;
		}
		sc.close();
	}
}
