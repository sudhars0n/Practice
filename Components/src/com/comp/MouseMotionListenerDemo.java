package com.comp;

import java.awt.*;
import java.awt.event.*;
public class MouseMotionListenerDemo extends Frame implements MouseMotionListener{
    MouseMotionListenerDemo(){
        addMouseMotionListener(this);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseDragged(MouseEvent e) {
        Graphics g=getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),10,10);
    }
    public void mouseMoved(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseMotionListenerDemo();
    }
}