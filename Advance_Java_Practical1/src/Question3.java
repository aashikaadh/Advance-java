import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Question3  extends JFrame implements ActionListener{
	   JLabel imagelbl;
	    JButton changebtn;
	    ImageIcon img1, img2;
	    boolean flag = true;

	public Question3() {
		 // JFrame configuration
        setTitle("Image Frame");
        setSize(400, 350);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        setResizable(false);

        // Image creation
        img1 = new ImageIcon("image1.jpg");
        img2 = new ImageIcon("image2.jpg");

        // Resize images
        Image image1 = img1.getImage().getScaledInstance(
                200, 200, Image.SCALE_SMOOTH);
        Image image2 = img2.getImage().getScaledInstance(
                200, 200, Image.SCALE_SMOOTH);

        img1 = new ImageIcon(image1);
        img2 = new ImageIcon(image2);

        // Component creation
        imagelbl = new JLabel(img1);
        changebtn = new JButton("Change Image");

        // Adding ActionListener
        changebtn.addActionListener(this);

        // Adding components to JFrame
        add(imagelbl);
        add(changebtn);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
	

	public static void main(String[] args) {
		new Question3();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		   if (flag)
	            imagelbl.setIcon(img2);
	        else
	            imagelbl.setIcon(img1);

	        flag = !flag;
	    }
		
	}


