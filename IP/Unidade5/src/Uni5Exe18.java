import java.util.Scanner;

public class Uni5Exe18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int canal = 0, qtd = 0, pessoaAssistindo = 0;
		float percentual4 = 0.0f, percentual5 = 0.0f, percentual9 = 0.0f, percentual12 = 0.0f;
		while (true) {
			System.out.println("Canal: ");
			canal = sc.nextInt();
			if(canal == 0 && qtd != 0){
				break;
			}
			System.out.println("Pessoas Assistindo: ");
			pessoaAssistindo = sc.nextInt();
			qtd++;
		}
		sc.close();
	}
}
