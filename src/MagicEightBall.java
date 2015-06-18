// Copyright Wintriss Technical Schools 2013

import java.util.Random;

import javax.swing.JOptionPane;

public class MagicEightBall {
public static void main(String[] args)
{
	
	for (int i=0;i<5;i++)
	{
	int newNumber = new Random().nextInt(4);
	System.out.println(newNumber);
	JOptionPane.showInputDialog(null, "What is Your question?");
	if (newNumber == 0)
	{
		JOptionPane.showMessageDialog(null, "Yes");	
	}
	else if (newNumber == 1)
	{
		JOptionPane.showMessageDialog(null, "No");	
	}
	else if (newNumber == 2)
	{
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");	
	}
	else if (newNumber == 3)
	{
		JOptionPane.showMessageDialog(null, "Your face");	
	}
	else
		JOptionPane.showMessageDialog(null, "Error!!!!");
	}	
}
}


