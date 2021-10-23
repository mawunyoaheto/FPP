package innerclasses.quiz4;

import java.util.Arrays;
import java.util.Comparator;

public class FoodTest {

	public static void main(String[] args) {

		Food f1 = new Food();
		Food f2 = new Food(374, 894, "Double Whopper", 6);
		Food f3 = new Food(399, 994, "Double Whoper with cheese", 7);
		Food f4 = new Food(219, 659, "Original Chicken Sandwich", 1);
		Food f5 = new Food(228, 591, "Premium Alaskan Fish Sandwich", 17);
		Food f6 = new Food(547, 1472, "Tripple Whopper", 9);
		Food f7 = new Food(291, 672, "Whopper", 4.5);
		Food f8 = new Food(148, 346, "Whopper Jr", 3);
		Food f9 = new Food(315, 759, "Whopper with Cheese", 5);
		Food f10 = new Food(156, 410, "Cheeseburger", 1.5);

		Food[] food = { f1, f2, f3, f4, f5, f6, f7, f8, f9, f10 };

		FoodTest f = new FoodTest();
		FoodTest.SortByName sortName = f.new SortByName();

		System.out.println("**************Sorting by Name***************");

		Arrays.sort(food, sortName);

		arrayPrinter(food);

		System.out.println("\n**************Sorting by Price***************");

		FoodTest.SortByPrice sortPrice = new FoodTest.SortByPrice();
		Arrays.sort(food, sortPrice);
		arrayPrinter(food);

		System.out.println("\n**************Sorting by Weight***************");

		f.sortByWeight(food);
		arrayPrinter(food);

		System.out.println("\n**************Sorting by Calories***************");

		f.sortByCalaories(food);
		arrayPrinter(food);
	}

	class SortByName implements Comparator<Food> {


		@Override
		public int compare(Food o1, Food o2) {

			return o1.getName().compareTo(o2.getName());
		}

	}

	static class SortByPrice implements Comparator<Food> {

			@Override
			public int compare(Food o1, Food o2) {

				double p = o1.getPrice() - o2.getPrice();

				if (p == 0)
					return 0;
				else if (p > 0)
					return 1;
				else
					return -1;
			}

		}

		public void sortByWeight(Food[] arr) {

			class SortByWeight implements Comparator<Food> {
				@Override
				public int compare(Food f1, Food f2) {
					return f1.getWeight() - f2.getWeight();
				}
			}

			Arrays.sort(arr, new SortByWeight());
		}

	public void sortByCalaories(Food[] arr) {
		Arrays.sort(arr, new Comparator<Food>() {

			public int compare(Food f1, Food f2) {
				return f1.getCalories() - f2.getCalories();
			}

		});
	};

	public void lambdaSortByPriceDescending(Food[] f) {
		Arrays.sort(f, (f1, f2) -> (f1.getWeight() - f2.getWeight()) * -1);
	}

	static void arrayPrinter(Food[] arr) {

		for (Food f : arr) {
			System.out.println(f);
		}
	}
}
