package layoutmanagement;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//we are making a program to handle the actionEvent by clicking a button and adding new button

public class FlowlayoutDemo extends JFrame implements ActionListener {
JButton click,addbtn;

//flowlayout responsive hunxa
public FlowlayoutDemo() {
	setTitle("FlowLayout Frame");
	setLayout(new FlowLayout());
	click=new JButton("Add New Button");
	click.addActionListener(this);
	setSize(500,300);
	add(click);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}

 
@Override
public void actionPerformed(ActionEvent event) {
System.out.println("We are going to add new button");
	
	JButton addbtn=new JButton("New Button");
	add(addbtn);
	revalidate();//it preserves the recent activity in JFrame button add hudai jada save hudai janxa
	
}
	public static void main(String[] args) {
		new  FlowlayoutDemo();
	}
	
	

}
