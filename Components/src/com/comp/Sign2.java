package com.comp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sign2 extends JFrame implements MouseListener, MouseMotionListener {
    private int index = 0;
    private Point[] arr = new Point[100000];


    public Sign2(String name) {
        super();
        index = 0;

        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        JFrame fr = new JFrame(name);
        fr.add(this);
        fr.setSize(500, 500);
        setBackground(Color.green);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);

    }

    public void PaintComponent(Graphics g) {
        super.paintComponents(g);
        for (int i = 0; i < index - 1; i++)
            g.drawLine(arr[i].x, arr[i].y, arr[i + 1].x, arr[i + 1].y);
    }

    public void mouseDragged(MouseEvent e) {
        arr[index] = new Point(e.getX(), e.getY());
        index++;
        System.out.println(index);

        repaint();

    }

    public void mousePressed(MouseEvent e) {
        arr[index] = new Point(e.getX(), e.getY());
        index++;
        System.out.println(index);
        repaint();
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }


    public void mouseMoved(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
        arr = new Point[100000];
        index = 0;
    }

    public static void main(String[] args) {

        Sign2 mouse = new Sign2("Mouse");
    }
}

