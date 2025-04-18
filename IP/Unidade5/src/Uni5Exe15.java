import java.util.Scanner;

public class Uni5Exe15 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String nome = "";
		float nota1 = 0.0f, nota2 = 0.0f, media = 0.0f;
		while (true) {
			System.out.println("Nome: ");
			nome = sc.next();
			if(nome.equals("fim")){
				break;
			}
			System.out.println("Nota 1: ");
			nota1 = sc.nextFloat();
			System.out.println("Nota 2: ");
			nota2 = sc.nextFloat();
			media = (nota1 + nota2) / 2;
			System.out.println("A media do(a) "+nome+" é "+media);
		}
		sc.close();
	}
}
