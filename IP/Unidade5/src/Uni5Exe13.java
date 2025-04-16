public class Uni5Exe13 {
	public static void main(String[] args) {
		System.out.print("Número total de reabastecimentos: ");
        int totalParadas = sc.nextInt();

        double odometroAnterior = 0;
        double totalKm = 0;
        double totalLitros = 0;

        for (int i = 1; i <= totalParadas; i++) {
            System.out.print("Parada " + i + " - Quilometragem: ");
            double odometroAtual = sc.nextDouble();

            System.out.print("Parada " + i + " - Combustível (litros): ");
            double litros = sc.nextDouble();

            double kmRodado = odometroAtual - odometroAnterior;
            double kmPorLitro = kmRodado / litros;

            System.out.printf("Parada %d: %.2f km por litro\n", i, kmPorLitro);

            odometroAnterior = odometroAtual;
            totalKm += kmRodado;
            totalLitros += litros;
        }

        double media = totalKm / totalLitros;
        System.out.printf("Quilometragem média obtida por litro: %.2f\n", media);
	}
}
