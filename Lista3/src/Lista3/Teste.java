package Lista3;

public class Teste {
    public static void main(String[] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        // 1 - Lista vazia
        System.out.println("Teste 1: " + lista.estaVazia()); // true


        // 2 - Lista não vazia
        lista.inserir(5);
        System.out.println("Teste 2: " + lista.estaVazia()); // false


        // 3 - Validar inclusão de um número
        ListaEncadeada<Integer> lista2 = new ListaEncadeada<Integer>();
        lista2.inserir(5);

        NoLista<Integer> primeiro = lista2.getPrimeiro();
        System.out.println("Teste 3: " + primeiro.getInfo()); // 5
        System.out.println("Tem próximo? " + (primeiro.getProximo() != null)); // false


        // 4 - Inclusão de 3 números
        ListaEncadeada<Integer> lista3 = new ListaEncadeada<Integer>();
        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);

        System.out.println("Teste 4: " + lista3.toString()); 
        // esperado: 15, 10, 5


        // 5 - Buscar primeiro da lista
        lista3.inserir(20);
        NoLista<Integer> busca1 = lista3.buscar(20);
        System.out.println("Teste 5: " + busca1.getInfo()); // 20


        // 6 - Buscar elemento do meio
        NoLista<Integer> busca2 = lista3.buscar(15);
        System.out.println("Teste 6: " + busca2.getInfo()); // 15


        // 7 - Buscar elemento inexistente
        NoLista<Integer> busca3 = lista3.buscar(50);
        System.out.println("Teste 7: " + busca3); // null


        // 8 - Remover primeiro elemento
        lista3.retirar(20);
        System.out.println("Teste 8: " + lista3.toString());
        // esperado: 15, 10, 5


        // 9 - Remover elemento do meio
        lista3.retirar(10);
        System.out.println("Teste 9: " + lista3.toString());
        // esperado: 15, 5


        // 10 - obterNo posição 0
        ListaEncadeada<Integer> lista4 = new ListaEncadeada<Integer>();
        lista4.inserir(5);
        lista4.inserir(10);
        lista4.inserir(15);
        lista4.inserir(20);

        System.out.println("Teste 10: " + lista4.obterNo(0).getInfo());
        // esperado: 20


        // 11 - obterNo última posição
        System.out.println("Teste 11: " + lista4.obterNo(3).getInfo());
        // esperado: 5


        // 12 - posição inválida
        try {
            lista4.obterNo(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Teste 12: exceção capturada");
        }


        // 13 - comprimento lista vazia
        ListaEncadeada<Integer> lista5 = new ListaEncadeada<Integer>();
        System.out.println("Teste 13: " + lista5.obterComprimento()); // 0


        // 14 - comprimento lista com dados
        lista4 = new ListaEncadeada<Integer>();
        lista4.inserir(5);
        lista4.inserir(10);
        lista4.inserir(15);
        lista4.inserir(20);

        System.out.println("Teste 14: " + lista4.obterComprimento()); // 4
    }
}
