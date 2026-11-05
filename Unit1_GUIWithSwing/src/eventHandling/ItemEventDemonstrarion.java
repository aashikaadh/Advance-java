package eventHandling;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class ItemEventDemonstrarion  extends JFrame implements ItemListener{

	JLabel courslbl,countrylbl,genderlbl;
	JRadioButton male,female,notspec;
	JCheckBox bca,csit,bbm,bbs;
	JComboBox<String> country;
	
	public ItemEventDemonstrarion() {
		setTitle("Item Listener");
		setSize(400,300);
		setLayout(new FlowLayout(FlowLayout.LEFT, 5,15));
		//connection component
		courslbl=new JLabel("Select Courses:");
				countrylbl=new JLabel("Select Countrys:");
		genderlbl=new JLabel("Select Gender");
		
		//radiobuttons
		ButtonGroup bg=new ButtonGroup();
		male=new JRadioButton("MALE");
		female=new JRadioButton("FEMALE");
		notspec=new JRadioButton("NOT SPECIFIED");
		
		//adding radiobutton in buttongroup
		bg.add(male);
		bg.add(female);
		bg.add(notspec);
		
		//CHECKBOXS
		bca=new JCheckBox("BCA");
		csit=new JCheckBox("CSIT");
		bbm=new JCheckBox("BBM");
		bbs=new JCheckBox("BBS");
		//COMBOBOX
		String countries[]= {"Nepal","pakisthan","America","Japan"};
		country=new JComboBox<String>(countries);
		
		//adding itemlistener to all the choice component
		
		male.addItemListener(this);
		female.addItemListener(this);
		notspec.addItemListener(this);
		bca.addItemListener(this);
		csit.addItemListener(this);
		bbm.addItemListener(this);
		bbs.addItemListener(this);
		country.addItemListener(this);
		
		//adding component to jaframe
		
		add(courslbl);
		add(bca);
		add(csit);
		add(bbs);
		add(bbm);
		add(genderlbl);
		add(male);
		add(female);
		add(notspec);
		add(countrylbl);
		add(country);
		
		//showing jframe
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		new ItemEventDemonstrarion();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
	
		if(e.getSource()==male && male.isSelected()==true) {
			JOptionPane.showMessageDialog(this, male.getText());
		}
		if(e.getSource()==female && female.isSelected()==true) {
			JOptionPane.showMessageDialog(this, female.getText());
		}
		if(e.getSource()==notspec && notspec.isSelected()==true) {
			JOptionPane.showMessageDialog(this, notspec.getText());
		}
		
		//combobox
		if(e.getSource()==country && e.getStateChange()==ItemEvent.SELECTED) {
			JOptionPane.showMessageDialog(this, country.getSelectedItem());
		}
		
		//checkboxes
		if(e.getSource()==bca || e.getSource()==csit||e.getSource()==bbm||e.getSource()==bbs) {
		JCheckBox choice=(JCheckBox) e.getSource();
		String ch=choice.getText();
		JOptionPane.showConfirmDialog(choice, ch);
	}
	
}
}
