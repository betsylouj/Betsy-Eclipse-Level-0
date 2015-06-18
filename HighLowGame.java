import java.util.Random;

import javax.swing.JOptionPane;


public class HighLowGame
{
public static void main(String[] args)
{
	// 3. Change this line to give you a random number between 1 - 100. 
			int random = new Random().nextInt(100);
			String win = "No";
			// 2. Print out the random variable above
			System.out.println(random);
			// 11. do the following 10 times
			for (int i = 0; i < 10; i++)
			{
				// 1. ask the user for a guess using a pop-up window, and save their response 

				String guess = JOptionPane.showInputDialog("Guess!");
				// 4. convert the usersÕ answer to an int (Integer.parseInt(string))
				int numberGuess=Integer.parseInt(guess);
				// 5. if the guess is correct
				if(numberGuess == random)
				{
					win = "Yes";
					i=10;
				}
				else if (numberGuess < random)
					JOptionPane.showMessageDialog(null, "Too small");
				else
					JOptionPane.showMessageDialog(null, "Too big");
					// 6. win
				// 7. if the guess is high
					// 8. tell them it's too high
				// 9. if the guess is low
					// 10. tell them it's too low
			// 12. tell them they lose
			}
			if (win .equals("Yes"))
				JOptionPane.showMessageDialog(null, "YOU WIN!");
			else
				JOptionPane.showMessageDialog(null, "You lose!");
				
}
}
