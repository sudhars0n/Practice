package com.guv;

import javax.swing.*;

public class GUVDemo {

    public static void main(String[] args) {

        practice obj = new practice();
    }
}
class practice extends JFrame {
    public void practice(){
        JLabel obj2=new JLabel("Hello");
        add(obj2);
        setSize(100,100);
        setVisible(true);
    }
}
