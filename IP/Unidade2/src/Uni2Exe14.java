import java.util.Scanner;

public class Uni2Exe14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valorInicial = 0; 
		int[] notas = {100,50,20,10,5,2,1};
		
		System.out.println("Informe o valor: ");
		valorInicial = sc.nextInt();

		for (int i = 0; i < notas.length; i++) {
            int quantidade = valorInicial / notas[i];
            valorInicial %= notas[i];
            System.out.println(quantidade + " nota(s) de R$ " + notas[i] + ",00");
        }

		sc.close();
	}
}
