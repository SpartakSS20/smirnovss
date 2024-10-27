package smirnov3;

import javax.swing.*;
import java.awt.*;

public class Task3 extends JFrame {

    public Task3() {
        setTitle("Приложение с изображениями");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);
        setLayout(new GridLayout(2, 2));

        JPanel panel1 = new JPanel();
        JLabel imageLabel1 = new JLabel(new ImageIcon("/Users/777/Downloads/Футбол.jpg"));
        JLabel caption1 = new JLabel("Футбол", JLabel.CENTER);
        panel1.setLayout(new BorderLayout());
        panel1.add(imageLabel1, BorderLayout.CENTER);
        panel1.add(caption1, BorderLayout.SOUTH);

        JPanel panel2 = new JPanel();
        JLabel imageLabel2 = new JLabel(new ImageIcon("/Users/777/Downloads/Хоккей.jpg"));
        JLabel caption2 = new JLabel("Хоккей", JLabel.CENTER);
        panel2.setLayout(new BorderLayout());
        panel2.add(imageLabel2, BorderLayout.CENTER);
        panel2.add(caption2, BorderLayout.SOUTH);

        add(panel1);
        add(panel2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Task3();
    }
}