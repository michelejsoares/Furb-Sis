import java.util.Scanner;

public class Uni5Exe27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia = 0, totalPecasManha = 0, totalPecasTarde, totalPecas = 0, novoFuncionario = 0;
		double valor = 0.0, valorManha = 0.0, valorTarde = 0.0;
		while (true) {
			System.out.println("Informe o dia: ");
			dia = sc.nextInt();
			if(dia <= 0 || dia >= 31){
				System.out.println("Dia invalido!");
			}else{
				System.out.println("Total peças turno Matutino: ");
				totalPecasManha = sc.nextInt();
				System.out.println("Total peças turno Tarde: ");
				totalPecasTarde = sc.nextInt();
				totalPecas = totalPecasManha + totalPecasTarde;
				if(totalPecas >= 100 || dia >= 1 && dia <= 15){
					if(totalPecasManha >= 30 && totalPecasTarde >= 30){
						valor = totalPecas * 0.80;
					}else{
						valor = totalPecas * 0.50;
					}
					System.out.println("Valor recebido: "+valor);
				}else if(dia >= 16 && dia <= 30){
					valorManha = totalPecasManha * 0.40;
					valorTarde = totalPecasTarde * 0.30;
					System.out.println("Valor recebido Manha: "+valorManha);
					System.out.println("Valor recebido Tarde: "+valorTarde);
				}
				
				System.out.println("Novo Funcionario (1. Sim / 2. Não): ");
				novoFuncionario = sc.nextInt();
				if(novoFuncionario == 2){
					break;
				}
			}
		}
		sc.close();
	}
}
