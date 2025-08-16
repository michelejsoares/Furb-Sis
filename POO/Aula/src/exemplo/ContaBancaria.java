package exemplo;

public class ContaBancaria {
	private String numero;
	private String titular;
	private double saldo;
	
	public void sacar(double valor) {
		saldo -= valor; 
	}
	
	public void depositar(double valor) {
		if(valor <= 0) {
			throw  new IllegalArgumentException("Valor negativo!");
		}
		saldo += valor;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		if(numero.trim().isEmpty()) {
			throw  new IllegalArgumentException("Numero invalido!");
		}
		this.numero = numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		if(numero.trim().isEmpty()) {
			throw  new IllegalArgumentException("Numero invalido!");
		}
		this.titular = titular;
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
