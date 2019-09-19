package com.main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Sine {

    static JTextField tf1, tf2;
    static JButton btn;
    static JLabel lb;

    public static void main(String[] args) {
        JFrame frm = new JFrame("Sine");
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
                double d, e, x, u, k = 0, s = 0;
                d = Double.parseDouble(tf1.getText());
                e = Double.parseDouble(tf2.getText());
                x = Math.PI / 180 * d;
                u = x;
                s += u;
                while (Math.abs(u) > e) {
                    k++;
                    u = -Math.pow(x, 2) * u / (2 * k * (2 * k + 1));
                    s += u;
                }
                lb.setText("" + s);

            }
        });

    }
}