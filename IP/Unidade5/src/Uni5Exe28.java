import java.util.Scanner;

public class Uni5Exe28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int votosNenhum = 0, votosCPM22 = 0, votosSkank = 0, votosJota = 0, totalVotos = 0, voto = 0, maior = 0;
        String maisVoto = "s", vencedor = "Nenhum de Nós";

        while (maisVoto.equalsIgnoreCase("s")) {
            System.out.println("Vote no seu grupo favorito:");
            System.out.println("1 - Nenhum de Nós");
            System.out.println("2 - CPM22");
            System.out.println("3 - Skank");
            System.out.println("4 - Jota Quest");
            System.out.print("Digite o código do voto: ");
            voto = sc.nextInt();
            if (voto == 1) {
                votosNenhum++;
                totalVotos++;
            } else if (voto == 2) {
                votosCPM22++;
                totalVotos++;
            } else if (voto == 3) {
                votosSkank++;
                totalVotos++;
            } else if (voto == 4) {
                votosJota++;
                totalVotos++;
            } else {
                System.out.println("Voto inválido! Tente novamente.");
                continue;
            }

            System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
            maisVoto = sc.next();
        }

        System.out.println("Nenhum de Nós: " + votosNenhum + " votos (" + ((votosNenhum * 100.0) / totalVotos) + "%)");
        System.out.println("CPM22: " + votosCPM22 + " votos (" + ((votosCPM22 * 100.0) / totalVotos) + "%)");
        System.out.println("Skank: " + votosSkank + " votos (" + ((votosSkank * 100.0) / totalVotos) + "%)");
        System.out.println("Jota Quest: " + votosJota + " votos (" + ((votosJota * 100.0) / totalVotos) + "%)");

        maior = votosNenhum;
        vencedor = "Nenhum de Nós";

        if (votosCPM22 > maior) {
            maior = votosCPM22;
            vencedor = "CPM22";
        }
        if (votosSkank > maior) {
            maior = votosSkank;
            vencedor = "Skank";
        }
        if (votosJota > maior) {
            maior = votosJota;
            vencedor = "Jota Quest";
        }

        System.out.println("\nGrupo vencedor: " + vencedor);
        sc.close();
	}
}
