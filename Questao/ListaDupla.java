package Questao;

public class ListaDupla<T> {
    private NoListaDupla<T> primeiro;

    // a) construtor
    public ListaDupla() {
        this.primeiro = null;
    }

    // b) getter
    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    // c) inserir (insere no início)
    public void inserir(T valor) {
        NoListaDupla<T> novo = new NoListaDupla<>(valor);

        if (primeiro != null) {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }

        primeiro = novo;
    }

    // d) buscar
    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> atual = primeiro;

        while (atual != null) {
            if (atual.getInfo().equals(valor)) {
                return atual;
            }
            atual = atual.getProximo();
        }

        return null;
    }

    // e) retirar
    public void retirar(T valor) {
        NoListaDupla<T> atual = buscar(valor);

        if (atual == null) return;

        // se for o primeiro
        if (atual == primeiro) {
            primeiro = atual.getProximo();
            if (primeiro != null) {
                primeiro.setAnterior(null);
            }
        } else {
            NoListaDupla<T> ant = atual.getAnterior();
            NoListaDupla<T> prox = atual.getProximo();

            if (ant != null) {
                ant.setProximo(prox);
            }

            if (prox != null) {
                prox.setAnterior(ant);
            }
        }

        // limpa o nó
        atual.setAnterior(null);
        atual.setProximo(null);
    }

    // f) exibir inverso
    public void exibirOrdemInversa() {
        if (primeiro == null) return;

        NoListaDupla<T> atual = primeiro;

        // vai até o último
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }

        // volta exibindo
        while (atual != null) {
            System.out.print(atual.getInfo() + " ");
            atual = atual.getAnterior();
        }

        System.out.println();
    }

    // g) liberar
    public void liberar() {
        NoListaDupla<T> atual = primeiro;

        while (atual != null) {
            NoListaDupla<T> prox = atual.getProximo();
            atual.setAnterior(null);
            atual.setProximo(null);
            atual = prox;
        }

        primeiro = null;
    }

    // h) toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoListaDupla<T> atual = primeiro;

        while (atual != null) {
            sb.append(atual.getInfo());

            if (atual.getProximo() != null) {
                sb.append(", ");
            }

            atual = atual.getProximo();
        }

        return sb.toString();
    }
}