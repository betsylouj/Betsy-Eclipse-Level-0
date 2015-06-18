import javax.swing.JOptionPane;
	
public class BirthdayReminder2
{
	    public static void main(String[] args) {
	        // 1. correct the birthdays for your family below
	        String momsBirthday = "June 25th";
	        String dadsBirthday = "December 28th";
	        String EvieBirthday = "July 24th";
	        String MartinBirthday = "March 4th";

	        // 2. Find out which birthday the user wants and and store their response in a variable

	    int person = JOptionPane.showOptionDialog(null, "Who's birthday do you want to know?", "Birthday reminder", 0,
                JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Mom", "Dad", "Evie", "Martin" }, null);

	        // 3. Print out what the user typed
	    System.out.println(person);
      
	        // 4. if user asked for "mom"
	    if (person == 0)
	    {
	    	JOptionPane.showMessageDialog(null,"Mom's birthday is " + momsBirthday);	
	    }
	    else if (person == 1)
		{
	    	JOptionPane.showMessageDialog(null,"Dad's birthday is " + dadsBirthday);
		} 
	    else if (person == 3)
		{
	    	JOptionPane.showMessageDialog(null,"Martin's birthday is " + MartinBirthday);
		} 
	    else if (person == 2)
			{
		    	JOptionPane.showMessageDialog(null,"Evie's birthday is " + EvieBirthday);
			} else
		{
				JOptionPane.showMessageDialog(null, "Sorry, I don't know that birthday");
		}
	            
	    } 
	}



