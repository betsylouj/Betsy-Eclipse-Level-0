import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 3; i++)
		{

			String color = JOptionPane.showInputDialog(null, "What color do you want the tortoise to draw?");

			if (color.equals("Red"))
				Tortoise.setPenColor(Colors.Reds.Crimson);

			else if (color.equals("Orange"))
				Tortoise.setPenColor(Colors.Oranges.Coral);

			else if (color.equals("Yellow"))
				Tortoise.setPenColor(Colors.Yellows.DarkGoldenrod);

			else if (color.equals("Green"))
				Tortoise.setPenColor(Colors.Greens.DarkGreen);

			else if (color.equals("Blue"))
				Tortoise.setPenColor(Colors.Blues.Blue);

			else if (color.equals("Purple"))
				Tortoise.setPenColor(Colors.Purples.BlueViolet);

			else if (color.equals("Pink"))
				Tortoise.setPenColor(Colors.Pinks.DeepPink);

			else
				Tortoise.setPenColor(Colors.getRandomColor());
			
			String shape = JOptionPane.showInputDialog("What kind of shape do you want the tortoise to draw?");
			
			if (shape.equals("Triangle"))
				for (int j = 0; j < 3; j++)
				{
					Tortoise.move(100);
			Tortoise.turn(120);
				}
			
				

			Tortoise.setPenWidth(10);

		}
	}
}
