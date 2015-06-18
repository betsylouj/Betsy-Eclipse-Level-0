import javax.swing.JOptionPane;

public class SpeakAndSpell
{
	public static void main(String[] args)
	{

		speak("");
		String word = JOptionPane.showInputDialog("Spell");
		if (word.equals("JAVA"))
		{

			speak("Awesome");
			JOptionPane.showMessageDialog(null, "AWESOME!");
		} else
		{
			speak("You failed");
			JOptionPane.showMessageDialog(null, "YOU FAILED");
		}
		speak("Spell Potato");
		String word2 = JOptionPane.showInputDialog("Spell");
		if (word2.equals("Potato"))
		{

			speak("Nice");
			JOptionPane.showMessageDialog(null, "NICE!");
		} else
		{
			speak("You're not very good at this, are you?");
			JOptionPane.showMessageDialog(null, "YOU FAILED");
		}
		speak("Spell Programming");
		String word3 = JOptionPane.showInputDialog("Spell");
		if (word3.equals("Programming"))
		{

			speak("Wow");
			JOptionPane.showMessageDialog(null, "WOW!");
		} else
		{
			speak("Go home and read a book.");
			JOptionPane.showMessageDialog(null, "YOU FAILED");
		}
		speak("Spell the answer of two plus two");
		String word4 = JOptionPane.showInputDialog("Spell the answer of two plus two");
		if (word4.equals("The answer of two plus two"))
		{

			speak("You're cheating, right?");
			JOptionPane.showMessageDialog(null, "HOW?!");
		} else
		{
			speak("Stop playing with JAVA and open up a dictionary.");
			JOptionPane.showMessageDialog(null, "YOU FAILED");
		}
		speak("Spell Cow");
		String word5 = JOptionPane.showInputDialog("Spell");
		if (word5.equals("Cow"))
		{
			
			speak("You win! Take some time to pat yourself on the back.");
			JOptionPane.showMessageDialog(null, "YOU WIN!");
		}
		else
		{
			speak("Oh My Gosh how can you not spell cow?");
			JOptionPane.showMessageDialog(null, "YOU LOSE. READ A BOOK.");
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
