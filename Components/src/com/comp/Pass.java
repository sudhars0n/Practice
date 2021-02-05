package com.comp;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import java.awt.*;
public class Pass extends JFrame {
    private JPasswordField passwordField;
    private JPanel panel;
    public Pass() {
        panel = new JPanel();
        ((FlowLayout) panel.getLayout()).setHgap(2);
        panel.add(new JLabel("Enter Pin: "));
        passwordField = new JPasswordField(4);
        PlainDocument document = (PlainDocument) passwordField.getDocument();
        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String string = fb.getDocument()
                        .getText(0, fb.getDocument().getLength()) + text;
                if (string.length() <= 10) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
        panel.add(passwordField);

        add(panel);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Pass();
    }
}