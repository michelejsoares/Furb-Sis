import java.util.Scanner;

public class atividade5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicio = 0, fim = 0, duracao = 0;
		inicio = sc.nextInt();
        fim = sc.nextInt();
        if (inicio == fim) {
            duracao = 24;
        } else if (inicio < fim) {
            duracao = fim - inicio;
        } else {
            duracao = (24 - inicio) + fim;
        }
        
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		sc.close();
	}
}
