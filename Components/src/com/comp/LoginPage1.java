package com.comp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage1 extends JFrame implements ActionListener {
     private JPanel contentPane;
     private JButton buttonOK;
     private JButton buttonCancel;
        static JFrame frame;
        public static void main(String[] args) {

            JFrame frame=new JFrame("LOGIN PAGE");

             JLabel label=new JLabel("USERNAME");

             JLabel label1=new JLabel("PASSWORD");

             JLabel label2=new JLabel("GENDER");

             JTextField textField=new JTextField();

             JPasswordField passwordField =new JPasswordField();

             JRadioButton radioButton=new JRadioButton();

             JRadioButton radioButton1=new JRadioButton();

             JButton button=new JButton("LOGIN");


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








    }
    public void actionPerformed(ActionEvent actionEvent) {

    }
    }