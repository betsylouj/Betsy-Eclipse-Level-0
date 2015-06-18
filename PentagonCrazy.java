import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
	public static void main(String[] args)
	{
		new PentagonCrazy().makePrettyThings();

	}

	private void makePrettyThings()
	{
		Tortoise.setSpeed(10);
		Tortoise.setPenWidth(10);

		int sides = 8;
		int angle = 360 / sides;
		for (int i = 0; i < 400; i++)
		{
			Tortoise.setPenColor(Colors.getRandomColor());
			;
			Tortoise.move(i);
			Tortoise.turn(360 / sides);
			Tortoise.turn(angle + 5);
		}
	}

}
