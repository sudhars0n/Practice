package com.comp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signnature01 extends JDialog implements ActionListener {
    public static JFrame frame;
    Signature02 sign;
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public void Caller(){
       Signature02.main(null);
    }

    public static void main(String[] args) {

        frame = new JFrame("This is a frame");
        JButton button = new JButton("LOGIN");
        button.setBounds(140, 210, 80, 60);
        Signnature01 obj = new Signnature01();
        button.addActionListener(obj);

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(600,600);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
     String s=e.getActionCommand();
     if (s.equals("LOGIN")){
           Caller();
     }
    }
}