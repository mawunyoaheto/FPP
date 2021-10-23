package innerclasses.quiz4;

public class Food implements Comparable<Food> {

	private int weight;
	private int calories;
	private String name;
	private double price;

	public Food() {
		super();

		this.weight=151;
		this.calories=290;
		this.name = "Angry whopper";
		this.price = 2.5;

	}

	public Food(int weight, int calories, String name, double price) {
		super();
		this.weight = weight;
		this.calories = calories;
		this.name = name;
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
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

		return "The " + getName() + " weighs " + getWeight() + " has " + getCalories() + " calories" + " and is $"
				+ getPrice();
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof Food))
			return false;
		Food f = (Food) o;

		return this.getName().equals(f.getName()) && this.getPrice() == f.getPrice();
	}

	@Override
	public int compareTo(Food o) {
		if (o == null)
			return -1;
		int n = this.getName().compareTo(o.getName());
		if (n == 0)
			return (int) (this.getPrice() - o.getPrice());
		else
			return -1;
	}
}
