import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        char letra, maiuscula;
        Scanner sc = new Scanner(System.in);
        letra = sc.next().charAt(0);
        maiuscula = Character.toUpperCase(letra);
        if(maiuscula == 'F'){
            System.out.println("Feminino");
        }else if(maiuscula == 'M'){
            System.out.println("Masculino");
        }else if(maiuscula == 'I'){
            System.out.println("Não Informado");
        }else{
            System.out.println("Entrada Incorreta");
        }
        sc.close();
    }
}
