package com.comp;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

    public class Signature03 extends JApplet {
        public JFrame frame;
        public BufferedImage image = null;


        private Point lastPos = null;
        private Graphics gc;
        Graphics2D imageG = null;
        private JButton buttonOK;
        private JButton buttonCancel;
        private JPanel contentPane;

        /*
         * (non-Javadoc)
         *
         * @see java.applet.Applet#init()
         */
        public void init() {

            super.init();

            frame=new JFrame("Signature Field");
            JPanel canvas = new JPanel();
            JPanel colorPanel = new JPanel();

            Button captureButton = new Button("Capture");
            colorPanel.add(captureButton);
            frame.add(canvas);
            frame.add(colorPanel);
            frame.add(captureButton);

            setSize(600, 200);

            image = new BufferedImage(getWidth(), getHeight(),
                    BufferedImage.TYPE_INT_ARGB);

            // get the image Graphics object
            imageG = image.createGraphics();
            colorPanel.setLayout(new GridLayout());
            canvas.setSize(getWidth(), getHeight());

            captureButton.setSize(100, 50);
            getContentPane().add(captureButton);
            getContentPane().add(canvas, BorderLayout.CENTER);
            setVisible(true);

            // get the Graphics Context
            gc = canvas.getGraphics();
            canvas.setBackground(Color.GRAY);
            gc.setColor(Color.GRAY);
            gc.fillRect(0, 0, image.getWidth(), image.getHeight());
            gc.setColor(Color.BLACK);

            imageG.setBackground(Color.GRAY);
            imageG.setColor(Color.GRAY);
            imageG.fillRect(0, 0, image.getWidth(), image.getHeight());
            imageG.setColor(Color.BLACK);

            frame.setSize(800,800);
            frame.setVisible(true);
            captureButton.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent a) {
                    try {
                        Container cp = getContentPane();
                        final Component comp = cp.add(new JSplitPane(
                                JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(
                                new JTextArea()), new JScrollPane(
                                new JTextArea())));
                        // cp.add(canvas);

                        File filetoSave = new File("C:/Users/hp/Documents/Sign/img.jpeg");

                        // If the file does not exist or the user gives permission,
                        // save image to file.

                        ImageWriter writer = null;
                        ImageOutputStream ios = null;

                        try {
                            // Obtain a writer based on the jpeg format.

                            Iterator iter;
                            iter = ImageIO.getImageWritersByFormatName("jpeg");

                            // Validate existence of writer.

                            if (!iter.hasNext()) {
                                return;
                            }

                            // Extract writer.

                            writer = (ImageWriter) iter.next();

                            // Configure writer output destination.

                            ios = ImageIO.createImageOutputStream(filetoSave);
                            writer.setOutput(ios);

                            // Set JPEG compression quality to 95%.

                            ImageWriteParam iwp = writer.getDefaultWriteParam();
                            iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
                            iwp.setCompressionQuality(0.95f);

                            // Write the image.

                            writer.write(null, new IIOImage((BufferedImage) image,
                                    null, null), iwp);
                        } catch (IOException e2) {
                            e2.getMessage();
                        } finally {
                            try {
                                // Cleanup.

                                if (ios != null) {
                                    ios.flush();
                                    ios.close();
                                }

                                if (writer != null)
                                    writer.dispose();
                            } catch (IOException e2) {
                            }
                        }

                    } catch (Exception e) {
                        System.err.println(e);
                    }
                }
            });

            canvas.addMouseMotionListener(new MouseMotionListener() {
                public void mouseDragged(MouseEvent m) {
                    // the mouse(pen) was dragged, so the pixels at coords found in
                    // MouseEvent m must be updated with current color
                    Point p = m.getPoint();
                    gc.drawLine(lastPos.x, lastPos.y, p.x, p.y);
                    imageG.drawLine(lastPos.x, lastPos.y, p.x, p.y);
                    lastPos = p;
                }

                public void mouseMoved(MouseEvent m) {
                }
            });
            canvas.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {
                }

                public void mousePressed(MouseEvent e) {
                    lastPos = e.getPoint();
                }

                public void mouseReleased(MouseEvent e) {
                    lastPos = null;
                }

                public void mouseEntered(MouseEvent e) {
                }

                public void mouseExited(MouseEvent e) {
                }
            });
        }

      /**public Signature03() {

        }*/

        public static void main(String[] args) {
            Signature03 p = new Signature03();
        }
    }
