package com.guv;

import javax.swing.*;
import java.awt.event.*;

public class Table2 extends JFrame {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public static void main(String[] args) {

        JFrame frame=new JFrame("JAVA FRAME");
        JLabel label =new JLabel("Welcome");
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}