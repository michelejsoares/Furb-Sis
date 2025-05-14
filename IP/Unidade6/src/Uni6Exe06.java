import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        new Uni6Exe06();
    }
    private void Uni6Exe06(){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Informe o tamanho do vetor");
        n = sc.nextInt();
        if(n > 0){
            double vetor[] = new double[n];
            System.out.println("Informe os valores: ");
            for(int i = 0; i < n; i++){
                vetor[i] = sc.nextDouble();
            }
            double outroValor = 0.0;
            for(int i = 0; i < n; i++){
                if(outroValor == vetor[i]){
                    
                }
            }
        }else{
            System.out.println("Informe um valor maior que 0");
        }
        sc.close();
    }
}
