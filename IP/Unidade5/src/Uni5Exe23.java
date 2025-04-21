import java.util.Scanner;

public class Uni5Exe23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String condicao = "", condicaoMaiuscula = "", nome = "";
		float precoUnitario  = 0.0f;
		int qtdVendida = 0, qtd = 0;
		double salario = 0.0f, valorProduto = 0.0, valorVenda = 0.0;
		while (true) {
			System.out.println("Nome Vendedor:");
			nome = sc.next();
			System.out.println("Quantidade de produtos vendidos: ");
			qtd = sc.nextInt();
			for(int i = 0; i < qtd; i++){
				System.out.println("Preço Produto: ");
				precoUnitario = sc.nextFloat();
				System.out.println("Qtd. Vendida");
				qtdVendida = sc.nextInt();
				valorProduto = precoUnitario * 0.3;
				salario += valorProduto * qtdVendida;
				valorVenda += precoUnitario * qtdVendida;
			}
			System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
			condicao = sc.next();
			condicaoMaiuscula = condicao.toUpperCase();
			if(condicaoMaiuscula.equals("N")){
				break;
			}
			
		}
		System.out.println("Nome Funcionario: "+nome);
		System.out.println("Valor Venda: "+valorVenda);
		System.out.println("Salario (30% comissao): "+salario);
		sc.close();
	}
}
