import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {
        new Uni6Exe10();
    }

    private int vetor[] = new int[50];

    private Uni6Exe10() {
        Scanner sc = new Scanner(System.in);
        int opcaoMenu = 0;
        int posicao = 0;
        do {
            System.out.println("- MENU -");
            System.out.println("1 - Incluir valor;");
            System.out.println("2 - Pesquisar valor;");
            System.out.println("3 - Alterar valor;");
            System.out.println("4 - Excluir valor;");
            System.out.println("5 - Mostrar valores;");
            System.out.println("6 - Ordenar valores;");
            System.out.println("7 - Inverter valores;");
            System.out.println("8 - Sair do sistema;");
            System.out.print("Digite uma opção: ");
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {
                case 1:
                    posicao = incluirValor(sc, posicao);
                    break;
                case 2:
                    pesquisarValor(sc);
                    break;
                case 3: 
                    alterarValor(sc);
                case 4:
                    excluirValor(sc);
                default:
                    break;
            }
        } while (opcaoMenu != 8);

        sc.close();
    }

    private int  incluirValor(Scanner sc, int posicao) {
        System.out.print("Informe o valor: ");
        int valor = 0;
        valor = sc.nextInt();
        if(posicao < vetor.length){
            vetor[posicao] = valor;
            System.out.println("Numero "+valor+" incluido na posicao vetor["+posicao+"]");
        }else{
            System.out.println("Vetor cheio");
        }
        return posicao + 1;
    }

    private void pesquisarValor(Scanner sc) {
        System.out.print("Informe o valor que você deseja pesquisar: ");
        int valor = sc.nextInt(), posicaoEncontrado = 0;
        boolean valorEncontrada = false;
        for (int i = 0; i < 50; i++) {
            if (vetor[i] == valor) {
                valorEncontrada = true;
                posicaoEncontrado = i;
            }
        }
        if(valorEncontrada){
            System.out.println("O valor está na posição vetor[" +posicaoEncontrado+ "]");
        }else{
            System.out.println("Valor não encontrado");
        }
    }
    private void alterarValor(Scanner sc){
        int valorAtual = 0, novoValor = 0;
        boolean valorNaoEncontrado = false;
        System.out.println("Valor Atual");
        valorAtual = sc.nextInt();
        for (int i = 0; i < 50; i++) {
            if(valorAtual ==  vetor[i]){
                System.out.println("Novo valor: ");
                novoValor = sc.nextInt();
                vetor[i] = novoValor;
                valorNaoEncontrado = true;
            }else{
                valorNaoEncontrado = false;
            }
        }
        if(!valorNaoEncontrado){
            System.out.println("Valor não encontrado");
        }
    }
    private void excluirValor(Scanner sc){
        int valorExcluir = 0, novoValor = 0;
        boolean valorNaoEncontrado = false;
        System.out.println("Valor para excluir");
        valorExcluir = sc.nextInt();
        for (int i = 0; i < 50; i++) {
            if(valorExcluir ==  vetor[i]){
                vetor[i] = 0;
                System.out.println("Valor Excluido");
            }else{
                valorNaoEncontrado = false;
            }
        }
        if(!valorNaoEncontrado){
            System.out.println("Valor não encontrado");
        }
    }    
}
