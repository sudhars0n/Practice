package com.comp;

import javax.swing.*;

public class LoginPage extends JFrame {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;


    public LoginPage() {

        JFrame frame = new JFrame("LOGIN PAGE");

        JLabel label = new JLabel("USERNAME :");
        JLabel label1 = new JLabel("PASSWORD :");
        JLabel label2 = new JLabel("GENDER :");

        JTextField textField = new JTextField();
        JTextField textField1 = new JTextField();

        JButton button = new JButton("LOGIN");

        JWindow window = new JWindow();
        label.setBounds(30, 70, 120, 30);
        label1.setBounds(30, 140, 100, 30);
        label2.setBounds(30, 210, 100, 30);

        textField.setBounds(150, 70, 120, 30);
        textField1.setBounds(150, 140, 120, 30);

        JRadioButton radioButton = new JRadioButton("MALE");
        radioButton.setBounds(150, 210, 120, 30);

        JRadioButton radioButton1 = new JRadioButton("FEMALE");
        radioButton1.setBounds(300, 210, 100, 30);

        //ButtonGroup buttonGroup=new ButtonGroup();


        button.setBounds(150, 300, 150, 30);

        //buttonGroup.add(radioButton);
        //buttonGroup.add(radioButton1);

        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(textField);
        frame.add(textField1);
        frame.add(radioButton);
        frame.add(radioButton1);

        frame.add(button);

        setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        frame.setSize(800, 800);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        LoginPage obj = new LoginPage();

    }
}