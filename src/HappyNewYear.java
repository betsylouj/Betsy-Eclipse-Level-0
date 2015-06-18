import java.applet.AudioClip;

import javax.swing.JApplet;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class HappyNewYear
{
public static void main(String[] args)
{

for (int i = 10; i > 0; i--)
{
	speak(i +"");
}
	
	speak("Happy New Year!");

	Tortoise.setPenWidth(10);
	Tortoise.setSpeed(5);
	Tortoise.setPenColor(Colors.getRandomColor());
	Tortoise.move(200);
	Tortoise.turn(120);
	Tortoise.move(200);
	Tortoise.turn(120);
	Tortoise.move(200);
	Tortoise.turn(120);

		}

		static void speak(String words) {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private void playSound(String fileName) {
			AudioClip sound = JApplet
					.newAudioClip(getClass().getResource(fileName));
			sound.play();
		
}
}

