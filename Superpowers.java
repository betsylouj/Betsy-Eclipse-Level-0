
// Copyright Wintriss Technical Schools 2014

import javax.swing.JOptionPane;


/*

 * Everyone has a superpower. Mine is writing recipes. This program will store

 * the superpowers of all the people in the classroom. E.g. When I type "June",

 * your program should say "June's superpower is writing recipies".

 */

public class Superpowers {

public static void main(String[] args) {


        // 1. Save the superpower for each person in a variable.


        // 2. Ask the user to enter a name. Store their answer in a variable.


        // 3. Show the superpower in a pop-up, depending on the name entered. 

	String JuneSP = "X-ray vision";
	String BetsySP = "Time travel";
	String LucasSP = "Turning things to ice";
	String AnnaSP = "Making everyone happy";
	String JPSP = "Walking up walls";
	String HenrySP = "Remembering everything";
	String superpower="";
	String OK;
	
	String name = JOptionPane.showInputDialog("Hello, what is your name?");
do {	
	OK = "Yes";
	if (name .equals  ("Betsy"))
		{
		superpower = BetsySP;
		}
	else if (name .equals  ("June"))
		{	  
		superpower = JuneSP;
		}
	else if (name .equals  ("Anna"))
		{
		superpower = AnnaSP;
		}
	else if (name .equals  ("Lucas"))
		{
		superpower = LucasSP;
		}
	else if (name .equals  ("Henry"))
		{
		superpower = HenrySP;
		}
	else if (name .equals  ("Jean-Pierre"))
		{
		superpower = JPSP;
		}
	else
		{
		name = JOptionPane.showInputDialog(null, "Sorry, I don't know that name, please try again");
		OK = "No";
		}
} while (OK .equals ("No"));

JOptionPane.showMessageDialog(null, "Welcome " + name +". Your amazing super power is " + superpower);

}
}

