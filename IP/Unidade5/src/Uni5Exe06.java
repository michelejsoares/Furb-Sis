import java.util.Scanner;

public class Uni5Exe06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float altura = 0.0f, mediaAltura = 0.0f, somaAltura = 0.0f;
		for(int i = 1; i <= 20; i++){
			System.out.println("Altura da pessoa "+i);
			altura = sc.nextFloat();
			somaAltura += altura;
		}
		mediaAltura = somaAltura / 20;
		System.out.println("A média das alturas é: "+mediaAltura);
		sc.close();
	}
}
