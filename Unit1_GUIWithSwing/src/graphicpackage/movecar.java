
package graphicpackage;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class movecar extends Canvas implements Runnable {

    int x = 0;

    @Override
    public void paint(Graphics g) {

        // Background
        setBackground(Color.WHITE);
        

        // Car body
        g.setColor(Color.RED);
        g.fillRect(80 + x, 120, 150, 60);

        // Wheels
        g.setColor(Color.BLUE);
        g.fillOval(95 + x, 165, 40, 40);
        g.fillOval(175 + x, 165, 40, 40);

        // Wheel centers
        g.setColor(Color.WHITE);
        g.fillOval(107 + x, 177, 16, 16);
        g.fillOval(187 + x, 177, 16, 16);

        // Windows
        g.setColor(Color.CYAN);
        g.fillRect(120 + x, 140, 30, 25);
        g.fillRect(155 + x, 140, 30, 25);
    }

    @Override
    public void run() {

        while (x <= 700) {

            x = x + 2;

            // repaint the car
            repaint();

            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        movecar car = new  movecar ();

        JFrame frame = new JFrame("Moving Car");

        frame.setSize(900, 300);
        frame.add(car);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and start thread
        Thread t = new Thread(car);
        t.start();
    
    }
}

