package controle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Gera IDs sequenciais persistentes no arquivo idContador.txt.
 */
public class IdGerador {
    private static final Path PATH = Path.of("idContador.txt");
    private static int contador = 0;

    static {
        try {
            if (!Files.exists(PATH)) {
                Files.writeString(PATH, "0");
                contador = 0;
            } else {
                String s = Files.readString(PATH).trim();
                if (s.isEmpty()) {
                    contador = 0;
                    Files.writeString(PATH, "0", StandardOpenOption.TRUNCATE_EXISTING);
                } else {
                    try {
                        contador = Integer.parseInt(s);
                    } catch (NumberFormatException ex) {
                        contador = 0;
                        Files.writeString(PATH, "0", StandardOpenOption.TRUNCATE_EXISTING);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            contador = 0;
        }
    }

    /**
     * Inicializa o contador com o maior id já existente (não decrementa).
     * Use this at startup: IdGerador.iniciar(maxId);
     */
    public static synchronized void iniciar(int lastId) {
        if (lastId <= 0) return; // nada a fazer
        if (lastId > contador) {
            contador = lastId;
            try {
                Files.writeString(PATH, String.valueOf(contador), StandardOpenOption.TRUNCATE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Retorna o próximo ID (incrementa e persiste).
     * @return próximo id (int), ou -1 em caso de erro.
     */
    public static synchronized int novoId() {
        try {
            contador = contador + 1;
            Files.writeString(PATH, String.valueOf(contador), StandardOpenOption.TRUNCATE_EXISTING);
            return contador;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * Retorna o valor atual do contador (sem incrementar).
     */
    public static synchronized int getAtual() {
        return contador;
    }
}
