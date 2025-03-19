import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        int horasMes = 0;
        float horasValor = 0.0f;
        double salarioTotal = 0.0, salarioExtra = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com as horas trabalhadas no mês: ");
        horasMes = sc.nextInt();
        System.out.println("Entre com o valor pago por hora: ");
        horasValor = sc.nextFloat();
        salarioTotal = horasMes * horasValor;
        if(horasMes > 160){
            salarioExtra = (horasMes - 160) * (horasValor * 0.5);
            salarioTotal = salarioTotal + salarioExtra;
        }
        System.out.println("O salario total é de: "+salarioTotal);
        sc.close();

    }
}
