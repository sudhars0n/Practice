package com.comp;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

 public  class JDialogDem extends JFrame implements ActionListener{
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    static JFrame frame;
    public static void main(String[] args) {



        TextField tf=new TextField();
        tf.setBounds(50,50,150,20);

        JDialogDem  obj=new JDialogDem();
        JButton button=new JButton("CLICK HERE...");
        button.setBounds(50,80,160,40);
        frame = new JFrame("Welcome TO The Page");
        frame.add(tf);
        frame.add(button);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);

    }

    public void actionPerformed( ActionEvent actionEvent) {

//        String obj1=actionEvent.getActionCommand();
//        if( obj1.equals("CLICK HERE..."))
//        JDialog d=new JDialog (frame,"Dialog box");
//        JLabel label = new JLabel("This Is A d BOx");
//        d.setSize(100,100);
//        d.add(label);d.setVisible(true);
    }


}