import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorA = 0, valorB = 0;
        valorA = sc.nextInt();
        valorB = sc.nextInt();
        if(valorA % valorB == 0 || valorB % valorA == 0){
            System.out.println("Os valores são multiplos");
        }else{
            System.out.println("Os valores não são múltiplos.");
        }
        sc.close();
    }
}
