import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Question5 extends JFrame implements KeyListener {
	 JLabel charlbl, rsllbl;
	    JTextField chartxt;
	    
	public Question5() {
		// JFrame configuration
        setTitle("Vowel or Consonant");
        setSize(400, 200);
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        setResizable(false);

        // Component creation
        charlbl = new JLabel("Enter any character");
        chartxt = new JTextField(15);
        rsllbl = new JLabel("Result will appear here");

        // Adding KeyListener
        chartxt.addKeyListener(this);

        // Adding components to JFrame
        add(charlbl);
        add(chartxt);
        add(rsllbl);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


	public static void main(String[] args) {
		new Question5();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		  char ch = Character.toLowerCase(e.getKeyChar());

	        if (ch >= 'a' && ch <= 'z') {
	            if ("aeiou".indexOf(ch) != -1)
	                rsllbl.setText("Vowel");
	            else
	                rsllbl.setText("Consonant");
	        } else if (!Character.isISOControl(ch)) {
	            rsllbl.setText("Enter an alphabet");
	        }
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

}
