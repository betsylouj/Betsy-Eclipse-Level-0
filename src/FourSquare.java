import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class FourSquare {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		Tortoise.hide();
		Tortoise.setPenWidth(1);
		String sides = JOptionPane.showInputDialog("How many sides?");
		int intSides = Integer.parseInt(sides);
			for (int i = 0; i < intSides; i++)
			{
				Tortoise.setPenColor(Colors.getRandomColor());
			drawSquare(intSides);
			Tortoise.turn(360/intSides);
			}
	}
	static void drawSquare(int intSides) {
		
		for (int i = 0; i < intSides;i++)
		{
			int myturn = 360/intSides;
			Tortoise.move(100);
			Tortoise.turn(myturn);	
		}
		
		
		
		
	}
}
