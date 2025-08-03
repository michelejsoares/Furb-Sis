package Exe01Questao1;

public class App {
	public static void main(String[] args) {
		Pessoa ps = new Pessoa();
		double imc;
		System.out.println("Altura:");
		ps.altura = 1.75;
		System.out.println("Peso:");
		ps.peso = 68;
		imc = ps.calcularImc();
		System.out.println("O IMC é: "+imc);
		
	}
}
