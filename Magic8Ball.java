import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball
{
	public static void main(String[] args)
	{

		int number = new Random().nextInt(8);

		JOptionPane.showInputDialog("Ask a question to the 8 ball");

		JOptionPane.showMessageDialog(null, number);

		if (number == 0)
		{
			JOptionPane.showMessageDialog(null, "Yes!");
			speak("yes");
		}

		else if (number == 1)
		{
			JOptionPane.showMessageDialog(null, "No!");
			speak("No!");
		} else if (number == 2)
		{
			JOptionPane.showMessageDialog(null, "Maybe?");
			speak("Maybe?");
		} else if (number == 3)
		{
			JOptionPane.showMessageDialog(null, "HELP I'M A REAL BOY STUCK IN THIS PROGRAM SAVE MEEEEEH!!!!");
			speak("HELP I'M A REAL BOY STUCK IN THIS PROGRAM SAVE MEEEEEH!!!!");
		} else if (number == 4)
		{
			JOptionPane.showMessageDialog(null, "Potato.");
			speak("potato");
		} else if (number == 5)
		{
			JOptionPane.showMessageDialog(null, "42/0=Your Answer");
			speak("42/0=Your Answer");
		} else if (number == 6)
		{
			JOptionPane.showMessageDialog(null, "THAT'S IMPOSSIBLE!!!");
			speak("that's impossible");
		} else if (number == 7)
		{
			JOptionPane.showMessageDialog(null,
					"Sorry, due to Error 666, this 8 ball is now under the control of a program. Please return after your trip to China.");
			speak("Sorry, due to Error 666, this 8 ball is now under the control of a program. Please return after your trip to China.");
		} else if (number == 8)
		{
			JOptionPane.showMessageDialog(null, "True and False! But more truish than false. Is this false?");
			speak("True and False! But more truish than false. Is this false?");
		}
	}

	static void speak(String words)
	{
		try
		{
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
