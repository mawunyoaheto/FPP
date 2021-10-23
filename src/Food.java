

public class Food {
	private int weightInGrams;
	private int calories;
	private String name;
	private double price;
	
	public Food() {
		this.weightInGrams = 290;
		this.calories = 740;
		this.name = "Angry Whopper";
		this.price = 15;
	}
	public Food(int weightInGrams, int calories, String name, double price) {
		super();
		this.weightInGrams = weightInGrams;
		this.calories = calories;
		this.name = name;
		this.price = price;
	}
	public int getWeightInGrams() {
		return weightInGrams;
	}
	public void setWeightInGrams(int weightInGrams) {
		this.weightInGrams = weightInGrams;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "The " + name + " Weighs " + weightInGrams + " has " + calories + " Calories and is $" + price;
	}	
}
