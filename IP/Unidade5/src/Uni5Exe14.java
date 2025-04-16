import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String nome;
        double pc = 0, pv = 0, lucro = 0;
        n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            System.out.println("Nome: ");
            nome = sc.next();
            System.out.println("Preço Compra: ");
            pc = sc.nextDouble();
            System.out.println("Preço Venda: ");
            pv = sc.nextDouble();
            lucro = (pv - pc) / pc * 100;
        }
        sc.close();
    }
}
