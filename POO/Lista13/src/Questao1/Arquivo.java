package Questao1;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Arquivo extends JFrame {

    private JTextField txtDiretorio;
    private JButton btnSelecionar;
    private JButton btnCalcular;
    private JTextArea txtResultado;

    public Arquivo() {

        setTitle("Calcular Tamanho do Diretório");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new BorderLayout());

        // Painel superior
        JPanel painelTop = new JPanel(new FlowLayout());

        txtDiretorio = new JTextField(25);
        txtDiretorio.setEditable(false);

        btnSelecionar = new JButton("Selecionar Diretório");
        btnCalcular = new JButton("Calcular Tamanho");

        painelTop.add(txtDiretorio);
        painelTop.add(btnSelecionar);
        painelTop.add(btnCalcular);

        painel.add(painelTop, BorderLayout.NORTH);

        // Área de resultado
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        painel.add(new JScrollPane(txtResultado), BorderLayout.CENTER);

        add(painel);

        // Eventos
        btnSelecionar.addActionListener(e -> selecionarDiretorio());
        btnCalcular.addActionListener(e -> calcular());
    }

    private void selecionarDiretorio() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int resultado = chooser.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File dir = chooser.getSelectedFile();
            txtDiretorio.setText(dir.getAbsolutePath());
        }
    }

    private void calcular() {
        String caminho = txtDiretorio.getText();

        if (caminho.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione um diretório primeiro!");
            return;
        }

        File dir = new File(caminho);

        if (!dir.exists()) {
            JOptionPane.showMessageDialog(this, "Diretório inexistente!");
            return;
        }

        long totalBytes = SomaTamanhos.soma(dir);
        double totalMB = totalBytes / (1024.0 * 1024.0);

        txtResultado.setText(String.format("Tamanho total: %.2f MB", totalMB));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Arquivo().setVisible(true));
    }
}
