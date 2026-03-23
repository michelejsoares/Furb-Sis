package Questao;

public class Main {
    public static void main(String[] args) {

        ListaDupla<Integer> lista = new ListaDupla<>();

        // Caso 1 - Inserção
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        System.out.println("Lista: " + lista); // 20, 15, 10, 5

        System.out.print("Inverso: ");
        lista.exibirOrdemInversa(); // 5 10 15 20

        // Caso 2 - Buscar início
        System.out.println("Buscar 20: " + lista.buscar(20).getInfo());

        // Caso 3 - Buscar meio
        System.out.println("Buscar 10: " + lista.buscar(10).getInfo());

        // Caso 4 - Remover início
        lista.retirar(20);
        System.out.println("Após remover 20: " + lista);

        // Caso 5 - Remover meio
        lista.retirar(10);
        System.out.println("Após remover 10: " + lista);

        // Caso 6 - Remover fim
        lista.retirar(5);
        System.out.println("Após remover 5: " + lista);

        // Caso 7 - Liberar
        lista.liberar();
        System.out.println("Após liberar: " + lista);
    }
}