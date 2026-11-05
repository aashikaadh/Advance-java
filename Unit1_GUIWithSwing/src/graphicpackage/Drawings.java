package graphicpackage;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Drawings extends Canvas {
	@Override
	public void paint(Graphics g) {

		g.drawString("Aashika Adhikari", 40, 40);// display hello at 40,40 positio
		setBackground(Color.red);
		g.fillRect(130, 30, 100, 80);
		g.drawOval(30, 130, 50, 60);
		setForeground(Color.GREEN);
		g.setColor(Color.blue);
		g.fillOval(130, 130, 50, 60);
		g.setColor(Color.yellow);
		g.drawArc(30, 200, 40, 50, 90, 60);
		g.fillArc(30, 130, 40, 50, 180, 40);

	}

	public static void main(String[] args) {

		Drawings draw = new Drawings();
		JFrame frame = new JFrame("Drawing Frame");
		frame.setSize(300, 300);
		frame.add(draw);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
