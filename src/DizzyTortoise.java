
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;


public class DizzyTortoise {


    public static void main(String[] args) {
    	Tortoise.setSpeed(2);
    	String turnsString = JOptionPane.showInputDialog("How many times should the tortosie turn (up to 10)");
    	int turnInt = Integer.parseInt(turnsString);
    	/*for (int i = 0;i<2;i++)
    	*{
    	*if (turnInt>10)
    	*{
    	*	turnsString = JOptionPane.showInputDialog("The tortoise can only turn up to 10 times - choose again");	
    	*	turnInt = Integer.parseInt(turnsString);
    	*	i=0;
    	*}
    	*else
    	*{
    	*	i=2;
    	*}
    	*}
    	*/
    	
    	while (turnInt>10)
    	{
    		turnsString = JOptionPane.showInputDialog("The tortoise can only turn up to 10 times - choose again");	
        	turnInt = Integer.parseInt(turnsString);
    	}
    	dance(turnInt);
        /*
         * 1. Use the dance method to make the Tortoise spin.
         * 
         * 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
         * that number of times.
         */
    }

    static void dance(int numberOfSpins) {

        for (int i = 0; i < numberOfSpins; i++) {
            Tortoise.turn(360);
        }
    }
}

