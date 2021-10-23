package quiz3_practice;

import java.util.Comparator;

public class SortByTopSpeedDescending implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {

		// double result = (o1.getTopSpeed() - o2.getTopSpeed()) * -1;

		if ((o1.getTopSpeed() - o2.getTopSpeed()) * -1 > 0)
			return 1;
		else if ((o1.getTopSpeed() - o2.getTopSpeed()) * -1 > 0)
			return -1;
		else
			return 0;
	}

}
