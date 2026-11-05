package eventHandling;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventUsingAdapter extends JFrame {
	
	JLabel coordinatelbl;

		
		public MouseEventUsingAdapter() {
			
			setTitle("Mouse Event Frame");
			setSize(500,500);
			coordinatelbl=new JLabel("x,y coordinates are displayed over here:");
			Font newfont =new Font(Font.MONOSPACED, Font.BOLD+Font.ITALIC,20);
			coordinatelbl.setFont(newfont);
			add(coordinatelbl,"North");
			
			// we are using adapter class for using desired no. of method
			addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				coordinatelbl.setText("Pressed At:("+e.getX()+","+e.getY()+")");
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
			
				coordinatelbl.setText("Released At:("+e.getX()+","+e.getY()+")");
			}

		});
			
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		

	}
		public static void main(String[] args) {
			new MouseEventUsingAdapter();
			
		}
		}


