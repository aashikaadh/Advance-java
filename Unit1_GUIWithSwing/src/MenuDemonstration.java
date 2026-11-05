import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class MenuDemonstration extends JFrame {
	JMenuBar bar;
	JMenu file, view;
	JMenuItem save, open, exit, color;
	JCheckBoxMenuItem check;
	JRadioButtonMenuItem select;

	public MenuDemonstration() {
		setTitle("Menu Frame");
		setSize(300, 300);
		// components add
		bar = new JMenuBar();
		// menu
		file = new JMenu("FILE");
		file.setMnemonic('F');// alt+f
		view = new JMenu("VIEW");
		view.setMnemonic('V');// alt+v
		// menuitems
		save = new JMenuItem("Save");
		open = new JMenuItem("Open");
		open.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new JFileChooser().showOpenDialog(bar);
			}
		});
		exit = new JMenuItem("Exit");
		exit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
		exit.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		color = new JMenuItem("Color");
		color.setAccelerator(KeyStroke.getKeyStroke("ctrl C"));
		color.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				Color c= new JColorChooser().showDialog(bar, "Select color", Color.WHITE);
				bar.setBackground(c);

			}
		});
		check = new JCheckBoxMenuItem("Check");
		select = new JRadioButtonMenuItem("Select");
		// adding corresponding menuitems to menus
		file.add(save);
		file.add(open);
		file.add(exit);
		view.add(color);
		view.add(check);
		view.add(select);
		// adding menus to bar
		bar.add(file);
		bar.add(view);
		setJMenuBar(bar);// JMenu is set to north position of JFrame
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MenuDemonstration();
	}

}
