package Questao1;

public class Retangulo extends Figura{
	private double altura;
	private double largura;
	
	public Retangulo(double altura, double largura) {
		super();
		setAltura(altura);
		setLargura(largura);
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	@Override
	public double calcularArea() {
		return altura * largura;
	}
	
}
