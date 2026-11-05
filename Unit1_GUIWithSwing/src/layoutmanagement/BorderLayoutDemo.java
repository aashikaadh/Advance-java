package layoutmanagement;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class CGPanel extends Canvas{
	
	int x=50;
	int y=50;
	 
	int dx=3;
	int dy=3;
	 public CGPanel() {
	        setSize(400, 300);
	        setBackground(Color.WHITE);

	        // Timer for movement
	        javax.swing.Timer timer = new javax.swing.Timer(20, e -> {

	            x = x + dx;
	            y = y + dy;

	            // Left and right boundary
	            if (x <= 0 || x + 50 >= getWidth()) {
	                dx = -dx;
	            }

	            // Top and bottom boundary
	            if (y <= 0 || y + 50 >= getHeight()) {
	                dy = -dy;
	            }

	            repaint();
	        });

	        timer.start();
	    }

	
	
	@Override
	public void paint(Graphics g) {
		setForeground(Color.cyan);
		g.fillOval(x, y, 50, 50);
	}
	
	
}

public class BorderLayoutDemo extends JFrame {
	JPanel bpanel, gpanel, ypanel, rpanel, cpanel;
	CGPanel ball;
	public BorderLayoutDemo() {
		setTitle("Bouncing ball Frame");
		setLayout(new BorderLayout());
		bpanel=new JPanel(); //bluepanel
		gpanel=new JPanel();//greenpanel
		ypanel=new JPanel(); //yellopanel
		rpanel=new JPanel(); //redpanel
		cpanel=new JPanel(); //centerpanel
		ball=new CGPanel();// center ball 
		
		cpanel.add(ball); //adding ball at the center of jframe using cpanel
		//adding bg color
		bpanel.setBackground(Color.BLUE);
		gpanel.setBackground(Color.red);
		ypanel.setBackground(Color.yellow);
		rpanel.setBackground(Color.red);
		
		add(bpanel,BorderLayout.NORTH);//borderlayout.north
		add(rpanel,BorderLayout.SOUTH);
		add(ypanel,BorderLayout.EAST);
		add(gpanel,BorderLayout.WEST);
		
		
		//adding grphics in cpanel
		add(cpanel.add(ball));
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
   new BorderLayoutDemo();
	}

}
