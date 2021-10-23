package quiz3_practice;

import java.util.Comparator;

public class SortByNameDescending implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {

		// return -(o1.getModel().compareTo(o2.getModel()));
		return (o1.getModel().compareTo(o2.getModel())) * -1;
	}

}
