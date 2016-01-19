import org.jointheleague.graphical.robot.Robot;

public class TortoiseWalkOfFame {
	public static void main(String[] args) {
		int x = 10;

		Robot betsy = new Robot();
		betsy.hide();
		betsy.setSpeed(10);
		betsy.penDown();

		betsy.setY(300);
		for (int j = 0; j < 30; j++) {
			betsy.setX(x);
			for (int i = 0; i < 5; i++) {
				betsy.move(30);
				betsy.turn(144);

			}
			x = x + 50;
		}

	}
}
