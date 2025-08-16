package exemplo;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome invalido!");
		}
		this.nome = nome;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if(peso <= 0) {
			throw new IllegalArgumentException("Peso invalido!");
		}
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if(altura <= 0) {
			throw new IllegalArgumentException("Altura invalida!");
		}
		this.altura = altura;
	}
	
	public double calcularImc(){
		double imc, expoente;
		expoente = Math.pow(this.altura, 2);
		imc = (this.peso / expoente);
		return imc;
	}
}

