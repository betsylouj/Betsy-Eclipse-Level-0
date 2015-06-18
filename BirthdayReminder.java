import javax.swing.JOptionPane;
	
public class BirthdayReminder
{
	 // Copyright Wintriss Technical Schools 2013

	    public static void main(String[] args) {

	        // 1. correct the birthdays for your family below

	        String momsBirthday = "June 25th";
	        String dadsBirthday = "December 28th";
	        String myBirthday = "July 24th";

	        // 2. Find out which birthday the user wants and and store their response in a variable
	    String person = JOptionPane.showInputDialog("Who's birthday do you want to know?");

	        // 3. Print out what the user typed
	    JOptionPane.showMessageDialog(null, person);
        

	        // 4. if user asked for "mom"
	    if (person .equals("mom"))
	    {
	    	JOptionPane.showMessageDialog(null,"Mom's birthday is " + momsBirthday);	
	    }
	    else if (person .equals("dad"))
		{
	    	JOptionPane.showMessageDialog(null,"Dad's birthday is " + dadsBirthday);
		} 
	    else if (person .equals("Evie"))
			{
		    	JOptionPane.showMessageDialog(null,"Evie's birthday is " + myBirthday);
			} else
		{
				JOptionPane.showMessageDialog(null, "Sorry, I don't know that birthday");
		}
	            //print mom's birthday
	        // 5. if user asked for "dad"
	            // print dad's birthday
	        // 6. if user asked for your name
	            // print myBirthday
	        //7. otherwise print "Sorry, i don't remember that person's birthday!"
	    } 
	}
