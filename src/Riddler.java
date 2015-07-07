import javax.swing.JOptionPane;


public class Riddler {


    public static void main(String[] args) {


        // 1. Make a variable to hold the score
    	int score = 0;


        // 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
        // 4. If they got the answer right, pop up "correct!" and increase the score by one
        // 5. Otherwise, say "wrong" and tell them the answer
    	String answer1 = JOptionPane.showInputDialog("Why did the chicken cross the road?");
    	System.out.println(answer1);
    	if (answer1 .equals ("To get to the other side") )
    	{
    		score = score + 1;    
    		JOptionPane.showMessageDialog(null, "Well done!!");
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null, "Sorry, the answer is ...To get to the other side");
    	}
        // 6. Add some more riddles
    	String answer2 = JOptionPane.showInputDialog("What do you call a blind antelope?");
    	System.out.println(answer2);
    	if (answer2 .equals ("No idea") )
    	{
    		score = score + 1;    
    		JOptionPane.showMessageDialog(null, "Well done!!");
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null, "Sorry, the answer is ...No idea (eye-deer)");
    	}
        // 2. Make a pop up to show the score.
    	JOptionPane.showMessageDialog(null, "the score is " + score);
    }

}


