package Lexical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Syntax_GUI extends javax.swing.JFrame {
    private JButton btLoadFile;
    private JButton btAnalyze;
    private JTextArea txtAreaErrors;
    private JPanel mainPanel;
    private JLabel lblPath;
    private String path;

    public Syntax_GUI(){
        setTitle("Analizador Sintáctico");
        Dimension screenSize = new Dimension(650, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        mainPanel.setPreferredSize(screenSize);

        setLocationRelativeTo(null);
        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
        btLoadFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser choice = new JFileChooser();
                if (choice.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    try {
                        path = choice.getSelectedFile().getAbsolutePath();
                        lblPath.setText(path);
                    } catch (Exception ex) {
                        infoBox("Archivo no valido", "Error");
                    }
                } else {
                    infoBox("No seleccionó un archivo", "Error");
                }
            }
        });
        btAnalyze.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(new File(path).isFile()) {
                    Lexical lex;
                    try {
                        lex = new Lexical();
                        System.out.println("Se ha generado el analyzador lexico");

                        lex.transform(path);

                        infoBox("Análisis Léxico Completado", "Análisis Lézico");
                        lblPath.setText("Ingresar ruta del archivo...");
                        // TODO:
                        // implement logic to sintactically analyze a file
                        // TODO:
                        // Display the errors found in the analysis.
                        path = "";
                    } catch (IOException ex) {
                        infoBox("Error, no se ha seleccionado un archivo", "Error");
                    }
                }else{
                    infoBox("El archivo no existe", "Error");
                }
            }
        });
    }

    /**
     * Object that displays a message to the user
     * @param infoMessage
     * @param titleBar
     */
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
