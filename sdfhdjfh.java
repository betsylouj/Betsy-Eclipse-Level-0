import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the tortoise will have to turn (360/5) */

public class sdfhdjfh
{
	public static void main(String[] args)
	{
		new sdfhdjfh().makePrettyThings();
	}

	private void makePrettyThings()
	{
		Tortoise.setSpeed(10);
		// 9. choose a color that you like for the shape
Tortoise.setPenColor(Colors.Blues.CornflowerBlue);
		
		int sides = 5;
		int angle = 360 / sides;
		for (int i = 0; i < 200; i++)
		{

			Tortoise.move(i);

			Tortoise.turn(angle);
			// 8. turn the tortoise one more degree
			Tortoise.turn(1);
		}
	}
	// Variations:
	// *9. make the pattern really huge
	// *10. change the color of the pattern
	// *11. experiment with different shapes
	// *12. create a method called, "adjustPen()"
	// that makes the pen get increasingly bigger.
	// stop the pen getting too big (width of 4 or more is too big)
	// *13. choose 5 colors and change them every time adjustPen() is called
}

// Copyright Wintriss Technical Schools 2013