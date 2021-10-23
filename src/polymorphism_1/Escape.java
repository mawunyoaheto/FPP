package polymorphism_1;

public class Escape extends Ford implements HybridFords{
	
	
	public Escape() {
		super(18, 17, 65);
	}
	
	
	public Escape(int wheels, int seats, int tireSize) {
			super(wheels, seats, tireSize);
	}


	@Override
	public String fordInfo() {
		
		return super.fordInfo() + " I'm an Escape";
	}


	@Override
	public int CalculateSpeed() {
		
		return getTireSize() * 2;
	}


	@Override
	public int batteryCapacity() {
		return HybridFords.super.batteryCapacity() + 40;
	}

}
