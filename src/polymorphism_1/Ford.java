package polymorphism_1;

public abstract class Ford implements FordSub, Ford2020{
	private int wheels;
	private int seats;
	private int tireSize;
	private String modelName;
	private int modelYear;
	private String modelNumber;
	
	//new Ford();
	public Ford() {
		this.wheels = 4;
		this.seats = 5;
		this.tireSize = 14;
	}
	//new Ford(4, 3, 16);
	public Ford(int wheels, int seats, int tireSize) {
		this.wheels = wheels;
		this.seats = seats;
		this.tireSize = tireSize;
	}
	
	
	public int getWheels() {
		return wheels;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getTireSize() {
		return tireSize;
	}
	public void setTireSize(int tireSize) {
		this.tireSize = tireSize;
	}
	
	public String fordInfo() {
		return "Wheels = " + wheels + " Seats = " + seats + "Tire Size = " + tireSize;
	}
	
	public abstract int CalculateSpeed();

}
