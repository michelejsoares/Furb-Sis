package exemplo;

import java.util.Scanner;



public class App {

	public static void main(String[] args) {
		/*ContaBancaria conta = new ContaBancaria();
		System.out.println(conta.getSaldo());
		conta.depositar(100);
		System.out.println(conta.getSaldo());
		conta.setSaldo(2000000);
		System.out.println(conta.getSaldo());
		conta.setSaldo(200);
		System.out.println(conta.getSaldo());*/
		
		Scanner scanner = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[3];
		for(int i=0; i < 3; i++) {
		    Pessoa p = new Pessoa();
		    System.out.println(p.getNome());

		    System.out.println("Informa o nome da pessoa ");
		    p.setNome(scanner.next());
		    System.out.println(p.getNome());
		    System.out.println("Informa o peso da pessoa ");
		    p.setPeso(scanner.nextDouble());
		    System.out.println("Informa a altura da pessoa ");
		    p.setAltura(scanner.nextDouble());

		    pessoas[i] = p;
		}

		for(int i=0; i<3; i++){
		    Pessoa p = pessoas[i];
		    System.out.println("Nome : " + p.getNome() + " Imc : " + p.calcularImc());
		}
		scanner.close();

	}

}
