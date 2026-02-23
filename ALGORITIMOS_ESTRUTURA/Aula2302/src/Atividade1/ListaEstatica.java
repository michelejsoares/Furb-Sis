package Atividade1;

public class ListaEstatica {
	int[] info;
	int tamanho;
	public ListaEstatica() {
		this.info = new int[10];
		this.tamanho = 0;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	private void redimensionar () {
		int[] novo = new int[info.length + 10];
		for(int i = 0; i < info.length; i++) {
			novo[i] = info[i];
		}
		info = novo;
	}
	
	public void inserir (int valor) {
		if(tamanho == info.length) {
			redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}
	
	public void exibir () {
		for(int i = 0; i< info.length; i++){
			System.out.println(info[i]+" ");
		}
		System.out.println();
	}
	
	public int buscar (int valor) {
		for(int i = 0; i < info.length; i++) {
			if(valor == info[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public void retirar (int valor) {
		int pos = buscar(valor);
		if(pos != -1) {
			for(int i = pos; i < (tamanho - 1); i++) {
				info[i] = info[i + 1];
			}
			tamanho --;
		}
	}
	
	public void liberar() {
		info = new int[10];
		tamanho = 0;
	}
	
	public int oterElemento(int posicao) {
		if(posicao < 0 || posicao >= tamanho) {
			throw new IndexOutOfBoundsException("Posicao Invalida");
		}
		return info[posicao];
	}
	
	public boolean estaVazia() {
		return tamanho == 0;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	@Override
	public String toString() {
		if(tamanho == 0) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < tamanho; i++) {
			sb.append(info[i]);
			if(i < tamanho - 1) {
				sb.append(",");
			}
		}
		return sb.toString();
	}
}
