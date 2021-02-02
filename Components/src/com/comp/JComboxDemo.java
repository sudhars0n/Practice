package com.comp;

import javax.swing.*;
import java.awt.event.*;

public class JComboxDemo extends JFrame {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    JComboxDemo(){

 JFrame frame=new JFrame("COURSE VARIANTS");
 String [] details={"JAVA","PYTHON","ANGULAR JS","NODE JS"};
 JComboBox comboBox=new JComboBox(details);
 comboBox.setBounds(30,40,100,40);
 frame.add(comboBox);
 frame.setLayout(null);
 frame.setSize(400,400);
 frame.setVisible(true);
    }
    public static void main(String[] args) {
    JComboxDemo obj =new JComboxDemo();
    }
}
