package layoutmanagement;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//create a login form containing username and password
public class GridLayoutDemo  extends JFrame {
	
	JLabel userlbl, pwdlbl, errlbl;
	JTextField usertxt;
	JPasswordField pwdtxt;
	JButton lgnbtn;
	
	
	public GridLayoutDemo() {
		//creating objects
		userlbl=new JLabel("USERNAME");
		usertxt=new JTextField(20);
		pwdlbl=new JLabel("PASSWORD");
		pwdtxt=new JPasswordField(20);
		errlbl=new JLabel();
		lgnbtn=new JButton("LOGIN");
		lgnbtn.addActionListener(new ActionListener() { //using anonymous inner class

			@Override
			public void actionPerformed(ActionEvent e) {
				char[] pass=pwdtxt.getPassword();
				int plen= pass.length;
				if(plen >= 8 && plen <= 15) {
					errlbl.setForeground(Color.GREEN);
					errlbl.setText("Valid Password");
				}else {
					errlbl.setForeground(Color.RED);
					errlbl.setText("Invalid Password");
					
				}
				
			}
			
		});
		//adding components
		add(userlbl);
		add(usertxt);
		add(pwdlbl);
		add(pwdtxt);
		add(errlbl);
		add(lgnbtn);
		
		//CONFIGURATION OF JFRAME
		setTitle("Login From");
		setSize(300,400);
		setLayout(new GridLayout(3,2,5,5)); //row 3, cols 3 5hgap , 5vgap
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		
	}

	public static void main(String[] args) {
		new GridLayoutDemo();

	}

}
