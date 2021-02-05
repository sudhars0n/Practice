package com.comp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Signature02 extends Signnature01 implements MouseListener, MouseMotionListener {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    public int index = 0;
    Graphics g ;
    public Point[] arr = new Point[100000] ;

    public Signature02(String name) {
        super();

        index = 0;
        JDialog dialog = new JDialog(frame, "SigantureField", true);
        JPanel panel = new JPanel();
        panel.setBackground(Color.yellow);
        dialog.setSize(400, 400);
        setBackground(Color.green);
        dialog.add(panel);

        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);
        dialog.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        System.out.println("gr");
        super.paintComponents(g);

        for (int i = 0; i < index - 1; i++) {
            System.out.println("testing");
            g.drawLine(arr[i].x, arr[i].y, arr[i + 1].x, arr[i + 1].y);

        }
       }
/*public void paint(Graphics g) {
    super.paint(g);
    System.out.println("testing00");

    for (int i = 0; i < index - 1; i++) {
        System.out.println("testing");
        g.setColor(Color.RED);
        g.drawLine(arr[i].x, arr[i].y, arr[i + 1].x, arr[i + 1].y);

    }
}*/
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
    public void mouseExited   (MouseEvent e) {}
    public void mouseClicked  (MouseEvent e) {}
    public void mouseEntered  (MouseEvent e) {}
    public void mouseMoved    (MouseEvent e) {}
    public void mouseReleased (MouseEvent e) {

        arr = new Point[100000];
        index = 0;
      // this.paintComponent(getGraphics());
    }

    public static void main(String[] args) {
        Signature02 obj2 = new Signature02("mouse");

    }
}
