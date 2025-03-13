import java.util.Scanner;

public class Uni3Exe16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int notas100 = 0, notas10 = 0, notas1 = 0, totalNotas = 0;
		System.out.print("Valor total da compra: ");
        int valorCompra = sc.nextInt();
        
        System.out.print("Valor total dado pelo cliente: ");
        int valorPago = sc.nextInt();
        
        int troco = valorPago - valorCompra;
        if (troco < 0) {
            System.out.println("Valor pago insuficiente.");
        } else {
            notas100 = troco / 100;
            notas10 = (troco % 100) / 10;
            notas1 = troco % 10;
            totalNotas = notas100 + notas10 + notas1;
            System.out.println("O número mínimo de notas de troco é: " + totalNotas);
            System.out.println("Quantidade de notas de 100 necessárias é: " + notas100);
            System.out.println("Quantidade de notas de 10 necessárias é: " + notas10);
            System.out.println("Quantidade de notas de 1 necessárias é: " + notas1);
        }
		sc.close();
	}
}
