package Laba5;

import javax.swing.*;
import java.awt.*;


class PicProg extends JFrame {
    PicProg() {
        setSize(300, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        ImageIcon icon = new ImageIcon("src/Laba5/Mirea.jfif");

        setIconImage(icon.getImage());
        getContentPane().add(new JLabel(icon));

        setLocationRelativeTo(null);
        setVisible(true);
        }
    }
