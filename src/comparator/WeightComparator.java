package comparator;

import java.util.Comparator;

public class WeightComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {

		// return (int) (p1.getWeight() - p2.getWeight());
		double result = (p1.getWeight() - p2.getWeight());

		if (result > 0)
			return 1;
		else if (result < 0)
			return -1;
		else
			return 0;
	}

}
