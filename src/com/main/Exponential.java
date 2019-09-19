package com.main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Exponential {

    static JTextField tf1, tf2;
    static JButton btn;
    static JLabel lb;

    public static void main(String[] args) {
        JFrame frm = new JFrame("Exponential");
        frm.setSize(400, 400);
        tf1 = new JTextField(12);
        tf2 = new JTextField(12);
        btn = new JButton("Calc");
        lb = new JLabel();
        frm.setLayout(new GridLayout(8, 1));
        frm.add(tf1);
        frm.add(tf2);
        frm.add(btn);
        frm.add(lb);
        frm.setVisible(true);

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double i = 1, x, e, t = 1.0, s = 1.0;

                x = Double.parseDouble(tf1.getText());
                e = Double.parseDouble(tf2.getText());
                while (Math.abs(t) > e) {
                    t = x / i * t;
                    s += t;
                    i++;
                }

                lb.setText("" + s);

            }
        });


    }
}