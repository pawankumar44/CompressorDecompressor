package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import comp_decomp.compressor;
import comp_decomp.decompressor;


//for basic ui for our project
//JFrame as our main window. From JFrame we put our components
//Action Listener to detect which button are pressed and perform its function
public class AppFrame extends JFrame implements ActionListener {

    JButton compressButton;
    JButton decompressButton;

    AppFrame(){
        //exit on clicking the close button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this line is imp, without that my 1st button was not appearing
        //TODO: Doubt to ask
        this.getContentPane().setLayout(null);
        compressButton = new JButton("Select file to compress");
        compressButton.setBounds(100,100,200,30);
        compressButton.addActionListener(this);

        decompressButton = new JButton("Select file to decompress");
        decompressButton.setBounds(400,100,200,30);
        decompressButton.addActionListener(this);

        this.add(compressButton);
        this.add(decompressButton);
        this.setSize(1000,500);
        this.getContentPane().setBackground(Color.YELLOW);
        this.setVisible(true);
    }

    @Override
    public void  actionPerformed(ActionEvent e){
        if(e.getSource() == compressButton){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                //prefer text editor comments for understanding
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                try{
                    //after importing the packge
                    compressor.method(file);
                }
                //general error catch
                catch (Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }

        if(e.getSource() == decompressButton){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                //prefer text editor comments for understanding
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                try{
                    //after importing the packge
                    decompressor.method(file);
                }
                //general error catch
                catch (Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
    }

}
