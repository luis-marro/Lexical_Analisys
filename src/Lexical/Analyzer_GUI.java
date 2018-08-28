package Lexical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Lexical.Lexical;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.IOException;
import java.io.File;

public class Analyzer_GUI extends javax.swing.JFrame{


    private JTextField txtFilePath;
    private JButton btOpenFile;
    private JButton btEvaluate;
    private JPanel mainPanel;
    private String path;


    public Analyzer_GUI(){

        //add(txtFilePath);
        //add(btOpenFile);
        //add(btEvaluate);
        setTitle("Analizador Léxico");
        Dimension screenSize = new Dimension(500, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        mainPanel.setPreferredSize(screenSize);

        setLocationRelativeTo(null);
        add(mainPanel);
        pack();

        btOpenFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JFileChooser choice = new JFileChooser();
                    if (choice.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                        try {
                            path = choice.getSelectedFile().getAbsolutePath();
                            txtFilePath.setText(path);
                        } catch (Exception ex) {
                            infoBox("Archivo no valido", "Error");
                        }
                    } else {
                        infoBox("No selecciono un archivo", "Error");
                    }

            }
        });
        btEvaluate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(new File(path).isFile()) {
                    Lexical lex;
                    try {
                        lex = new Lexical();
                        System.out.println("Se ha generado el analyzador lexico");

                        lex.transform(path);
                        System.out.println("Se ha analizado el archivo");

                        infoBox("Archivo convertido con éxito", "Archivo convertido");
                        txtFilePath.setText("Ingresar ruta del archivo...");
                    } catch (IOException ex) {
                        infoBox("Error, no se ha seleccionado un archivo", "Error");
                    }
                }else{
                    infoBox("El archivo no existe", "Error");
                }
            }
        });
        txtFilePath.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                txtFilePath.setText("");
            }
        });
        txtFilePath.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                txtFilePath.setText("Ruta del archivo a analizar...");
            }
        });
    }

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }




}
