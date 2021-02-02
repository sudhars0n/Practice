package com.comp;


import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JWindowDemo extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    static JFrame frame;

    public static void main(String[] args) {

        JWindowDemo obj = new JWindowDemo();
        frame = new JFrame("JWindow");
        JPanel panel = new JPanel();
        JButton button = new JButton("CLICK ME...");
        button.addActionListener(obj);
        panel.add(button);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent actionEvent) {
        String s = actionEvent.getActionCommand();
        if (s.equals("CLICK ME...")) {
            JWindow window = new JWindow(frame);
            JWindow window1 = new JWindow(frame);

            JPanel panel = new JPanel();
            JPanel panel1 = new JPanel();

            JLabel label = new JLabel("Open");
            JLabel label1 = new JLabel("Edit");

            panel.setBorder(BorderFactory.createLineBorder(Color.blue));
            panel1.setBorder(BorderFactory.createLineBorder(Color.blue));

            panel.add(label);
            panel1.add(label1);

            window.add(panel);
            window1.add(panel1);

            panel.setBackground(Color.yellow);
            panel1.setBackground(Color.yellow);

            window.setBounds(100,100,100,100);
            window1.setBounds(300,100,300,300);

            window.setSize(150, 150);
            window1.setSize(150, 150);

            window.setVisible(true);
            window1.setVisible(true);

        }
    }
}
