import java.time.Year;

public class Uni5Exe22 {
	public static void main(String[] args) {
		double salario = 2000.00, aumento = 0.015;
        int ano = 1996, anoAtual = Year.now().getValue();;
        while (ano <= anoAtual) {
            salario += salario * aumento;

            if (ano >= 1997) {
                aumento *= 2;
            }

            ano++;
        }
		System.out.println("Salario: "+salario);
	}
}
