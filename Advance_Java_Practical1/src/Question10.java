import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Question10  extends JFrame implements ChangeListener{
	
	  JSlider slider;
	    JTextField tf;
	    JPanel panel;
	    JLabel lbl;
	    
	public  Question10() {
		setTitle("Age Status");
        setSize(400, 250);

        tf = new JTextField(20);
        tf.setEditable(false);

        lbl = new JLabel("Age Status: Teen");
        panel = new JPanel();

        panel.setBackground(new Color(255, 100, 100));

        int start = 0, end = 90, dvalue = 15;

        slider = new JSlider(start, end, dvalue);

        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setSnapToTicks(false);

        tf.setText("Age = " + dvalue);

        slider.addChangeListener(this);

        panel.setLayout(new BorderLayout());

        add(panel);
        panel.add(slider, BorderLayout.NORTH);
        panel.add(tf, BorderLayout.CENTER);
        panel.add(lbl, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
		
	

	public static void main(String[] args) {
		new  Question10();

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		 int age = slider.getValue();

	        tf.setText("Age = " + age);

	        if (age <= 5)
	            lbl.setText("Age Status: Infant");
	        else if (age <= 13)
	            lbl.setText("Age Status: Child");
	        else if (age <= 19)
	            lbl.setText("Age Status: Teen");
	        else if (age <= 30)
	            lbl.setText("Age Status: Youth");
	        else if (age <= 50)
	            lbl.setText("Age Status: Adult");
	        else
	            lbl.setText("Age Status: Old");

	        int red = Math.min(255, age * 3);
	        panel.setBackground(new Color(red, 100, 100));
		
	}

}
