package eventHandling;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventDemonstrstion extends JFrame implements MouseListener {
	JLabel coordinatelbl;
	
	public MouseEventDemonstrstion() {
		
		setTitle("Mouse Event Frame");
		setSize(500,500);
		coordinatelbl=new JLabel("x,y coordinates are displayed over here:");
		Font newfont =new Font(Font.MONOSPACED, Font.BOLD+Font.ITALIC,20);
		coordinatelbl.setFont(newfont);
		add(coordinatelbl,"North");
		addMouseListener(this);//mouselinstener is registered to jFrame
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new MouseEventDemonstrstion();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		coordinatelbl.setText("Clicked At:("+e.getX()+","+e.getY()+")");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	
		coordinatelbl.setText("Pressed At:("+e.getX()+","+e.getY()+")");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		coordinatelbl.setText("Released At:("+e.getX()+","+e.getY()+")");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		coordinatelbl.setText("Entered At:("+e.getX()+","+e.getY()+")");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		coordinatelbl.setText("Exited At:("+e.getX()+","+e.getY()+")");
		
	}

}
