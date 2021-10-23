

import java.util.Arrays;
import java.util.Comparator;

public class FoodTest {
	
	class nameSorter implements Comparator<Food>{

		@Override
		public int compare(Food o1, Food o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}
	
	static class weightSorter implements Comparator<Food>{

		@Override
		public int compare(Food o1, Food o2) {
			return o1.getWeightInGrams() - o2.getWeightInGrams();
		}
	}
	
	public static void main(String[] args) {
		Food f1 = new Food();
		Food f2 = new Food(374, 894, "Double Whopper", 6);
		Food f3 = new Food(399, 994, "Double Whopper with Cheese", 7);
		Food f4 = new Food(219, 659, "Original Chicken Sandwich", 1);
		Food f5 = new Food(228, 591, "Premium Alaskan Fish Sandwich", 17);
		Food f6 = new Food(547, 1471, "Triple Whopper", 9);
		Food f7 = new Food(291, 672, "Whopper", 4.5);
		Food f8 = new Food(148, 346, "Whopper Jr.", 3);
		Food f9 = new Food(315, 759, "Whopper with Cheese", 5);
		Food f10 = new Food(156, 410, "Cheeseburger", 1.5);
		
		Food[] foods = {f1, f2, f3, f4, f5, f6, f7, f8, f9, f10};
		
		Arrays.sort(foods, new FoodTest().new nameSorter());
		//arrayPrinter(foods);
		Arrays.sort(foods, new FoodTest.weightSorter());
		//arrayPrinter(foods);
		
		class calorieSorter implements Comparator<Food>{

			@Override
			public int compare(Food o1, Food o2) {
				return o1.getCalories() - o2.getCalories();
			}
		}
		
		Arrays.sort(foods, new calorieSorter());
		//arrayPrinter(foods);
		
		Arrays.sort(foods, new Comparator<Food>() {
			@Override
			public int compare(Food o1, Food o2) {
				return (int) (o1.getPrice() - o2.getPrice());
			}
		});
		
		//arrayPrinter(foods);
		
		Arrays.sort(foods, (o1, o2) -> (o1.getCalories() - o2.getCalories()) * -1);
		arrayPrinter(foods);
		
	}
	
	static void arrayPrinter(Food[] arr) {
		for(Food f : arr) {
			System.out.println(f);
		}
	}
}
