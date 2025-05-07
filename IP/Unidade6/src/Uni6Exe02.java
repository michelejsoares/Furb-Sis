import java.util.Scanner;

public class Uni6Exe02 {
	public static void main(String[] args) {
		new Uni6Exe02();
	}
	private int qtdVezes = 12;
	private double numeros[] = new double[qtdVezes];
	private double somaMedia = 0.0, media = 0.0, valoresMaiores = 0.0;

	private Uni6Exe02(){
		lerValores();
		calcularMedia();
		posicaoValores();
	}

	private void lerValores(){
		Scanner sc = new Scanner(System.in);
		int nItens = numeros.length, nCount = 1;
		for(int i = 0; i < nItens; i++){
			System.out.print("Informe o "+nCount+"º numero: ");
			numeros[i] = sc.nextDouble();
			somaMedia += numeros[i];
			nCount++;
		}
		sc.close();
	}

	private void calcularMedia(){
		media = somaMedia / qtdVezes;
	}

	private void posicaoValores(){
		System.out.println("A media é: "+media);
		System.out.print("Os valores maiores que a média são: ");
		int nItens = numeros.length;
		String cVirgula = "";
		for(int i = 0; i < nItens; i++){
			if(numeros[i] > media){
				valoresMaiores = numeros[i];
				System.out.print(cVirgula+valoresMaiores);
				cVirgula = ", ";
			}
		}
	}
}
