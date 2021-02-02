package com.guv;

import javax.swing.*;
import java.awt.event.*;

class New{

    private JPanel contentPane;

    public static void main(String[] args) {
        Test obj=new Test();
    }

    private void createUIComponents() {
    }
}
class Test extends JFrame{
    Test(){
        JLabel label=new JLabel("Hi...");
        //JButton button=new JButton("Click here..");
        String[][] key ={ {"21","Sudharson","mech"},
        {"22","kumar","cse"} };

        String []value={"Rollno","Name","Department"};
        JTable table=new JTable(key,value);
        table.setBounds(40,50,200,200);

        label.setVisible(true);

    };


}
