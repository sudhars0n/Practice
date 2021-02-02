package com.comp;

import javax.swing.*;
import java.awt.event.*;

public class JMenuDemo extends JFrame {

    private JPanel contentPane;
    private JButton buttonOK;

    JMenuDemo(){

          JFrame frame=new JFrame("CREATING MENU ");
          JMenuBar mb=new JMenuBar();
          JMenu menu=new JMenu("Edit");
            JMenuItem  l1=new JMenuItem("Cut");
            JMenuItem  l2=new JMenuItem("Copy");
            JMenuItem  l3=new JMenuItem("Paste");
            JMenuItem  l4=new JMenuItem("Delete");
            JMenuItem  l5=new JMenuItem("Find");

            menu.add(l1);
            menu.add(l2);
            menu.add(l3);
            menu.add(l4);
            menu.add(l5);

            mb.add(menu);
            frame.setJMenuBar(mb);
            frame.setLayout(null);
            frame.setSize(500,500);
            frame.setVisible(true);
      }
    public static void main(String[] args) {
          JMenuDemo obj=new JMenuDemo();
    }
    }

