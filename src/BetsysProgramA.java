
	import java.util.Random;

import javax.swing.JOptionPane;
	
public class BetsysProgramA
{
	
	public static void main(String[] args)
	{
		String message = "YOLO";
		
		
	for	(int i=0; i<10; i++)
	{
		String usernumber = JOptionPane.showInputDialog("Ask the 8 ball a question");
		
		int randomnumber = new Random().nextInt(4);
		JOptionPane.showMessageDialog(null,"The random number is " + randomnumber);
		
	if (randomnumber == 0)
	{
		JOptionPane.showMessageDialog(null,"I think so");
	} else if (randomnumber == 1)
	{
		JOptionPane.showMessageDialog(null,"Definitely not!!");
	}
	else if (randomnumber == 2)
	{
		JOptionPane.showMessageDialog(null,"That's silly");
	}	
	else if (randomnumber == 3)
	{
		JOptionPane.showMessageDialog(null,"A dog");
	}	
	else 
	{
		JOptionPane.showMessageDialog(null,"I cannot disclose that information");
	}
	}

		    // 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"


		    // 3. Print out this variable


		    // 4. Get the user to enter a question for the 8 ball


		    // 5. If the random number is 0


		    // -- tell the user "Yes"


		    // 6. If the random number is 1


		    // -- tell the user "No"


		    // 7. If the random number is 2


		    // -- tell the user "Maybe?"


		    // 8. If the random number is 3


		    // -- write your own answer


		}



		
	}


