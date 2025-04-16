import java.util.Scanner;

public class Uni5Exe13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double quilometragem = 0, combustivel = 0, kml = 0, soma = 0, divisao = 0;
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("Parada "+i+": Quilometragem: ");
            quilometragem = sc.nextDouble();
            System.out.println("Combustivel: ");
            combustivel = sc.nextDouble();
            kml = quilometragem / combustivel;
            System.out.println("Parada "+i+": "+kml+" km por litro");
            soma += kml;
        }
        divisao = soma / n;
        System.out.println("Quilometragem média obtida por litro: "+divisao);
        sc.close(); 
	}
}
