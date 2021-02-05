package com.comp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class SignatureBoxDemo extends JFrame implements MouseMotionListener, ActionListener {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    SignatureBoxDemo() {
        JFrame frame = new JFrame("WELCOME");
        JButton button = new JButton("LOGIN");
        button.setBounds(70,140,80,30);
        frame.add(button);
        frame.setSize(600,600);
        frame.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {

    }

    public void mouseDragged(MouseEvent e) {

    }

    public void mouseMoved(MouseEvent e) {

    }

    public static void main(String[] args) {

    }

}
