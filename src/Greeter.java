import javax.swing.JOptionPane;


public class Greeter
{
public static void main(String[] args)
{
	String answer=JOptionPane.showInputDialog(null, "Name?");
	if (answer.equals ("Richard")) JOptionPane.showMessageDialog(null, "COOL!");
	else JOptionPane.showMessageDialog(null, "Oh ");
	String answer2=JOptionPane.showInputDialog(null, "WHAT is your favorite color?");
	if (answer2.equals ("Red")) JOptionPane.showMessageDialog(null, "But that's MINE!!! :(");
	else JOptionPane.showMessageDialog(null,"Oh I don't like the color "+answer2);
}
}
