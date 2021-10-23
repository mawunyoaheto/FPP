package innerclasses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class TalkingClock {

//	private int interval;
//	private boolean beep;

	public TalkingClock() {
		super();
//		this.interval = interval;
//		this.beep = beap;
	}

	/* starts the clock */

	public void start(int interval, final boolean beep) {

		class TimePrinter implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				Date now = new Date();
				System.out.println("At the tone, the time is: " + now);
				if (beep)
					java.awt.Toolkit.getDefaultToolkit().beep();
			}

		}

		// ActionListener listener = this.new TimePrinter();
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();

	}

//	public class TimePrinter implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			Date now = new Date();
//			System.out.println("At the tone, the time is: " + now);
//			if (beep)
//				java.awt.Toolkit.getDefaultToolkit().beep();
//		}
//
//	}
}
