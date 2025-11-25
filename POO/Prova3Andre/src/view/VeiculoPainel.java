package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VeiculoPainel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField placa;
    private JTextField modelo;
    private JTextField marca;
    private JTextField ano;
    private JButton btnCadastrar;

    public VeiculoPainel() {

        setLayout(null);
        setPreferredSize(new Dimension(900, 120));

        JLabel lblPlaca = new JLabel("Placa:");
        lblPlaca.setBounds(10, 10, 80, 20);
        add(lblPlaca);

        placa = new JTextField();
        placa.setBounds(70, 10, 100, 20);
        add(placa);

        JLabel lblModelo = new JLabel("Modelo:");
        lblModelo.setBounds(10, 40, 80, 20);
        add(lblModelo);

        modelo = new JTextField();
        modelo.setBounds(70, 40, 100, 20);
        add(modelo);

        JLabel lblMarca = new JLabel("Marca:");
        lblMarca.setBounds(10, 70, 80, 20);
        add(lblMarca);

        marca = new JTextField();
        marca.setBounds(70, 70, 100, 20);
        add(marca);

        JLabel lblAno = new JLabel("Ano:");
        lblAno.setBounds(200, 10, 80, 20);
        add(lblAno);

        ano = new JTextField();
        ano.setBounds(240, 10, 60, 20);
        add(ano);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(200, 40, 120, 30);
        add(btnCadastrar);
    }

    public String getPlaca() {
        return placa.getText();
    }

    public String getModelo() {
        return modelo.getText();
    }

    public String getMarca() {
        return marca.getText();
    }

    public int getAno() {
        return Integer.parseInt(ano.getText());
    }

    public void definirAcaoBotaoCadastrar(ActionListener acao) {
        btnCadastrar.addActionListener(acao);
    }

    public void limparCampos() {
        placa.setText("");
        modelo.setText("");
        marca.setText("");
        ano.setText("");
    }
}
