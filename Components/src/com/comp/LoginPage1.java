package com.comp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage1 extends JFrame implements ActionListener {
     private JPanel contentPane;
     private JButton buttonOK;
     private JButton buttonCancel;
        static JFrame frame;
        static JButton button;
        public static void main(String[] args) {

            JFrame frame=new JFrame("LOGIN PAGE");

             JLabel label=new JLabel("USERNAME");

             JLabel label1=new JLabel("PASSWORD");

             JLabel label2=new JLabel("GENDER");

             JTextField textField=new JTextField();

             JPasswordField passwordField =new JPasswordField();

             JRadioButton radioButton=new JRadioButton("MALE");

             JRadioButton radioButton1=new JRadioButton("FEMALE");

              button=new JButton("LOGIN");

             LoginPage1 loginPage=new LoginPage1();

             label.setBounds(0,70,120,30);

             textField.setBounds(70,70,120,30);

             label1.setBounds(0,140,120,30);

             passwordField.setBounds(70,140,120,30);

             label2.setBounds(0,210,120,30);

             radioButton.setBounds(70,210,120,30);

             radioButton1.setBounds(200,210,120,30);

             button.setBounds(70,400,130,30);

             frame.add(label);
             frame.add(label1);
             frame.add(label2);
             frame.add(textField);
             frame.add(passwordField);
             frame.add(radioButton);
             frame.add(radioButton1);
             frame.add(button);
             button.addActionListener(loginPage);
             frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
             frame.setSize(600,600);
             frame.setLayout(null);
             frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent actionEvent) {
            String s=actionEvent.getActionCommand();

            if (s.equals("LOGIN")){
                JDialog dialog=new JDialog(frame,"click");
                JPanel panel=new JPanel();
                JLabel label=new JLabel("THIS IS dialog");

                panel.add(label);
                panel.setBorder(BorderFactory.createLineBorder(Color.black));
                panel.setBackground(Color.YELLOW);
                dialog.add(panel);

                dialog.setLocation(300,300);
                dialog.setSize(200,200);
                dialog.setVisible(true);

            }
    }
    }