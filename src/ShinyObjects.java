
import java.net.URL;



import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class ShinyObjects {

    public static void main(String[] args) {

        // 2. Ask the user how many shiny objects they want
String count = JOptionPane.showInputDialog("How many shiny objects do you want?");

        // 3. Play the sound that many times

int countInt = Integer.parseInt(count);
for(int i=0;i<countInt;i++)
	{
        // 1. Call the method below
    	playMisterZee();
	}
}

    public static void playMisterZee() {

        try {
            AudioInputStream audioInputStream = AudioSystem
                    .getAudioInputStream(new URL(
                            "https://github.com/joonspoon/league-jars/blob/master/shiny%20objects.wav?raw=true"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(3400);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


