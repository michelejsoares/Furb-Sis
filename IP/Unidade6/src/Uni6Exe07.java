import java.util.Scanner;

public class Uni6Exe07 {
	public static void main(String[] args) {
		new Uni6Exe07();
	}
	private int n = 2;
	private int[] vetor = new int[n];

	private Uni6Exe07(){
		inserirValores();
	}
	private void inserirValores(){
		int valor = 0;
		Scanner sc = new Scanner(System.in);		
		for(int i = 0; i < n; i ++){
			System.out.println("Informe um valor: ");
			valor = sc.nextInt();
			for(int j = 0; j < n; j++){
				if(valor == vetor[j]){
					System.out.println("Valor igual");
				}else{
					vetor[i] = valor;
				}
			}
		}
		sc.close();
	}
}
