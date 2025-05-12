import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {
        new Uni6Exe04();
    }

    private double vetor1 [] = new double[10], vetor2[] = new double[10], vetor3[] = new double[10];

    private Uni6Exe04(){
        lerValores();
        somaValores();
        imprimirValores();
    }

    private void lerValores(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.println("Digite o valor "+(i + 1)+" do vetor 1: ");
            vetor1[i] = sc.nextDouble();
            System.out.println("Digite o valor "+(i + 1)+" do vetor 2: ");
            vetor2[i] = sc.nextDouble();
        }
        sc.close();
    }

    private void somaValores(){
        for(int i = 0; i < 10; i++){
            vetor3[i] = vetor1[i] + vetor2[i];
        }
    }

    private void imprimirValores(){
        System.out.println("Soma dos vetores: ");
        String cVirgula = "";
        for(int i = 0; i < 10; i++){
            System.out.print(cVirgula+vetor3[i]);
            cVirgula = ", ";
        }
    }
}
