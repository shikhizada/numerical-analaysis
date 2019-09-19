package com.main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NthRoot {

    static JTextField tf1, tf2, tf3;
    static JButton btn;
    static JLabel lb;

    public static void main(String[] args) {
        JFrame frm = new JFrame("NthRoot");
        frm.setSize(400, 400);
        tf1 = new JTextField(12);
        tf2 = new JTextField(12);
        tf3 = new JTextField(12);
        btn = new JButton("Calc");
        lb = new JLabel();
        frm.setLayout(new GridLayout(8, 1));
        frm.add(tf1);
        frm.add(tf2);
        frm.add(tf3);
        frm.add(btn);
        frm.add(lb);
        frm.setVisible(true);

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double x, n, e, y0 = 0, y1;
                x = Double.parseDouble(tf1.getText());
                n = Double.parseDouble(tf2.getText());
                e = Double.parseDouble(tf3.getText());

                while (Math.pow(y0, n) < x) {
                    y0++;
                }

                y1 = ((n - 1) * y0 + x / Math.pow(y0, n - 1)) / n;
                while (Math.abs(y1 - y0) > e) {
                    y0 = y1;
                    y1 = ((n - 1) * y0 + x / Math.pow(y0, n - 1)) / n;
                }
                lb.setText("" + y1);
            }
        });

    }
}