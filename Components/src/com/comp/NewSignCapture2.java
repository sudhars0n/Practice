package com.comp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;


    public class NewSignCapture2 extends JFrame{
        private Point points[] = new Point[10000];
        private Point pointends[] = new Point[10000];
        private int pointCount = 0;
        private JButton save_btn;
        private JPanel contentPane;
        private JButton buttonOK;
        private JButton buttonCancel;

        public NewSignCapture2()
        {
            panel paint2 = new panel();
            add(paint2,BorderLayout.CENTER);
        }
        private class panel extends JPanel
        {
            private NewSignCapture2 my_paint;
            public panel()
            {
                setBackground(Color.WHITE);
                save_btn = new JButton();
                save_btn.setText("123");
                this.add(save_btn);
                ButtonHandler handler1 = new ButtonHandler();
                save_btn.addActionListener(handler1);
                MouseHandler handler = new MouseHandler();
                this.addMouseMotionListener(handler);

                this.addMouseListener(handler);
            }
            private class ButtonHandler implements ActionListener
            {

                public void actionPerformed(ActionEvent arg0) {

                    savefile();
                }

            }

            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                for(int i = 0;i <pointCount;i++)
                {
                    g.setColor(Color.RED);
                    g.drawLine(points[i].x, points[i].y, pointends[i].x, pointends[i].y);
                }
            }



            private class MouseHandler extends MouseAdapter
            {

                public void mouseDragged(MouseEvent e)
                {

                    pointends[ pointCount-1] = e.getPoint();
                    repaint();


                }
                public void mousePressed(MouseEvent e) {
                                    super.mousePressed(e);
                    if(pointCount < points.length)
                    {
                        points[ pointCount ] = e.getPoint();
                        pointends[ pointCount ] = e.getPoint();
                        pointCount++;
                        repaint();
                    }
                }

                public void mouseReleased(MouseEvent e) {
                    super.mouseReleased(e);
        /*pointends[pointCount]=e.getPoint();
        repaint();
        pointCount++;
    */
                }

            }

        }
        public void savefile()
        {
            BufferedImage image2 = new BufferedImage(panel.WIDTH, panel.HEIGHT,     BufferedImage.TYPE_INT_RGB);
            JFileChooser jFile = new JFileChooser();
            jFile.showSaveDialog(null);
            Path pth = jFile.getSelectedFile().toPath();
            JOptionPane.showMessageDialog(null, pth.toString());
            Graphics2D graphics2D = image2.createGraphics();
            try {
                ImageIO.write(image2, "", new File(pth.toString()));
            } catch (IOException ox) {
                ox.printStackTrace();

            }
        }
    }

