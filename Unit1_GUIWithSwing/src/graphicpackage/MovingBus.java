package graphicpackage;

import java.awt.*;
import javax.swing.*;

public class MovingBus extends Canvas {

	private int x = 50;

	public MovingBus() {
		setBackground(Color.WHITE);

		// Timer runs every 100 milliseconds
		Timer timer = new Timer(100, e -> {
			x += 5; // Move bus to the right

			// Restart from left when bus reaches the right side
			if (x > 900) {
				x = -200;
			}

			repaint(); // Request repaint
		});

		timer.start();
	}

	@Override
	public void paint(Graphics g) {

		// Bus body
		g.setColor(Color.red);
		g.fillRect(x, 100, 200, 80);

		// Wheels
		g.setColor(Color.blue);
		g.fillOval(x + 20, 150, 50, 50);
		g.fillOval(x + 120, 150, 50, 50);

		// wheels center
		g.setColor(Color.WHITE);
		g.fillOval(x + 35, 165, 20, 20);
		g.fillOval(x + 135, 165, 20, 20);

		// Door
		g.setColor(Color.BLACK);
		g.fillRect(x + 90, 140, 20, 40);

		// Windows
		g.setColor(Color.cyan);
		g.fillRect(x + 30, 120, 40, 20);
		g.fillRect(x + 130, 120, 40, 20);

	}

	public static void main(String[] args) {

		MovingBus draw = new MovingBus();

		JFrame frame = new JFrame("Moving Car");

		frame.setSize(900, 300);
		frame.add(draw);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
