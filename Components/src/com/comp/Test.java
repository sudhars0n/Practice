package com.comp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        final SignaturePanel drawPad = new SignaturePanel();
        frame.add(drawPad, BorderLayout.CENTER);
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drawPad.clear();
            }
        });
        JButton save = new JButton("Save");
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if ("Save".equals(e.getActionCommand())) {
                    drawPad.capture();
                }
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(save);
        buttonPanel.add(clearButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}