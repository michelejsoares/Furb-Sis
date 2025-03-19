import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        float valor = 0.0f;
        double divisao = 0.0;
        Scanner sc = new Scanner(System.in);
        valor = sc.nextFloat();
        divisao = valor % 1;
        if(divisao != 0){
            System.out.println("O valor tem casas decimais");
        }else{
            System.out.println("O valor nao tem casas decimais");
        }
        sc.close();
    }
}
