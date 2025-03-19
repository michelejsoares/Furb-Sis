import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadeMarquinhos = 0, idadeZezinho = 0, idadeLuluzinha = 0;
        idadeMarquinhos = sc.nextInt();
        idadeZezinho = sc.nextInt();
        idadeLuluzinha = sc.nextInt();
        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            System.out.println("O Marquinhos é o caçula.");
        } else if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
            System.out.println("O Zezinho é o caçula.");
        } else {
            System.out.println("A Luluzinha é o caçula.");
        }
        sc.close();
    }
}
