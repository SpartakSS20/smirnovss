package smirnov2;

import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame {

    public Task2() {
        setTitle("Приложение с двумя панелями");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(2, 1));

        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Первая панель", JLabel.CENTER);
        label1.setForeground(Color.BLUE);
        label1.setFont(new Font("Calibri", Font.BOLD, 40));
        panel1.add(label1);

        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Вторая панель", JLabel.CENTER);
        label2.setForeground(Color.RED);
        label2.setFont(new Font("Calibri", Font.BOLD, 30));
        panel2.add(label2);

        add(panel1);
        add(panel2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Task2();
    }
}
