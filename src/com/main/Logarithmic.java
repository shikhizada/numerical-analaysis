package com.main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Logarithmic {

    static JTextField tf1, tf2;
    static JButton btn;
    static JLabel lb;

    public static void main(String[] args) {
        JFrame frm = new JFrame("Logarithmic");
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
                double z, e, m = 0, k, i = 1, u, s = 0;
                z = Double.parseDouble(tf1.getText());
                e = Double.parseDouble(tf2.getText());
                while (z >= 1) {
                    z = z / 2;
                    m++;
                }
                k = (1 - z) / (1 + z);
                while (true) {
                    u = Math.pow(k, i) / i;
                    if (u < e)
                        break;
                    s += u;
                    i += 2;
                }
                s = m * Math.log(2) - 2 * s;

                lb.setText("" + s);

            }
        });

    }
}