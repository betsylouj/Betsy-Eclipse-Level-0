import javax.swing.JOptionPane;


public class YearsAlive {
	public static void main(String[] args) {
		int year = 2015;
		String age = JOptionPane.showInputDialog("how old are you this year?");
		int ageN = Integer.parseInt(age);
		for (int i = 0; i <= ageN; i++) {
			System.out.println("You were alive in " + (year-ageN+i));
			JOptionPane.showMessageDialog(null, "You were alive in " + (year-ageN+i));
		}
	}

}
