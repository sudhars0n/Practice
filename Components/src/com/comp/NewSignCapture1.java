package com.comp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


    public class NewSignCapture1 extends JFrame implements ActionListener {
        private JPanel contentPane;
        private JButton buttonOK;
        private JButton buttonCancel;

        public BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);

        JPanel buttonPanel = new JPanel();
        JPanel sign = new JPanel();
        JLabel signlabel = new JLabel("Sign here :");
        Point lastPos = null;
        Point startPos = null;
        Point finishPos = null;
        Graphics g;
        JButton save = new JButton("Save");
        JButton cancel = new JButton("Cancel");
        JButton clear = new JButton("Clear");
       // JButton proceed = new JButton("Proceed");
        JPanel canvas = new JPanel();
        int changer = 1;
        String path = "C:/Users/hp/Documents/Sign/original.png";

        public NewSignCapture1(String mouse) {


            setLocation(100, 100);
            setSize(600, 500);
            setTitle("ENCODE SECTION");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            canvas.setBackground(Color.WHITE);

            clear.addActionListener(this);
            clear.setActionCommand("clear");

            save.addActionListener(this);
            save.setActionCommand("Save");


            cancel.addActionListener(this);
            cancel.setActionCommand("Cancel");

           // proceed.addActionListener(this);
            //proceed.setActionCommand("Proceed");


            buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
            buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
            buttonPanel.add(Box.createHorizontalGlue());
            buttonPanel.add(save);
            buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
            buttonPanel.add(clear);
            buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
            buttonPanel.add(cancel);

           // buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
          //  buttonPanel.add(proceed);

            sign.add(signlabel);
            signlabel.setFont(new Font("Serif", Font.ITALIC, 14));

            //set the look
            getContentPane().add(canvas, BorderLayout.CENTER);
            getContentPane().add(buttonPanel, BorderLayout.SOUTH);
            getContentPane().add(sign, BorderLayout.PAGE_START);
            setVisible(true);

            g = canvas.getGraphics();
            g.setColor(Color.blue);

            canvas.addMouseMotionListener(new MouseMotionListener() {
                public void mouseDragged(MouseEvent m) {
                    Point p = m.getPoint();
                    if (changer == 1) {
                        g.setColor(Color.blue);
                        g.drawLine(lastPos.x, lastPos.y, p.x, p.y);
                   //    g.drawImage(image,lastPos.x,lastPos.y,ImageObserver (olor.orange );
                    }
                    lastPos = p;
                  //  System.out.println(p);
                }
                public void mouseMoved(MouseEvent m) {
                }
             });

            canvas.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {
                    startPos = e.getPoint();
                }

                public void mousePressed(MouseEvent e) {
                    lastPos = e.getPoint();
                }

                public void mouseReleased(MouseEvent e) {
                    lastPos = null;
                    finishPos = e.getPoint();
                    startPos = null;
                }
                public void mouseEntered(MouseEvent e) {
                }
                public void mouseExited(MouseEvent e) {
                }
                });
                }
        public void actionPerformed(ActionEvent e) {
            if ("clear".equals(e.getActionCommand())) {
                repaint();
            }
            if ("Save".equals(e.getActionCommand())) {
                captureCanvasImage myCanvas = new captureCanvasImage();
                myCanvas.capture();
            }
            if ("Cancel".equals(e.getActionCommand())) {
                dispose();
            }
            /*if ("Proceed".equals(e.getActionCommand())) {
                //new encode1Pane();
            }*/
        }

        class captureCanvasImage {
            public void capture() {

                int w = image.getWidth();
                int h = image.getHeight();

                try {

                 BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
                 //BufferedImage image=new Robot().createScreenCapture()

                    Graphics2D g= image.createGraphics();
                    canvas.paint(g);
                    System.out.println(g);

                    ImageIO.write(image, "png", new File(path));
                    g.dispose();
                } catch (IOException ioe) {
                    System.out.println("Panel write help: " + ioe.getMessage());
                }
                }

                }

    /*
    public void invalidate() {
    super.invalidate();

    this.paint(this.getGraphics());
    }
*/
        public static void main(String[] args) {
            NewSignCapture1 p = new NewSignCapture1("mouse");
            p.setVisible(true);
        }
    }
