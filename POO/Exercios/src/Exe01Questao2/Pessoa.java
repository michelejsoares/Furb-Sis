package Exe01Questao2;

public class Pessoa {
	double altura;
	double peso;
	
	public double calcularImc(){
		double imc, expoente;
		expoente = Math.pow(altura, 2);
		imc = (peso / expoente);
		return imc;
	}
}