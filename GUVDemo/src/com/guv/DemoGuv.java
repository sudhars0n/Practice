package com.guv;

import javax.swing.*;

public class DemoGuv{


    public static void main(String[] args) {

        practice obj = new practice();
    }
}
      class practice extends JFrame{
         public void practice(){
             JLabel obj2=new JLabel("Hello");
             add(obj2);
             setSize(500,500);
             setVisible(true);
     }

    }
