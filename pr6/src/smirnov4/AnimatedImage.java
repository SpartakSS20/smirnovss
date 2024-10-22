package smirnov4;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class AnimatedImage extends JPanel {
    private BufferedImage[] frames;
    private int currentFrame = 0;
    private final int delay = 100; // Задержка в миллисекундах

    public AnimatedImage(String[] paths) {
        frames = new BufferedImage[paths.length];
        loadFrames(paths);
        Timer timer = new Timer(delay, e -> updateFrame());
        timer.start();
    }

    private void loadFrames(String[] paths) {
        try {
            for (int i = 0; i < paths.length; i++) {
                frames[i] = ImageIO.read(new File(paths[i]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateFrame() {
        currentFrame = (currentFrame + 1) % frames.length;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(frames[currentFrame], 0, 0, this);
    }

    public static void main(String[] args) {
        String[] imagePaths = {
                "/Users/777/Downloads/photo.jpg",
                "/Users/777/Downloads/photo2.jpg",
                "/Users/777/Downloads/photo3.jpg",
                "/Users/777/Downloads/photo4.jpg",
                "/Users/777/Downloads/photo5.jpg",
                "/Users/777/Downloads/photo6.jpg",
                "/Users/777/Downloads/photo7.jpg",
                "/Users/777/Downloads/photo8.jpg"
        };

        JFrame frame = new JFrame("Animated Image");
        AnimatedImage animatedImage = new AnimatedImage(imagePaths);
        frame.add(animatedImage);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}