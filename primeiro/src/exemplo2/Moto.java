package exemplo2;

public class Moto {
	String cor;
	String marca;
	int velocidade;
	int cilindro;
	public int acelerar(int velocidade) {
		velocidade = velocidade + 10;
		return velocidade;
	}
	
	public int frear(int velocidade) {
		velocidade = velocidade - 10;
		return velocidade;
	}
}
