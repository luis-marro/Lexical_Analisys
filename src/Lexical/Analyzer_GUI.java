package Lexical;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Analyzer_GUI extends javax.swing.JFrame{


    private JTextField txtFilePath;
    private JButton btOpenFile;
    private JButton btSeeResult;
    private String path;

    public Analyzer_GUI(){

        btOpenFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser choice = new JFileChooser();
                if (choice.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    try{
                        path = choice.getSelectedFile().getAbsolutePath();
                        txtFilePath.setText(path);
                    }catch (Exception ex){
                        infoBox("Archivo no valido", "Error");
                    }
                }else{
                    infoBox("No selecciono un archivo", "Error");
                }
            }
        });
    }

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }




}
