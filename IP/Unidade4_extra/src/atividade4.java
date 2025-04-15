import java.util.Scanner;

public class atividade4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0, menor, meio, maior;;
		a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }
        
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        
        System.out.println();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
		sc.close();
	}
}
