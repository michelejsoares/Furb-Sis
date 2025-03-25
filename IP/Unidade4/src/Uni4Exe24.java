import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1 = 0, valor2 = 0, valor3 = 0, opcao = 0, maior = 0, meio = 0, menor = 0;
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        valor3 = sc.nextInt();
        opcao = sc.nextInt();
        if(valor1 >= valor2 && valor1 >= valor3) {
            maior = valor1;
            if (valor2 >= valor3) {
                meio = valor2;
                menor = valor3;
            } else {
                meio = valor3;
                menor = valor2;
            }
        }else if (valor2 >= valor1 && valor2 >= valor3) {
            maior = valor2;
            if(valor1 >= valor3){
                meio = valor1;
                menor = valor3;
            }else{
                meio = valor3;
                menor = valor1;
            }
        }else{
            maior = valor3;
            if(valor1 >= valor2){
                meio = valor1;
                menor = valor2;
            }else{
                meio = valor2;
                menor = valor1;
            }
        }
        
        switch (opcao) {
            case 1:
                System.out.println(menor + " " + meio + " " + maior);
                break;
            
            case 2:
                System.out.println(maior + " " + meio + " " + menor);
                break;
            
            case 3:
                System.out.println(meio + " " + maior + " " + menor);
                break;
            
            default:
                System.out.println("Opção inválida!");
        }
        sc.close();
    }
}
