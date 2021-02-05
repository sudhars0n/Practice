package com.comp;

import javax.swing.*;
import java.awt.*;


 public class Demo1 extends JPanel{
     private JPanel contentPane;
     private JButton buttonOK;
     private JButton buttonCancel;

     private int x;
        private int y;
        public Demo1()
        {
            x=100;
            y=100;
            this.setBackground(Color.RED);
        }

        //--------------------------------

        @Override
        public void paint(Graphics g)
        {
            super.paint(g);

            g.setColor(Color.BLACK);

            g.fillRect(x, y, 20, 20);
        }

        //--------------------------------

        @Override
        public void repaint()
        {
            super.repaint();

            x+=20;
        }


    }
