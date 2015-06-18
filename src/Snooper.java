import javax.swing.JOptionPane;


public class Snooper
{
public static void main(String[] args)
{
	String answer=JOptionPane.showInputDialog(null, "What is your middle name?");
	JOptionPane.showMessageDialog(null, "No, 2/0= "+answer);
	String answer2=JOptionPane.showInputDialog("Are you wearing glasses?");
	
}
}
