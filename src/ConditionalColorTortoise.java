	// Copyright Wintriss Technical Schools 2013

	import javax.swing.JOptionPane;

	import java.awt.Color;

	import org.teachingextensions.logo.Colors;
	import org.teachingextensions.logo.Tortoise;


	public class ConditionalColorTortoise {

	    public static void main(String[] args) {

	    	for (int j = 0; j < 10; j++)
	    	{
	        //3. ask the user what color they would like the tortoise to draw

	    	String colour=JOptionPane.showInputDialog(null, "What color would you like?");
	        //4. use an if/else statement to set the pen color that the user requested

	    	if (colour.equals("red"))  
	    	  Tortoise.setPenColor(Colors.Reds.Crimson);
	    	else if (colour.equals("blue"))  
	    	  Tortoise.setPenColor(Colors.Blues.CornflowerBlue);
	    	else if (colour.equals("green"))  
		      Tortoise.setPenColor(Colors.Greens.ForestGreen); 
	    	else 
	    	  Tortoise.setPenColor(Colors.getRandomColor());
	//5. if the user doesn’t enter anything, choose a random color


	//6. put a loop around your code so that you keep asking the user for more colors & drawing them

	        

	        //2. set the pen width to 10
	    	Tortoise.setPenWidth(10);
	        
	    //1. make the tortoise draw a shape (this will take more than one line of code)
	    //	String sides=JOptionPane.showInputDialog(null, "How many sides would you like your shape to have?");
		//	int sides2=Integer.parseInt(sides);
	    	int sides2=4;
			Tortoise.show();
			Tortoise.setSpeed(10);
		//	Tortoise.setPenColor(Colors.Reds.Crimson);
			for (int i = 0; i < sides2; i++)
			{Tortoise.move(100);
				Tortoise.turn(360/sides2);
			}
			try {
			    Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}            
	    	}
	    }
	  }
	

	
