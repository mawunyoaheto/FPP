package inheritance.test;

public class Driver extends Person {
	private int numberOfCars;

	public Driver() {
		super("unknown driver", 35, "male");

		this.numberOfCars = 1;
	}

	public Driver(String name, int age, String gender, int numberOfCars) {
		super(name, age, gender);
		this.numberOfCars = numberOfCars;

	}

	public int getNumberOfCars() {
		return numberOfCars;
	}

	public void setNumberOfCars(int numberOfCars) {
		this.numberOfCars = numberOfCars;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Driver))
			return false;

		Driver d = (Driver) obj;

		return this.numberOfCars == d.getNumberOfCars();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " no. of cars: " + getNumberOfCars();
	}

}
