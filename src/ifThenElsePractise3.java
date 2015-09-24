import javax.swing.JOptionPane;


public class ifThenElsePractise3 {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What animal do you like?");
		if (answer .equals("Dog")){
			JOptionPane.showMessageDialog(null, "Dogs go woof");
		}
		else if(answer .equals("Cat")){
			JOptionPane.showMessageDialog(null, "Cat go meow");
		}
		else if(answer .equals("Cow")){
			JOptionPane.showMessageDialog(null, "Cows go moo");
		}
		else{
			JOptionPane.showMessageDialog(null, "Sorry, I don't know that animal");
		}
	}

}
