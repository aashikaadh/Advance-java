package eventHandling;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyEventDemonstration  extends JFrame implements KeyListener{
//wap to do the basic mathmatical arithmatic operation in UI
	
	JLabel flbl,slbl,rlbl;
	JTextField ftxt,stxt,rtxt;
	
	
	
	public KeyEventDemonstration() {
		
		//jframe configuration
		
				setTitle("Calculater Frame");
				setSize(400,300);
				setLayout(new GridLayout(3,2,5,5)); //5-hgap , 5-vgap
				setResizable(false);
				
				//adding the component in a jfarme
				flbl=new JLabel("First Number");
				slbl=new JLabel("Second Number");
				rlbl=new JLabel("Result");
				ftxt=new JTextField(20);
				stxt=new JTextField(20);
				rtxt=new JTextField(20);
				
		//adding keyListener to rtxt text field
				
				rtxt.addKeyListener(this);
				
				//adding components to jframe
				add(flbl);
				add(ftxt);
				add(slbl);
				add(stxt);
				add(rlbl);
				add(rtxt);
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				 
	}
	public static void main(String[] args) {
		new KeyEventDemonstration ();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		int fnum=Integer.parseInt(ftxt.getText());
		int snum=Integer.parseInt(stxt.getText());
		int result=0;
		switch (e.getKeyChar()) {
		case 'a':
			result=fnum+snum;
			rlbl.setText("Sum="+result);
			break;
		case 's':
			result=fnum-snum;
			rlbl.setText("Difference="+Math.abs(result));
			break;
		case 'm':
			result=fnum*snum;
			rlbl.setText("Product="+result);
			break;
		case 'd':
			result=fnum/snum;
			rlbl.setText("Product="+result);
			break;
		case 'r':
			result=fnum%snum;
			rlbl.setText("Product="+result);
			break;
			default:
				rlbl.setText("Invalid Choice");
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

}
