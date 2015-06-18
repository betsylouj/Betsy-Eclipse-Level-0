import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class ForSquare
{
	public static void main(String[] args)
	{
		String sides=JOptionPane.showInputDialog(null, "How many sides would you like your shape to have?");
		int sides2=Integer.parseInt(sides);
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.setPenColor(Colors.Reds.Crimson);
		for (int i = 0; i < sides2; i++)
		{Tortoise.move(100);
			Tortoise.turn(360/sides2);
		}
	}
}
