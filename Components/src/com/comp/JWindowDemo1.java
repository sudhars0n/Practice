package com.comp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JWindowDemo1 extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

      static JFrame f;

        public static void main(String[] args) {
            f = new JFrame("frame");

            JWindowDemo1 obj = new JWindowDemo1();
            JPanel p = new JPanel();

            JButton b = new JButton("click");

            b.addActionListener(obj);

            p.add(b);

            f.add(p);

            f.setSize(400, 400);

            f.setVisible(true);
        }


        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            if (s.equals("click")) {

                JWindow w = new JWindow();

                JPanel p = new JPanel();


                JLabel l = new JLabel("this is a window");


                p.setBorder(BorderFactory.createLineBorder(Color.black));

                p.add(l);
                w.add(p);


                p.setBackground(Color.red);
                w.setSize(200, 100);
                w.setVisible(true);
                w.setLocation(100, 100);
            }
        }

    }
