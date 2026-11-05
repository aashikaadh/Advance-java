package ComponentsPackage.choiceComponent;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListDemonstrarion extends JFrame implements ListSelectionListener {
	JList<String>choiceList;
	JLabel selectedlbl;
	
	//super() is a method that is used to call the base class's constructor.
	
	public JListDemonstrarion() { //super("hello")=> Jframe("hello");
		setTitle("JList Frame");
		setSize(300,300);
		String foods[]= {"BURGER","KACHA MANGO","AMLA","KAAGATI","AMILO SUNTALA"};
		
		choiceList=new JList<String>(foods);
		choiceList.addListSelectionListener(this);
		add(choiceList,BorderLayout.NORTH);
		selectedlbl=new JLabel("Selected foods shown here:");
		add(selectedlbl,"South");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		new JListDemonstrarion();

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		selectedlbl.setText(choiceList.getSelectedValuesList().toString());
		
	}

}
