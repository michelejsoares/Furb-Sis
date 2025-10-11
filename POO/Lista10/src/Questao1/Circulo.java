package Questao1;

public class Circulo extends Figura{
	private double raio;

	public Circulo(double raio) {
		super();
		setRaio(raio);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * raio * raio;
	}
	
	
}
