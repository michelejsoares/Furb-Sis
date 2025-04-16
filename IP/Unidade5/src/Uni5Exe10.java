public class Uni5Exe10 {
    public static void main(String[] args) {
        int encontrados = 0, frenteNumero = 0, trasNumero = 0, soma = 0;
        String formato;
        for (int i = 1; encontrados < 10; i++) {
            formato = String.format("%04d", i);
            frenteNumero = Integer.parseInt(formato.substring(0, 2));
            trasNumero = Integer.parseInt(formato.substring(2, 4));
            soma = frenteNumero + trasNumero;

            if (soma * soma == i) {
                System.out.println(i);
                encontrados++;
            }
        }
    }
}
