package innerclasses;

import javax.swing.JOptionPane;

public class InnerClassTest {

	public static void main(String[] args) {
		// TalkingClock clock = new TalkingClock(1000, false);
		TalkingClock clock = new TalkingClock();

		/* this how to refer to an inner class outside the scope of the outer class */
		// TalkingClock.TimePrinter printer = clock.new TimePrinter();
		clock.start(1000, false);

		JOptionPane.showMessageDialog(null, "Quit Program?");
		System.exit(0);
	}

}
