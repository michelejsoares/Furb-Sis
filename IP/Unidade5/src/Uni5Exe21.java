public class Uni5Exe21 {
	public static void main(String[] args) {
		int qtdAno = 0, alturaZe = 110, alturaChico = 150;
		while (alturaZe <= alturaChico) {
			alturaChico += 2;
			alturaZe += 3;
			qtdAno++;
		}
		System.out.println("Quantidade de anos necessarios para que a altura do Ze seja maior que o Chico: "+qtdAno);
	}
}
