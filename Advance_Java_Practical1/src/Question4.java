import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Question4 extends JFrame implements ActionListener {
	
	JLabel numlbl, rsllbl;
	JTextField numtxt;
	JButton fbtn;
	
	public Question4() {
		//jframe configuration
		
				setTitle("Factorial Frame");
				setSize(400,300);
				setLayout(new FlowLayout(FlowLayout.LEFT,20, 10)); //20-hgap , 10-vgap
				setResizable(false);
				//component creation
				numlbl=new JLabel("Enter any number");
				rsllbl=new JLabel();
				numtxt=new JTextField(20);
				fbtn=new JButton("Calcutate Factorial");
				//adding actionlistener to jbutton
				
				fbtn.addActionListener(this);
				//addition of components in jfarme
				add(numlbl);
				add(numtxt);
				add(rsllbl);
				add(fbtn);
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				 
				
			}
			//recursive method for finding factorial
			public static int factorial(int n) {
				if(n==0||n==1)
					return 1;
				
				return n*factorial(n-1);
			}

	public static void main(String[] args) {
		new Question4();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int number=Integer.parseInt(numtxt.getText());
		if(number>0)
			rsllbl.setText("factorial="+factorial(number));
		else
			rsllbl.setText("Enter positive number");
		
	}

}
