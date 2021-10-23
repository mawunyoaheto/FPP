package quiz3_practice;

public class Motorcycle extends Vehicle {

	private float engineSize;

	public Motorcycle() {
		super(2, "harley", 78.6);
		this.engineSize = 1.5f;
	}

	public Motorcycle(int numberOfWheels, String model, double topSpeed, float engineSize) {
		super(numberOfWheels, model, topSpeed);
		this.engineSize = engineSize;
	}

	public float getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(float engineSize) {
		this.engineSize = engineSize;
	}

//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}

}
