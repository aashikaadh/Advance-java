import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Question6 extends JFrame {
	
	public Question6() {
		  // JFrame configuration
        setTitle("Layout Managers Demonstration");
        setSize(700, 500);
        setLayout(new GridLayout(2, 2, 10, 10));

        // Panel 1: FlowLayout
        JPanel p1 = new JPanel(new FlowLayout());
        p1.setBorder(
            javax.swing.BorderFactory.createTitledBorder("FlowLayout"));

        p1.add(new JButton("One"));
        p1.add(new JButton("Two"));
        p1.add(new JButton("Three"));

        // Panel 2: BorderLayout
        JPanel p2 = new JPanel(new BorderLayout(5, 5));
        p2.setBorder(
            javax.swing.BorderFactory.createTitledBorder("BorderLayout"));

        p2.add(new JButton("North"), BorderLayout.NORTH);
        p2.add(new JButton("South"), BorderLayout.SOUTH);
        p2.add(new JButton("East"), BorderLayout.EAST);
        p2.add(new JButton("West"), BorderLayout.WEST);
        p2.add(new JButton("Center"), BorderLayout.CENTER);

        // Panel 3: GridLayout
        JPanel p3 = new JPanel(new GridLayout(2, 2, 5, 5));
        p3.setBorder(
            javax.swing.BorderFactory.createTitledBorder("GridLayout"));

        p3.add(new JButton("1"));
        p3.add(new JButton("2"));
        p3.add(new JButton("3"));
        p3.add(new JButton("4"));

        // Panel 4: GridBagLayout
        JPanel p4 = new JPanel(new GridBagLayout());
        p4.setBorder(
            javax.swing.BorderFactory.createTitledBorder("GridBagLayout"));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0;
        gbc.gridy = 0;
        p4.add(new JLabel("Name:"), gbc);

        gbc.gridx = 1;
        p4.add(new JTextField(10), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        p4.add(new JLabel("Email:"), gbc);

        gbc.gridx = 1;
        p4.add(new JTextField(10), gbc);

        // Adding four panels to JFrame
        add(p1);
        add(p2);
        add(p3);
        add(p4);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

	public static void main(String[] args) {
		new Question6();

	}

}
