import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {
        new Uni6Exe03();
    }

    private int qtdVezes = 5;
    private double valores[] = new double[qtdVezes];
    private double novosValores[] = new double[qtdVezes];
    private double porcentoValor = 0.0, ajusteValor = 0.0, valor = 0.0;

    private Uni6Exe03(){
        lerValores();
        ajustaValores();
        imprimirValores();
    }
    private void lerValores(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < qtdVezes; i++){
            System.out.println("Informe o "+(i+1)+" valor: "); 
            valores[i] = sc.nextDouble();
        }
        sc.close();
    }

    private void ajustaValores(){
        for(int i = 0; i < qtdVezes; i++){
            if(i % 2 == 0){
                valor = valores[i];
                porcentoValor = valor * 0.02;
                ajusteValor = valor + porcentoValor;
                novosValores[i] = ajusteValor;
            }else{
                valor = valores[i];
                porcentoValor = valor * 0.05;
                ajusteValor = valor + porcentoValor;
                novosValores[i] = ajusteValor;
            }
        }
    }

    private void imprimirValores(){
        System.out.print("Novos valores: ");
        String cVirgula = "";
        for(int i = 0; i < qtdVezes; i++){
            System.out.print(cVirgula+novosValores[i]);
            cVirgula = ", ";
        }
    }
}
