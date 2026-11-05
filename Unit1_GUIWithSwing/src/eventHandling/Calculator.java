package eventHandling;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{
	
	JTextField display;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
	JButton add,sub,mul,div,equl,clear;
	double num1,num2,result;
	char operator;
	
	public  Calculator() {
		
		 // Create the window
        setTitle("Simple Calculator");
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Display field
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 25));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
        
        // Create panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        
        // Create number buttons
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn0 = new JButton("0");
        
        // Create operator buttons
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        equl = new JButton("=");
        clear = new JButton("C");
        
        // Add buttons to panel
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(div);

        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(mul);

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(sub);

        panel.add(btn0);
        panel.add(clear);
        panel.add(equl);
        panel.add(add);

        add(panel, BorderLayout.CENTER);
        
        // Register ActionListener
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        equl.addActionListener(this);
        clear.addActionListener(this);
        
        // Display the window
        setLocationRelativeTo(null);
        setVisible(true);
    

	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		

        String command = e.getActionCommand();

        // Handle number buttons
        if (command.matches("[0-9]")) {
            display.setText(display.getText() + command);
        }

        // Handle clear button
        else if (command.equals("C")) {
            display.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
            operator = '\0';
        }

        // Handle operator buttons
        else if (command.equals("+") ||
                 command.equals("-") ||
                 command.equals("*") ||
                 command.equals("/")) {

            if (display.getText().isEmpty()) {
                return;
            }

            num1 = Double.parseDouble(display.getText());
            operator = command.charAt(0);
            display.setText("");
        }

        // Handle equal button
        else if (command.equals("=")) {

            if (display.getText().isEmpty() || operator == '\0') {
                return;
            }

            num2 = Double.parseDouble(display.getText());

            switch (operator) {

                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) {
                        display.setText("Cannot divide by zero");
                        operator = '\0';
                        return;
                    }
                    result = num1 / num2;
                    break;
            }

            display.setText(String.valueOf(result));
            operator = '\0';
        }
    
	}
	
	public static void main(String[] args) {
		new Calculator();

		}

}
