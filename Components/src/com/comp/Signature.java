package com.comp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class Signature extends JPanel
 {
    public int x1,x2,y1,y2;
    public static double SWITCH;
    public Signature()
    {
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent m)
            {
                x1=m.getX();
                y1=m.getY();
                repaint();
            }
            public void mouseReleased(MouseEvent m)
            {
                x2=m.getX();
                y2=m.getY();
                repaint();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter()
        {
            public void mouseDragged(MouseEvent m)
            {
                x2=m.getX();
                y2=m.getY();
                repaint();
            }
        });
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(SWITCH == 2)
        {
            g.drawRect(x1, y1, x2, y2);
        }
        else if (SWITCH == 3)
        {
            g.drawOval(x1,y1,x2,y2);
        }
        else
        {
            g.drawString("qwe", x1, y1);
        }
    }

 }
      class q extends JFrame
 {
    public static void main(String[] args)
    {
        q window = new q();
        window.setVisible(true);
        window.setSize(1024, 800);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cont = window.getContentPane();
        cont.setLayout(new GridLayout(2,2));
        Signature panel = new Signature();
        JPanel BPanel = new JPanel();
        cont.add(panel);
        cont.add(BPanel);
        BPanel.setBackground(Color.blue);
        JButton button1,button2;
        button1 = new JButton("Rect");
        button2 = new JButton("Oval");
        BPanel.add(button1);
        BPanel.add(button2);
        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                Signature.SWITCH = 2;
            }
        });
        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                Signature.SWITCH = 3;
            }
        });
    }
 }
