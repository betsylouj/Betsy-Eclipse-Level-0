import javax.swing.JOptionPane;

public class SleepyHead {
	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		int weekday = JOptionPane.showConfirmDialog(null, "is it a weekday?",
				"", JOptionPane.YES_NO_OPTION);
		System.out.println(weekday);

		if (weekday == 0) {
			int vacation = JOptionPane.showConfirmDialog(null,
					"is it a vacation?", "", JOptionPane.YES_NO_OPTION);
			System.out.println(vacation);
			if (vacation == 1) {
				JOptionPane.showMessageDialog(null, "get up lazybones");
			} else {
				JOptionPane.showMessageDialog(null, "sleep in");
			}
		} else {
			JOptionPane.showMessageDialog(null, "sleep in");
		}
		// Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,

		// print “get up lazybones!” If it is a weekday, and we are on vacation,

		// print “sleep in”.
		//

	}

}
