import java.util.Scanner;

public class Uni5Exe34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int opcao = 0, contasEncerradas = 0;

        do {
            System.out.println("MENU");
            System.out.println("(1) Encerrar conta de um hóspede");
            System.out.println("(2) Verificar número de contas encerradas");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do hóspede: ");
                    String nome = sc.nextLine();

                    System.out.print("Número de diárias: ");
                    int dias = sc.nextInt();

                    double taxa;
                    if (dias < 15) {
                        taxa = 7.50;
                    } else if (dias == 15) {
                        taxa = 6.50;
                    } else {
                        taxa = 5.00;
                    }

                    double total = dias * (50.00 + taxa);

                    System.out.printf("Hóspede: %s\nTotal a pagar: R$ %.2f\n", nome, total);
                    contasEncerradas++;
                    break;

                case 2:
                    System.out.println("Contas encerradas: " + contasEncerradas);
                    break;

                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);

        sc.close();
	}
}
