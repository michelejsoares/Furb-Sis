import java.util.Scanner;

public class Uni5Exe33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
        int nulos = 0, brancos = 0, total = 0;
        int voto;

        do {
            System.out.print("Digite seu voto (1-4 para candidatos, 5 = nulo, 6 = branco, 0 = sair): ");
            voto = sc.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    total++;
                    break;
                case 2:
                    candidato2++;
                    total++;
                    break;
                case 3:
                    candidato3++;
                    total++;
                    break;
                case 4:
                    candidato4++;
                    total++;
                    break;
                case 5:
                    nulos++;
                    total++;
                    break;
                case 6:
                    brancos++;
                    total++;
                    break;
                case 0:
                    System.out.println("Encerrando a votação...");
                    break;
                default:
                    System.out.println("Opção incorreta. Tente novamente.");
            }
        } while (voto != 0);

        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");
        System.out.println("Candidato 4: " + candidato4 + " votos");
        System.out.println("Votos nulos: " + nulos);
        System.out.println("Votos em branco: " + brancos);

        if (total > 0) {
            double percNulosBrancos = ((double)(nulos + brancos) / total) * 100;
            System.out.printf("Percentual de nulos e brancos: %.2f%%\n", percNulosBrancos);
        } else {
            System.out.println("Nenhum voto foi computado.");
        }

        sc.close();
	}
}
