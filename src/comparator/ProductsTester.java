package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ProductsTester {


	public static void main(String[] args) {


		// Product pDucts = new Product("Phone", "Samsung", 355.00);

		// Product.NameComparator myNameComparator = pDucts.new NameComparator();
		Product.NameComparator myNameComparator = (new Product()).new NameComparator();
		Product.BrandComparator myBrandComparator = new Product.BrandComparator();

		String[] sortingType = { "Default", "Name", "Brand", "Price", "Weight" };

		// Arrays.sort(sortingType, new StringComparator());

		// System.out.println(Arrays.toString(sortingType));

		ProductCategory c1 = new ProductCategory("beverages");
		ProductCategory c2 = new ProductCategory("electronics");
		ProductCategory c3 = new ProductCategory("baby-products");

		Product p1 = new Product("Milo", "Nestle", 18.50, 1.8, c1);
		Product p2 = new Product("Coffee", "Nestle", 18.50, 1.4, c1);
		Product p3 = new Product("Coffee", "Planters", 18.50, 1.4, c1);

		Product p4 = new Product("Baby wipes", "Planters", 1.50, 0.7, c3);
		Product p5 = new Product("Baby diapers", "Pampers", 13.50, 1.2, c3);
		Product p6 = new Product("Baby wipes ", "Chicco", 1.20, 0.8, c3);

		Product[] allProducts = { p1, p2, p3, p4, p5, p6 };

		Hashtable<Product, Product> ht = new Hashtable<Product, Product>();
		ht.put(p1, p1);
		ht.put(p2, p2);
		ht.put(p3, p3);
		ht.put(p4, p4);
		ht.put(p5, p5);
		ht.put(p6, p6);

		Set<Product> setOfKeys = ht.keySet();

		Iterator<Product> itr = setOfKeys.iterator();

		while (itr.hasNext()) {

			// Getting key of a particular entry
			Product key = itr.next();

			// Print and display the Rank and Name
			System.out.println("Rank : " + key + "\t\t Name : " + ht.get(key));
		}

		// ht.forEach(s->System.out.println(s));

		System.out.println("**************Before Sorting*************");

		for (Product p : allProducts) {
			System.out.println(p);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease select from the options below how you wan the products to be sorted \n"
				+ "1. Sort by Name\n2. Sort by brand \n3. Sort by price\n4. Sort by weight");
		int input = sc.nextInt();
		sc.close();

		switch (input) {
		case 1: {

			// Arrays.sort(allProducts, new NameComparator());
			Arrays.sort(allProducts, myNameComparator);
			break;
		}
		case 2: {
			// Arrays.sort(allProducts, new BrandComparator());
			// Arrays.sort(allProducts, myBrandComparator);

			// static comparator class called from product class
			Arrays.sort(allProducts, new Product.BrandComparator());
			break;
		}
		case 3: {
			// Arrays.sort(allProducts, new PriceComparator());

			// price comparator created on the fly using anonymous inner class
			Arrays.sort(allProducts, new Comparator<Product>() {

				@Override
				public int compare(Product o1, Product o2) {

					return (int) Math.round(o1.getPrice() - o2.getPrice());
//					if (o1.getPrice() == o2.getPrice())
//						return 0;
//					else if (o1.getPrice() > o2.getPrice())
//						return 1;
//					else
//						return -1;

				}

			});
			break;
		}

		case 4: {

			Arrays.sort(allProducts, new WeightComparator());

			// implementation of weight comparator on the fly using lambda expression
			// Arrays.sort(allProducts, (pr1, pr2) -> (int) (pr2.getWeight() -
			// pr2.getWeight()));

		}
		default: {

			System.out.println("the option selected was not in the list -Default sort will be used ");
		}
		}

		System.out.println("**************After Sorting by " + sortingType[input] + "*************");

		for (Product p : allProducts) {
			System.out.println(p);
		}

	}

	//public static void printProducts(Product[] products, ) {
		
	// }

}
