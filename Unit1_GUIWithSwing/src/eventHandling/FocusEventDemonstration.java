package eventHandling;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FocusEventDemonstration extends JFrame implements FocusListener {
	
	JTextField tf1,tf2;
	JLabel Messagelbl1,Messagelbl2;
	
	public FocusEventDemonstration() {
		
		//configuration of jFrame
		super("Focus Event Frame");//just like setTitle
		setSize(300,300);
		
		tf1=new JTextField(20);
		tf1.addFocusListener(this);
		add(tf1,"North"); // north==boarderlayout.north
		tf2=new JTextField(20);
		tf2.addFocusListener(this);
		add(tf2,"South"); //south==boarderlayout.south 
		
		Messagelbl1=new JLabel("Message displyed here:");
		add(Messagelbl1,"East");//by default center
		Messagelbl2=new JLabel("Message displyed here:");
		add(Messagelbl2,"West");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
	new  FocusEventDemonstration();

	}

	@Override
	public void focusGained(FocusEvent e) {

		if(e.getSource()==tf1) 
			Messagelbl1.setText("Focus Gained in tf1");
		else
			Messagelbl1.setText("Focus Gained in tf2");
			
			
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource()==tf2) 
			Messagelbl2.setText("Focus Lost in tf2");
		else
			Messagelbl2.setText("Focus Lost in tf1");

		
	}

}
