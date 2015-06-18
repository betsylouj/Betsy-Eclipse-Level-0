import java.util.Random;

import javax.swing.JOptionPane;


public class Test

     {
	public static void main(String[] args)
	{
		
//         System.out.println("Welcome to the LEAGUE!");
//         int j = 50;
//         for(int i = 0; i < 51; i++)
//         {
//              System.out.println(j);
//              j=j-1;
//         }
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello "+ name + "! How beautiful you are.");


//Random rn = new Random();



for (int i=0;i<10;i++)
{
	int randomInt = new Random().nextInt(10);

	System.out.println(randomInt);	

}


	}
    }


