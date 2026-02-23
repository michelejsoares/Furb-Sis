package Atividade1;

public class TesteLista {
	public static void main(String[] args) {
		ListaEstatica lista1 = new ListaEstatica();
		lista1.inserir(5);
		lista1.inserir(10);
		lista1.inserir(15);
		lista1.inserir(20);
		System.out.println("Caso 1: " + lista1.toString());
		System.out.println("Caso 2: " + lista1.getTamanho());
		System.out.println("Caso 3: " + lista1.buscar(15));
		System.out.println("Caso 4: " + lista1.buscar(30));
		lista1.retirar(10);;
		System.out.println("Caso 5: " + lista1.toString());
		System.out.println("Tamanho apos retirar: " + lista1.getTamanho());
		
		ListaEstatica lista2 = new ListaEstatica();
		for(int i = 1; i <= 15; i++) {
			lista2.inserir(i);;
		}
		System.out.println("Caso 6: " + lista2.toString());
		System.out.println("Tamanho: " + lista2.getTamanho());
		
		ListaEstatica lista3 = new ListaEstatica();
		lista3.inserir(5);
		lista3.inserir(10);
		lista3.inserir(15);
		lista3.inserir(20);
		System.out.println("Caso 7: " + lista3.oterElemento(3));
		try {
			lista3.oterElemento(5);
		} catch (Exception e) {
			System.out.println("Caso 8: Exeção");
		}
		
		lista3.liberar();
		System.out.println("Caso 9: Vazia? " + lista3.estaVazia());
	}
}

