package eventHandling;

import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class WindowEventDemonstration  extends JFrame implements WindowListener{

	public WindowEventDemonstration() {
		setTitle("Mouse Event Frame");
		setSize(500,500);
		addWindowListener(this);//this is an instance of windowListenerp
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new WindowEventDemonstration();

	}

	@Override
	public void windowOpened(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "Welcome To MyApplication");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "Bye Bye Tata See you soon");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
		JOptionPane.showMessageDialog(this, "See you back");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "Welcome Back after a break");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
    System.out.println("Window is activated");

		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	System.out.println("Window is Deactivated");
		
	}

}
