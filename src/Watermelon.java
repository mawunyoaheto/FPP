
public class Watermelon {

	private int numberOfSeed;

	private String color;

	public Watermelon() {
		super();

		System.out.println("I am inside the empty Watermelon constructor");
	}

	public Watermelon(int numberOfSeed, String color) {
		super();
		this.numberOfSeed = numberOfSeed;
		this.color = color;
	}

	public int getNumberOfSeed() {
		return numberOfSeed;
	}

	public void setNumberOfSeed(int numberOfSeed) {
		this.numberOfSeed = numberOfSeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void myMethod(int thisParam) {

		int numberOfSeeds = thisParam;

		System.out.println(numberOfSeeds);
	}

}
