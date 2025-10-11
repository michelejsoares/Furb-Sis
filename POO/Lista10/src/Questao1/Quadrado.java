package Questao1;

public class Quadrado extends Figura{
	private double lado;

	public Quadrado(double lado) {
		super();
		setLado(lado);
	}
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public double calcularArea() {
		return lado * lado;
	}
}
