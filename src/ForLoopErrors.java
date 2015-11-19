import javax.swing.JOptionPane;


public class ForLoopErrors {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("How many bottles?");
		int bottles = Integer.parseInt(answer);
		for (int i = (bottles); i >1 ; i--) {
			
				JOptionPane.showMessageDialog(null,i +" green bottles hanging on the wall");
			JOptionPane.showMessageDialog(null, "Crash!!!!");
		}
		JOptionPane.showMessageDialog(null, "There's a lot of broken glass out here");
	}
}
