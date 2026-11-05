import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Question2 extends JFrame {
	public Question2() {
		 setTitle("Car Design Using Graphics");
	        setSize(800, 550);
	        setBackground(Color.WHITE);

	        addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                dispose();
	            }
	        });
	        setLocationRelativeTo(null);
	        setVisible(true);
		
	}

    public void paint(Graphics g) {
        // Set font for labels
        g.setFont(new Font("Arial", Font.BOLD, 16));

        // Draw car roof
        int x[] = {230, 300, 480, 550};
        int y[] = {230, 150, 150, 230};

        g.setColor(Color.BLUE);
        g.fillPolygon(x, y, 4);
        g.setColor(Color.BLACK);
        g.drawPolygon(x, y, 4);

        // Draw windows
        int wx[] = {255, 310, 390, 460, 510};
        int wy[] = {225, 175, 175, 175, 225};

        g.setColor(Color.CYAN);
        g.fillPolygon(wx, wy, 5);
        g.setColor(Color.BLACK);
        g.drawPolygon(wx, wy, 5);

        // Draw car body
        g.setColor(Color.RED);
        g.fillRect(180, 230, 420, 120);
        g.setColor(Color.BLACK);
        g.drawRect(180, 230, 420, 120);

        // Draw front portion of car
        int fx[] = {600, 660, 690, 690, 600};
        int fy[] = {230, 250, 270, 350, 350};

        g.setColor(Color.RED);
        g.fillPolygon(fx, fy, 5);
        g.setColor(Color.BLACK);
        g.drawPolygon(fx, fy, 5);

        // Draw wheels
        g.setColor(Color.BLACK);
        g.fillOval(230, 310, 90, 90);
        g.fillOval(540, 310, 90, 90);

        // Draw wheel centers
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(255, 335, 40, 40);
        g.fillOval(565, 335, 40, 40);

        // Draw headlights
        g.setColor(Color.YELLOW);
        g.fillOval(670, 275, 20, 25);
        g.setColor(Color.BLACK);
        g.drawOval(670, 275, 20, 25);

        // Draw taillight
        g.setColor(Color.ORANGE);
        g.fillRect(170, 260, 10, 35);

        // Draw bumpers
        g.setColor(Color.GRAY);
        g.fillRect(160, 340, 70, 12);
        g.fillRect(660, 340, 50, 12);

        g.setColor(Color.BLACK);
        g.drawRect(160, 340, 70, 12);
        g.drawRect(660, 340, 50, 12);

        // Draw door handles
        g.setColor(Color.BLACK);
        g.fillRect(350, 245, 25, 5);
        g.fillRect(440, 245, 25, 5);

        // Label car parts using Font and drawString
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.setColor(Color.BLACK);

        g.drawString("Roof", 360, 125);
        g.drawString("Window", 470, 170);
        g.drawString("Body", 380, 295);
        g.drawString("Wheel", 240, 425);
        g.drawString("Wheel", 550, 425);
        g.drawString("Headlight", 630, 265);
        g.drawString("Taillight", 100, 255);
        g.drawString("Bumper", 100, 375);
    }

	public static void main(String[] args) {
		new Question2();

	}

}
