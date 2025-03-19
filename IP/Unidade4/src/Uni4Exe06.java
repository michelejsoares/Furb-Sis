import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        char letra;
        Scanner sc = new Scanner(System.in);
        letra = sc.next().charAt(0);
        if(letra == 'F'){
            System.out.println("Feminino");
        }else if(letra == 'M'){
            System.out.println("Masculino");
        }else if(letra == 'I'){
            System.out.println("Não Informado");
        }else{
            System.out.println("Entrada Incorreta");
        }
        sc.close();
    }
}
