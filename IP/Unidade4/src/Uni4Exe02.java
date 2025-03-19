import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        int valor = 0;
        float divisao = 0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        valor = sc.nextInt();
        if(valor > 0){
            divisao = (valor % 2);
            if(divisao == 0){
                System.out.println("Numero é par");
            }else{
                System.out.println("Numero é impar");
            }
        }else{
            System.out.println("Valor invalido");
        }
        sc.close();
    }
}
