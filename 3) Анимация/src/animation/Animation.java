package animation;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Animation extends JFrame {

    private Image[] img = new Image[4];
    BufferedImage image;

    public Animation(String title) {
        super(title);
        this.setResizable(false);
        DrawPanel panel = new DrawPanel();
        panel.setPreferredSize(new Dimension(700, 400));
        add(panel);
        pack();
        setVisible(true);
        this.setLocationRelativeTo(null);
        MediaTracker mt = new MediaTracker(this);
        img[0] = getToolkit().getImage("1.png");
        mt.addImage(img[0], 0);
        img[1] = getToolkit().getImage("2.png");
        mt.addImage(img[1], 0);
        img[2] = getToolkit().getImage("3.png");
        mt.addImage(img[2], 0);
        img[3] = getToolkit().getImage("4.png");
        mt.addImage(img[3], 0);
        try {
            mt.waitForAll();
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new Animation("Jumping balls");
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });
    }

    public class DrawPanel extends JComponent implements Runnable {

        private long t = System.nanoTime();

        public DrawPanel() {
            super();
            new Thread(this).start();
        }

        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                }
            }
        }

        @Override
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            int w = getSize().width;//700
            int h = getSize().height;//400          
            BufferedImage bi = (BufferedImage) createImage(w, h);
            Graphics2D big = bi.createGraphics();
            long tm = System.nanoTime() - t;
            double angle = tm / 130000000.0;
            double x;
            double y;
            double r;
            try {
                image = ImageIO.read(new File("Background.jpg"));
            } catch (IOException ex) {
                Logger.getLogger(Animation.class.getName()).log(Level.SEVERE, null, ex);
            }
            big.drawImage(image, 0, 0, w, h, this);
            ////// 1
            x = 10;
            y = 10;
            r = 1.8 * Math.min(x, y);
            x += Math.sqrt(angle) * r * 3.2;
            y += (angle * 0.3) * r * 3;
            if (x >= 700 || y >= 400) {
                double x1 = -210;
                double y1 = 540;
                x1 += Math.sqrt(angle) * r * 6;
                y1 -= (angle * 0.4) * r;
                big.drawImage(img[0], (int) x1, (int) y1, w / 20, h / 20, this);
            }
            big.drawImage(img[0], (int) x, (int) y, w / 20, h / 20, this);
            ///// 2
            x = 10;
            y = 100;
            r = 1.8 * Math.min(x, y);
            x += Math.sqrt(angle) * r * 3.2;
            y += (angle * 0.3) * r * 3;
            if (x >= 700 || y >= 400) {
                double x1 = -200;
                double y1 = 510;
                x1 += Math.sqrt(angle) * r * 6;
                y1 -= (angle * 0.4) * r;
                big.drawImage(img[1], (int) x1, (int) y1, w / 20, h / 20, this);
            }
            big.drawImage(img[1], (int) x, (int) y, w / 20, h / 20, this);
            ///// 3
            x = 10;
            y = 200;
            r = 1.8 * Math.min(x, y);
            x += Math.sqrt(angle) * r * 3.2;
            y += (angle * 0.3) * r * 3;
            if (x >= 700 || y >= 400) {
                double x1 = -196;
                double y1 = 497;
                x1 += Math.sqrt(angle) * r * 7;
                y1 -= (angle * 0.5) * r;
                big.drawImage(img[2], (int) x1, (int) y1, w / 20, h / 20, this);
            }
            big.drawImage(img[2], (int) x, (int) y, w / 20, h / 20, this);
            // 4
            x = 10;
            y = 300;
            r = 1.8 * Math.min(x, y);
            x += Math.sqrt(angle) * r * 3.2;
            y += (angle * 0.3) * r * 3;
            if (x >= 700 || y >= 390) {
                double x1 = -160;
                double y1 = 450;
                x1 += Math.sqrt(angle) * r * 7;
                y1 -= (angle * 0.5) * r;
                big.drawImage(img[3], (int) x1, (int) y1, w / 20, h / 20, this);
            }
            big.drawImage(img[3], (int) x, (int) y, w / 20, h / 20, this);
            ///
            g2.drawImage(bi, 0, 0, this);
        }
    }
}
