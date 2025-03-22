import java.util.Scanner;

public class Uni4Exe15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mesReajuste = 0;
		mesReajuste = sc.nextInt();
		if(mesReajuste > 0 && mesReajuste <= 12){
			System.out.println("O funcionário irá receber 5% de reajuste");
		}else if(mesReajuste >= 13 && mesReajuste <= 48){
			System.out.println("O funcionário irá receber 7% de reajuste");
		}else{
			System.out.println("Reajuste não informado");
		}
		sc.close();
	}
}
