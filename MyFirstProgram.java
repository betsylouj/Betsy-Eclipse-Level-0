import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class MyFirstProgram {
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.setPenColor(Colors.Reds.Crimson);
		Tortoise.setAnimal(Animals.Spider);
		Tortoise.move(200);
		Tortoise.setSpeed(10);
		Tortoise.turn(90);
	}
}
