package com.comp;

import javax.swing.*;

public class JListDemo extends JFrame{
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;


       JListDemo() {
           JFrame frame = new JFrame("JDBC OPERTAIONS ");

           DefaultListModel<String> dlist = new DefaultListModel<>();

           dlist.addElement("Create Here");
           dlist.addElement("Read Here");
           dlist.addElement("Update Here");
           dlist.addElement("Create Here");

           JList<String> list = new JList<>(dlist);
           list.setBounds(40, 60, 300, 300);
           DefaultListCellRenderer renderer=new DefaultListCellRenderer();
           renderer.setHorizontalAlignment((int) JList.CENTER_ALIGNMENT);
           list.setCellRenderer(renderer);
           frame.add(list);
           frame.setLayout(null);
           frame.setSize(400, 400);
           frame.setVisible(true);
       }
    public static void main(String[] args) {
     JListDemo obj=new JListDemo();
    }
}
