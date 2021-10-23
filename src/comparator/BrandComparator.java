package comparator;

import java.util.Comparator;

public class BrandComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {

		return o1.getBrand().compareToIgnoreCase(o2.getBrand());
	}

}
