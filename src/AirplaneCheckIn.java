
// Copyright Wintriss Technical Schools 2013

import javax.swing.JOptionPane;


/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 *         First name 
 *         Last name
 *         Destination airport 
 *         Birthday (for security purposes) 
 *         Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:

 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 

 * Traveling to: DESTINATION

 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables

 * 

 **/

public class AirplaneCheckIn {
	
	public static void main(String[] args)
	{
		String firstname = JOptionPane.showInputDialog("What is your first name?");
		String lastname = JOptionPane.showInputDialog("What is your last name?");
		String airport = JOptionPane.showInputDialog("Which airport are you going to?");
		String birthday = JOptionPane.showInputDialog("When is your birthday? MM/DD/YY");
		String gender = JOptionPane.showInputDialog("Are you a boy or a girl?");
		if (gender .equals("boy"))
		{
			gender = "M";
		} else
		{
			gender = "F";
		}
		JOptionPane.showMessageDialog(null, lastname.toUpperCase() + " / " + firstname.toUpperCase() + " (" + birthday + ", " + gender + ")" + "\nTravelling to :" + airport.toUpperCase());
	}
}

