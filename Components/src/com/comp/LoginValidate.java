package com.comp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginValidate<text> extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    static JFrame frame;
    static JButton button;
    static JTextField text;
    static JPasswordField passwordfield;
    static Pattern pat;
    static Matcher matcher;
    static Matcher matcher1;

    public static void main(String[] args) {

        JFrame frame = new JFrame("LOGIN PAGE");

        JLabel label = new JLabel("USERNAME");

        JLabel label1 = new JLabel("PASSWORD");

        JLabel label2 = new JLabel("GENDER");

        text = new JTextField();
        passwordfield = new JPasswordField();

        JRadioButton radioButton = new JRadioButton("MALE");

        JRadioButton radioButton1 = new JRadioButton("FEMALE");


        LoginValidate loginvalidate = new LoginValidate();

        label.setBounds(0, 70, 120, 30);

        text.setBounds(70, 70, 120, 30);

        label1.setBounds(0, 140, 120, 30);

        passwordfield.setBounds(70, 140, 120, 30);

        label2.setBounds(0, 210, 120, 30);

        radioButton.setBounds(70, 210, 120, 30);

        radioButton1.setBounds(200, 210, 120, 30);
        button = new JButton("LOGIN");

        button.setBounds(70, 300, 130, 30);

        button.addActionListener(loginvalidate);

        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(text);
        frame.add(passwordfield);
        frame.add(radioButton);
        frame.add(radioButton1);


        frame.add(button);
        frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        System.out.println(s);


        if (s.equals("LOGIN")) {

            String st = text.getText();
            System.out.println("testing--->" + st);
            char[] stringTxt =passwordfield.getPassword();
            System.out.println("testing pass--->" + stringTxt);

            pat = Pattern.compile("[a-z,A-Z,%@!()*~^!#$%&+/-]");
            matcher = pat.matcher(st);

            //matcher1= pat.matcher(st1);

            if (matcher.find() ) {
                JDialog dialog = new JDialog(frame, "click");
                JPanel panel = new JPanel();
                JLabel label = new JLabel("LOGIN SUCCESSFUL");

                panel.add(label);
                panel.setBorder(BorderFactory.createLineBorder(Color.black));
                panel.setBackground(Color.YELLOW);
                dialog.add(panel);

                dialog.setLocation(300, 300);
                dialog.setSize(200, 200);
                dialog.setVisible(true);
                repaint();
            } else {
                JDialog dialog = new JDialog(frame, "click");
                JPanel panel = new JPanel();
                JLabel label = new JLabel("INVALID CREDENTIAL!!!");

                panel.add(label);
                panel.setBorder(BorderFactory.createLineBorder(Color.black));
                panel.setBackground(Color.red);
                dialog.add(panel);

                dialog.setLocation(300, 300);
                dialog.setSize(200, 200);
                dialog.setVisible(true);
            }
        }
    }
}