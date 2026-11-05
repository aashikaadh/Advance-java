package ComponentsPackage.choiceComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
 

public class SliderDemonstrstion  extends JFrame implements ChangeListener{
	JSlider slider;
	JTextField tf;
	JPanel panel;
	
	public SliderDemonstrstion() {
		setTitle("Slider Frame");
		setSize(300,300);
		tf=new JTextField(20);
		panel=new JPanel();
		panel.setBackground(Color.GREEN);
		Color nc=new Color(255,100,100);
		panel.setBackground(nc);
		
		
		int start =0, end=100, dvalue=30;
		slider=new JSlider(start,end,dvalue); //slider range from 1 to 100 default value=20
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		
		//adding custom labels...........
		Dictionary<Integer,Component>custlbl=new Hashtable<Integer,Component>();
		custlbl.put(0, new JLabel("A"));
		custlbl.put(20, new JLabel("B"));
		custlbl.put(40, new JLabel("C"));
		custlbl.put(60, new JLabel("D"));
		custlbl.put(80, new JLabel("E"));
		custlbl.put(100, new JLabel("F"));
		
		slider.setLabelTable(custlbl);//set labels in slider
		//..........................
		tf.setText("Default value="+dvalue);
		slider.addChangeListener(this);
		panel.setLayout(new BorderLayout());
		add(panel);
		panel.add(slider,"North");
		panel.add(tf,"South");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new SliderDemonstrstion();

	}

	@Override
	public void stateChanged(ChangeEvent e) {
	tf.setText("the change value is "+ slider.getValue());
	Color nc=new Color(0+slider.getValue(),100,100);
	panel.setBackground(nc);
		
	}

}
