/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.senai.sc.edu.exemplogridbaglayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Acer
 */
public class ExemploGridBagLayout extends JFrame {
    private JPanel panel;
    private JLabel labelNome;
    private JLabel labelSobrenome;
    private JTextField textFieldNome;
    private JTextField textFieldSobrenome;
    private JButton button;

    ExemploGridBagLayout() {
        panel = new JPanel(new GridBagLayout());
        labelNome = new JLabel("Nome: ");
        labelSobrenome = new JLabel("Sobrenome: ");
        textFieldNome = new JTextField(15);
        textFieldSobrenome = new JTextField(15);
        button = new JButton("Enviar");
        
        // Adiciona o ActionListener ao botão
        button.addActionListener((ActionEvent e) -> {
            String nome = textFieldNome.getText();
            String sobrenome = textFieldSobrenome.getText();
            JOptionPane.showMessageDialog(null, "Olá, " + nome + sobrenome + "!");
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);  // Adiciona margens
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Configuração do labelNome
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(labelNome, gbc);
        
        // Configuração do textField Nome
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        panel.add(textFieldNome, gbc);
        
        // Configuração do labelSobreNome
        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(labelSobrenome, gbc);
        
        // Configuração do textField Sobrenome
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        panel.add(textFieldSobrenome, gbc);

        // Configuração do button
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.weightx = 0;
        panel.add(button, gbc);

        add(panel);

        // Configurações da janela
        setTitle("Minha Janela com GridBagLayout");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ExemploGridBagLayout().setVisible(true));
    }
}
