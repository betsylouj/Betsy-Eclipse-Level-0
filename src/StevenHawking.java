import javax.swing.JOptionPane;

public class StevenHawking
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 1; i++)
		{
			String answer = JOptionPane.showInputDialog(null, "WHAT is your name?");
			if (answer.equals("Richard"))
			{
				JOptionPane.showMessageDialog(null, "COOL!");
				speak("COOL!");
			} else
				{
				JOptionPane.showMessageDialog(null, "Oh ");
				
			speak("Oh");
				}
			String answer2 = JOptionPane.showInputDialog(null, "WHAT is your favorite color?");
			if (answer2.equals("Red"))
			{
				JOptionPane.showMessageDialog(null, "But that's MINE!!! :(");
				speak("But that's MINE!");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Oh I don't like the color " + answer2);
			speak("Oh I don't like the color "+answer2);
			}
			String answer3 = JOptionPane.showInputDialog("WHAT is the capital of Assyria?");
			if (answer3.equals("I don't know"));
			{
			}

		}

		// 2. ask the user for a sentence
		// 3. repeat the sentence using the speak method below
		// 4. make this repeat a lot of times
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
