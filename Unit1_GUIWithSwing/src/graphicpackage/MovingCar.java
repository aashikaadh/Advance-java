package graphicpackage;

import java.awt.Canvas;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class MovingCar extends Canvas {

	@Override
	public void paint(Graphics g) {

		for (int i = 0; i <= 100; i++) {

			setBackground(Color.white);
			g.fillRect(0, 0, 900, 300);

			// adding rectangle
			g.setColor(Color.RED);
			g.fillRect(80 + i, 120, 150, 60);
			
			// adding circle
			g.setColor(Color.blue);
			g.fillOval(95 + i, 165, 40, 40);
			g.fillOval(175 + i, 165, 40, 40);

			// wheels center
			g.setColor(Color.WHITE);
			g.fillOval(107 + i, 177, 16, 16);
			g.fillOval(187 + i, 177, 16, 16);

			// windows
			g.setColor(Color.CYAN);
			g.fillRect(120 + i, 140, 30, 25);
			g.fillRect(155 + i, 140, 30, 25);

			// move car

		}
		try {
			Thread.sleep(15);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		MovingCar car = new MovingCar();
		JFrame frame = new JFrame("Drawing Frame");
		frame.setSize(900, 300);
		frame.add(car);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
