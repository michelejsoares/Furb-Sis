import java.util.Scanner;

public class Uni5Exe24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String condicao = "", condicaoMaiuscula = "";
		double limite = 0.0, pesoPeixe = 0.0, pesoPeixeEmQuilo = 0., pesoTotalPesca = 0.0;
		System.out.println("Informe o limite: (KG)");
		limite = sc.nextDouble();
		while (true) {
			System.out.println("Informe o peso do peixe: (g)");
			pesoPeixe = sc.nextDouble();
			pesoPeixeEmQuilo = pesoPeixe / 1000;
			pesoTotalPesca += pesoPeixeEmQuilo;
			if(pesoTotalPesca >= limite){
				System.out.println("Limite Atingido");
				break;
			}else{
				System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
				condicao = sc.next();
				condicaoMaiuscula = condicao.toUpperCase();
				if(condicaoMaiuscula.equals("N")){
					break;
				}
			}
		}
		sc.close();
	}
}
