import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[10];
        lerNumeros(numeros);
        escreverOrdemInversa(numeros);
    }
    public static void lerNumeros(int[] vetor){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite o "+(i +1)+"º numero: ");
            vetor[i] = sc.nextInt();
        }
        sc.close();
    }
    public static void escreverOrdemInversa(int[] vetor) {
        System.out.println();
        System.out.println("Numeros na ordem inversa: ");
        for(int i = vetor.length - 1; i >= 0 ; i--){
            System.out.println(vetor[i]);
        }
    }
}
