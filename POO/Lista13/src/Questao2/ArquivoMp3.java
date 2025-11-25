package Questao2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class ArquivoMp3 {

    private File arquivo;
    private TagMp3 tag;

    public ArquivoMp3(String caminho)
            throws FileNotFoundException, ArgumentoNaoEhArquivoException, ArquivoNaoTemTagMp3Exception {

        arquivo = new File(caminho);

        // 1) Não existe
        if (!arquivo.exists()) {
            throw new FileNotFoundException("Arquivo não encontrado: " + caminho);
        }

        // 2) Não é arquivo
        if (!arquivo.isFile()) {
            throw new ArgumentoNaoEhArquivoException("O caminho informado não é um arquivo.");
        }

        // 3) Ler TAG no final do arquivo
        tag = lerTag();
    }

    private TagMp3 lerTag() throws ArquivoNaoTemTagMp3Exception {

        try (RandomAccessFile raf = new RandomAccessFile(arquivo, "r")) {

            long tamanho = raf.length();

            // Volta 128 bytes a partir do final
            raf.seek(tamanho - 128);

            byte[] bloco = new byte[128];
            raf.readFully(bloco);

            // Primeiros 3 bytes são "TAG"
            String cabecalho = new String(bloco, 0, 3);

            if (!cabecalho.equals("TAG")) {
                throw new ArquivoNaoTemTagMp3Exception("Arquivo não possui TAG MP3 (ID3v1.1).");
            }

            // Extrai campos
            String titulo = new String(bloco, 3, 30).trim();
            String artista = new String(bloco, 33, 30).trim();
            String album = new String(bloco, 63, 30).trim();
            String ano = new String(bloco, 93, 4).trim();
            String comentario = new String(bloco, 97, 28).trim();
            int faixa = bloco[126] & 0xFF;
            int genero = bloco[127] & 0xFF;

            return new TagMp3(titulo, artista, album, ano, comentario, faixa, genero);
        }
        catch (Exception e) {
            throw new ArquivoNaoTemTagMp3Exception("Erro ao ler TAG: " + e.getMessage());
        }
    }

    public TagMp3 getTag() {
        return tag;
    }
}
