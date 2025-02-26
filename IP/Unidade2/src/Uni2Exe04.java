import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float notaA = 0.0f;
        float notaB = 0.0f;
        float pesoA = 3.5f;
        float pesoB = 7.5f;
        float mediaPonderada = 0.0f;

        System.out.println("Informe a Nota A: ");
        notaA = sc.nextFloat();
        System.out.println("Informe a Nota B: ");
        notaB = sc.nextFloat();
        if(notaA < 0.0 || notaA > 10){
            System.out.println("Nota A invalida!");
            sc.close();
            return;
        }
        if(notaB < 0.0 || notaB > 10){
            System.out.println("Nota B invalida!");
            sc.close();
            return;
        }
        
        mediaPonderada = ((pesoA * notaA) + (pesoB * notaB)) / (pesoA + pesoB);
        System.out.println("A media ponderada é: "+mediaPonderada);


        sc.close();
    }
}
