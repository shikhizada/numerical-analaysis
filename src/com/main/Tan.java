package com.main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tan {

    static JTextField tf1, tf2;
    static JButton btn;
    static JLabel lb;

    public static void main(String[] args) {
        JFrame frm = new JFrame("Tan");
        frm.setSize(400, 400);
        tf1 = new JTextField(12);
        btn = new JButton("Calc");
        lb = new JLabel();
        frm.setLayout(new GridLayout(8, 1));
        frm.add(tf1);
        frm.add(btn);
        frm.add(lb);
        frm.setVisible(true);

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double d, e, x, u, s = 0;
                d = Double.parseDouble(tf1.getText());
                x = Math.PI / 180 * d;
                u = 13 - x * x / 15;
                s += u;
                for (int i = 11; i >= 1; i -= 2)
                    u = i - x * x / u;
                s = x / u;
                lb.setText("" + s);

            }
        });

    }
}