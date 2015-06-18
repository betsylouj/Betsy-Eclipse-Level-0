import javax.swing.JOptionPane;
import java.text.*;

public class ChangeCalculator2
{
public static void main(String[] args)
{
	
	/*
	 * I have a pocket full of change. I hate doing math. Make me a program that
	 * will calculate how much money I have without me having to use my brain. 
	 */
	
			// Ask the user how many nickels they have
	String nickels=JOptionPane.showInputDialog(null, "How many nickels do you have?");

			// Convert their answer to an int using Integer.parseInt()
	int nickels2=Integer.parseInt(nickels);

			// Ask the user how many dimes they have, and convert their answer
	String dimes=JOptionPane.showInputDialog(null, "How many dimes do you have?");
	int dimes2=Integer.parseInt(dimes);

			// Ask the user how many quarters they have, and convert their answer
	String quarters=JOptionPane.showInputDialog(null, "How many quarters do you have?");
	int quarters2=Integer.parseInt(quarters);

			// Calculate how much money the user has and save it in a double variable 
	int money=(nickels2 * 5 + dimes2 * 10 + quarters2 * 25);
	double money2 = money;
	money2 = money2/100;
	
			// Tell the user how much money they have
	JOptionPane.showMessageDialog(null,"you have $" + money2);
	}
}

