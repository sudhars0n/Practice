package com.guv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Table extends JFrame {

    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public Table(){
        setLayout(new FlowLayout());

        String [] columnNames={"Name","Age","Gender"};

        String[][]data= {{"Sudharson", "22", "Male"}, {"Jeeva", "23", "Male"}, {"Thara", "23", "Female"},
        };
        JTable table =new JTable(data,columnNames);
        table.setBounds(100,100,200,200);

        JScrollPane scrollPane=new JScrollPane(table);
        add(scrollPane);
    }

    public static void main(String[] args) {
        Table ref=new Table();
        ref.setSize(500,500);
        ref.setVisible(true);

    }
}
