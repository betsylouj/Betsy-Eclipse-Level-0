	// Copyright Wintriss Technical Schools 2013

	import javax.swing.JOptionPane;



import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

	public class TortoiseSpiral 
{
	    public static void main(String[] args) 
	{
	    	int sides = 0;  
	    	Tortoise.setSpeed(10);
	    	Tortoise.setPenColor( Colors.Reds.LightSalmon);

	        // 4. Ask the user which spiral they would like (square, triangle, or pentagon)

	        String answer = JOptionPane.showInputDialog("Would you like a square, triangle or pentagon?");

	        // 5. Set the number of sides depending on what the user entered (multiple lines of code)

	        if (answer .equals ("square") || answer .equals ("Square"))
			{
	        	sides = 4;
			} else if (answer .equals ("triangle") || answer .equals ("Triangle"))
			{
				sides = 3;
			} else if (answer .equals ("pentagon") || answer .equals ("Pentagon"))
			{
				sides = 5;
			} else
				JOptionPane.showMessageDialog(null, "I don't know how to draw that");
	   
	   int angles = 360/sides;
	   int length =  10; 
	   for (int j = 0; j<100; j++)
	   {
		  for (int i = 0; i < sides; i++)
		   {	   	
			  	Tortoise.move(length);
		  		Tortoise.turn(angles);
		  		length = length +5;      
	   		}	   
	   	}  
	}
}




