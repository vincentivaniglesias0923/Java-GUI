import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class Splash {
    JFrame f = new JFrame();
    JProgressBar p = new JProgressBar();
    JLabel img = new JLabel(new ImageIcon("logo.png"));

    Splash() {
        createSplash();
        addProgressBar();
        runBar();
        addImage();
    }

    public void createSplash() {
        f.getContentPane().setLayout(null);
        f.setUndecorated(true);
        f.setSize(600, 400);
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(Color.LIGHT_GRAY);
        f.setVisible(true);
    }

    public void addImage() {

        img.setSize(600, 200);
        f.add(img);

    }

    public void addProgressBar() {
        p.setBounds(100, 280, 400, 30);
        p.setBorderPainted(true);
        p.setStringPainted(true);
        p.setBackground(Color.WHITE);
        p.setForeground(Color.GREEN);
        p.setValue(0);
        f.add(p);
    }

    public void runBar() {
        int i = 0;

        while (i <= 100) {
            try {
                Thread.sleep(10);
                p.setValue(i);
                i++;
                if (i == 100) {
                    f.dispose();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

        }
