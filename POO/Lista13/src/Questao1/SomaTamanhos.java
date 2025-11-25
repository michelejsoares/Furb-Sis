package Questao1;

import java.io.File;

public class SomaTamanhos {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Informe o diretório: ");
        String caminho = sc.nextLine();

        File dir = new File(caminho);

        if (!dir.exists()) {
            throw new RuntimeException("Diretório inexistente!");
        }

        long totalBytes = soma(dir);
        double totalMB = totalBytes / (1024.0 * 1024.0);

        System.out.printf("Tamanho total: %.2f MB%n", totalMB);
    }

    public static long soma(File f) {
        long total = 0;

        if (f.isFile()) {
            return f.length();
        }

        File[] files = f.listFiles();
        if (files != null) {
            for (File arq : files) {
                total += soma(arq);
            }
        }

        return total;
    }
}
