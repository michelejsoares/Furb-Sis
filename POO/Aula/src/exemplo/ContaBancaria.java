package exemplo;

public class ContaBancaria {
	String titular;
	private double saldo;
	
	public void sacar(double valor) {
		saldo -= valor; 
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		if(saldo <= 0) {
			throw  new IllegalArgumentException("Saldo negativo!");
		}
		this.saldo = saldo;
	}
}
