package com.comp;

import javax.swing.*;
import java.awt.*;

public class Demo extends JPanel{

    private int x;
    private int y;
    public Demo()
    {
        x=100;
        y=100;
        this.setBackground(Color.RED);
    }

  public void paint(Graphics g)
    {
        super.paint(g);

        g.setColor(Color.BLACK);

        g.fillRect(x, y, 20, 20);
    }
    public void repaint()
    {
        super.repaint();

        x+=20;
    }

}