package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//for basic ui for our project
//JFrame as our main window. From JFrame we put our components
//Action Listener to detect which button are pressed and perform its function
public class AppFrame extends JFrame implements ActionListener {

    JButton compressButton;
    JButton decompressButton;

    AppFrame(){
        //exit on clicking the close button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        compressButton = new JButton("Select file to compress");
        compressButton.setBounds(20,100,200,30);

        decompressButton = new JButton("Select file to decompress");
        decompressButton.setBounds(250,100,200,30);

        this.add(compressButton);
        this.add(decompressButton);
        this.setSize(1000,500);
        this.getContentPane().setBackground(Color.YELLOW);
        this.setVisible(true);
    }

    @Override
    public void  actionPerformed(ActionEvent e){

    }

}
