package com.comp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage2 extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;


    static JFrame frame;
    static JButton button;
    static JTextField textField;
    static JPasswordField passwordField;

    public static void main(String[] args) {

        JFrame frame = new JFrame("LOGIN PAGE");

        JLabel label = new JLabel("USERNAME");

        JLabel label1 = new JLabel("PASSWORD");

        JLabel label2 = new JLabel("GENDER");

        textField = new JTextField("Enter the username",21);
        passwordField = new JPasswordField();

        JRadioButton radioButton = new JRadioButton("MALE");

        JRadioButton radioButton1 = new JRadioButton("FEMALE");


        LoginPage2 loginPage2 = new LoginPage2();

        label.setBounds(0, 70, 120, 30);

        textField.setBounds(70, 70, 120, 30);

        label1.setBounds(0, 140, 120, 30);

        passwordField.setBounds(70, 140, 120, 30);

        label2.setBounds(0, 210, 120, 30);

        radioButton.setBounds(70, 210, 120, 30);

        radioButton1.setBounds(200, 210, 120, 30);
        button = new JButton("LOGIN");
        button.setBounds(70, 300, 130, 30);

        button.setEnabled(false);

        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(textField);
        frame.add(passwordField);
        frame.add(radioButton);
        frame.add(radioButton1);


        textField.addActionListener(loginPage2);
        passwordField.addActionListener(loginPage2);

        frame.add(button);
        frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent actionEvent) {
        String s = actionEvent.getActionCommand();
        String s1 = String.valueOf(passwordField.getPassword());
        System.out.println(s);
        if (s.equals("sudharson")) {

            button.setEnabled(true);
            JDialog dialog = new JDialog(frame, "LOGIN SUCCESSFUL");
            JPanel panel = new JPanel();
            JLabel label = new JLabel("THIS IS dialog");

            panel.add(label);
            panel.setBorder(BorderFactory.createLineBorder(Color.black));
            panel.setBackground(Color.YELLOW);
            dialog.add(panel);

            dialog.setLocation(300, 300);
            dialog.setSize(200, 200);
            dialog.setVisible(true);

        } else {
            button = new JButton("LOGIN");
            button.setBounds(70, 400, 130, 30);
            frame.add(button);

            JDialog dialog = new JDialog(frame, "Invalid Password");
            JPanel panel2 = new JPanel();
            JLabel label = new JLabel("THIS IS dialog");

            panel2.add(label);
            panel2.setBorder(BorderFactory.createLineBorder(Color.black));
            panel2.setBackground(Color.YELLOW);
            dialog.add(panel2);

            dialog.setLocation(300, 300);
            dialog.setSize(200, 200);
            dialog.setVisible(true);

        }

    }

}
