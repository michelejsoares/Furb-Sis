import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaChegada= 0, minChegada = 0, horaSaida = 0, minSaida = 0, totalMinutosChegada = 0, totalMinutosSaida = 0, duracaoMinutos = 0, horas = 0, minutos = 0;
        double preco = 0;
        System.out.print("Hora de chegada: ");
        horaChegada = sc.nextInt();
        System.out.print("Minuto de chegada: ");
        minChegada = sc.nextInt();
        System.out.print("Hora de saída: ");
        horaSaida = sc.nextInt();
        System.out.print("Minuto de saída: ");
        minSaida = sc.nextInt();
        
        if (horaChegada < 0 || horaChegada >= 24 || horaSaida < 0 || horaSaida >= 24 ||
            minChegada < 0 || minChegada >= 60 || minSaida < 0 || minSaida >= 60) {
            System.out.println("Entrada inválida! Tente novamente.");
            sc.close();
            return;
        }
        totalMinutosChegada = horaChegada * 60 + minChegada;
        totalMinutosSaida = horaSaida * 60 + minSaida;
        
        if (totalMinutosSaida < totalMinutosChegada) {
            totalMinutosSaida += 24 * 60;
        }
        
        duracaoMinutos = totalMinutosSaida - totalMinutosChegada;
        
        horas = duracaoMinutos / 60;
        minutos = duracaoMinutos % 60;
        
        if (minutos >= 30) {
            horas++;
        } else if (minutos < 30 && horas == 0 && minutos > 0) {
            horas = 1;
        }

        if (horas <= 2) {
            preco = horas * 5.00;
        } else if (horas <= 4) {
            preco = 2 * 5.00 + (horas - 2) * 7.50;
        } else {
            preco = 2 * 5.00 + 2 * 7.50 + (horas - 4) * 10.00;
        }

        System.out.println(String.format("Preço cobrado = R$%.2f", preco));
        
        sc.close();
    }
}
