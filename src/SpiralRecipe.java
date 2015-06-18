import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class SpiralRecipe
{
	public static void main(String[] args)
	{Tortoise.show();
	Tortoise.setSpeed(10);
	for (int i = 0; i < 75; i++)
	{Tortoise.move(5*i);
		Tortoise.setPenColor(Colors.getRandomColor());
	Tortoise.turn(360/7);
	Tortoise.setPenWidth(i);
	}

	}

	}

