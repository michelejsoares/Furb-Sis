import java.util.Scanner;

public class Uni2Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codPeca1 = 0;
        int codPeca2 = 0;
        float numPeca1 = 0.0f;
        float numPeca2 = 0.0f;
        float valorUniPeca1 = 0.0f;
        float valorUniPeca2 = 0.0f;
        float valorPagoPeca1 = 0.0f;
        float valorPagoPeca2 = 0.0f;

        System.out.println("Cod. Peca 1: ");
        codPeca1 = sc.nextInt();
        System.out.println("Num. Peca 1: ");
        numPeca1 = sc.nextFloat();
        System.out.println("Vlr. Uni. Peca 1: ");
        valorUniPeca1 = sc.nextInt();
        System.out.println("Cod. Peca 2: ");
        codPeca2 = sc.nextInt();
        System.out.println("Num. Peca 2: "); 
        valorUniPeca2 = sc.nextFloat();
        System.out.println("Vlr. Uni. Peca 2: ");
        valorUniPeca2 = sc.nextFloat();

        valorPagoPeca1 = numPeca1 * valorUniPeca1;
        valorPagoPeca2 = numPeca2 * valorUniPeca2;

        System.out.println("Valor a ser pago na Peca 1, cod: "+codPeca1+" é: "+valorPagoPeca1);
        System.out.println("Valor a ser pago na Peca 2, cod: "+codPeca2+" é: "+valorPagoPeca2);


        sc.close();
    }
}
