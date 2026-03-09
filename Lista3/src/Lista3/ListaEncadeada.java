package Lista3;

public class ListaEncadeada<T> {
	private NoLista<T> primeiro;
	
	public ListaEncadeada() {
		primeiro = null;
	}
	
	public NoLista<T> getPrimeiro(){
		return primeiro;
	}
	
	public void inserir(T valor) {
		NoLista<T> novo = new NoLista<T>(valor);
		novo.setProximo(primeiro);
		primeiro = novo;
	}
	
	public boolean estaVazia() {
		return primeiro == null;
	}
	
	public NoLista<T> buscar (T valor){
		NoLista<T> atual = primeiro;
		while(atual != null) {
			if(atual.getInfo().equals(valor)) {
				return atual;
			}
			atual = atual.getProximo();
		}
		
		return null;
	}
	
	public void retirar(T valor) {
		NoLista<T> atual = primeiro;
		NoLista<T> anterior = null;
		
		while(atual != null) {
			if(atual.getInfo().equals(valor)) {
				if(anterior == null) {
					primeiro = atual.getProximo();
				}else {
					anterior.setProximo(atual.getProximo());
				}
				return;
			}
			anterior = atual;
			atual = atual.getProximo();
		}
	}
	
	public int obterComprimento() {
		int cont = 0;
		NoLista<T> atual = primeiro;
		while(atual != null) {
			cont++;
			atual = atual.getProximo();
		}
		return cont;
	}
	
	public NoLista<T> obterNo(int pos){
		if(pos < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		int i = 0;
		NoLista<T> atual = primeiro;
		
		while(atual != null) {
			if(i == pos) {
				return atual;
			}
			atual = atual.getProximo();
			i++;
		}
		throw new IndexOutOfBoundsException();
	}
	
	public String toString() {
		String resultado = "";
		NoLista<T> atual = primeiro;
		
		while (atual != null) {
			resultado += atual.getInfo();
			
			if(atual.getProximo() != null){
				resultado += ", ";
			}
			
			atual = atual.getProximo();
		}
		return resultado;
	}
}
