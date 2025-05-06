import java.util.Scanner;

public class ExemploVetor {
    public static void main(String[] args) {
        new ExemploVetor();
    }

    private int numeros[] = new int[5];
    private int vetor[] = new int[5];
    
    private ExemploVetor(){
        getValores();
        //imprimirValores(numeros);
        randomizarValores();
        informaValores();
    }
    private void randomizarValores() {
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int)(Math.random() * 100.0);
        }
        imprimirValores(numeros);
    }
    private void getValores(){
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

    }
    private void imprimirValores(int[] vetorRecebido){
        int nItens = numeros.length;
        String virgula = "";
        System.out.println("Numeros: ");
        for(int i = 0; i < nItens; i++){
            System.out.print(virgula+vetorRecebido[i]);
            virgula = ", ";
        }
    }

    private void informaValores(){
        Scanner sc = new Scanner(System.in);
        int nItens = vetor.length, nCount = 1;
        for(int i = 0; i < nItens; i++){
            System.out.println("Informe o "+nCount+" numero");
            vetor[i] = sc.nextInt();
            nCount++;
        }
        sc.close();
        imprimirValores(vetor);
    }
    
}
