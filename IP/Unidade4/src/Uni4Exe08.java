import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra, maiuscula;
        letra = sc.next().charAt(0);
        maiuscula = Character.toUpperCase(letra);
        if(maiuscula == 'A' || maiuscula == 'E' || maiuscula == 'I' || maiuscula == 'O' || maiuscula == 'U'){
            System.out.println("É vogal");
        }else{
            System.out.println("Não é vogal");
        }
        sc.close();
    }
}
