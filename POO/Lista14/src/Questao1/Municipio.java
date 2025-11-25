package Questao1;

public class Municipio {
	private String codigoIBGE;
	private String cidade;
	private String estado;
	private int populacao;
	
	public Municipio(String codigoIBGE, String cidade, String estado, int populacao) {
		super();
		this.codigoIBGE = codigoIBGE;
		this.cidade = cidade;
		this.estado = estado;
		this.populacao = populacao;
	}
	
	public String getCodigoIBGE() {
		return codigoIBGE;
	}
	public void setCodigoIBGE(String codigoIBGE) {
		this.codigoIBGE = codigoIBGE;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
}
