import javax.swing.JOptionPane;

public class Question9 {

	public static void main(String[] args) {
		 String h = JOptionPane.showInputDialog(
	                "Enter height in meter:");

	        String w = JOptionPane.showInputDialog(
	                "Enter weight in kg:");

	        double height = Double.parseDouble(h);
	        double weight = Double.parseDouble(w);

	        double bmi = weight / (height * height);

	        String result;

	        if (bmi < 19)
	            result = "Underweight";
	        else if (bmi <= 25.9)
	            result = "Normal";
	        else if (bmi <= 30)
	            result = "Overweight";
	        else
	            result = "Obese";

	        JOptionPane.showMessageDialog(null,
	                "BMI: " + String.format("%.2f", bmi)
	                + "\nStatus: " + result);
	    }

	}


