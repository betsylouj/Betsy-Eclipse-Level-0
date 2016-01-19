import java.time.LocalDate;
import java.time.MonthDay;

import javax.swing.JOptionPane;

public class Dates {
	public static void main(String[] args) {
		MonthDay date = MonthDay.now();
		String dateS = "" + date;
		System.out.println(dateS);

		String birthday = JOptionPane
				.showInputDialog("When is your birthday?  (Please input as mm-dd)");
		birthday = "--"+birthday;
		System.out.println(birthday); 
		if (birthday.equalsIgnoreCase(dateS)) {
			JOptionPane.showMessageDialog(null, "Happy Birthday");
		} else {
			JOptionPane.showMessageDialog(null,
					"a very merry UN-Birthday to you");
		}
	}
}
