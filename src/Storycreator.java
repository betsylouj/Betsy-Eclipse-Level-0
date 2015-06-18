import javax.swing.JOptionPane;


public class Storycreator
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		String adj = JOptionPane.showInputDialog("Hello " + name + ". Please give me an adjective");
		String noun = JOptionPane.showInputDialog("Please give me a noun");
		String verb = JOptionPane.showInputDialog("What do you like to do?");
		String adv = JOptionPane.showInputDialog("How do you sing");
		
		JOptionPane.showMessageDialog(null, "Wait for it......." );
		
		JOptionPane.showMessageDialog(null, "It was a " + adj + " and stormy night." );
		JOptionPane.showMessageDialog(null, name + " was " + verb + "ing in the bath, very " + adv + " with a " + noun );
	}

}
