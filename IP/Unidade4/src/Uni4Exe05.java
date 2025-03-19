import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        boolean lResposta = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("A cor é azul:");
        lResposta = sc.nextBoolean();
        if(lResposta){
            System.out.println("Sim");
        }else{
            System.out.println("Nao");
        }
        sc.close();
    }
}
