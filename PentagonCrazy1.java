import org.teachingextensions.logo.Tortoise;


public class PentagonCrazy1
{
	public static void main(String[] args)
	{
		int i, sides;
		sides=5;
		for (i=1; i<=sides; i++)
		{
		Tortoise.move(50);
		Tortoise.turn(360/sides);
		}
	}
}
