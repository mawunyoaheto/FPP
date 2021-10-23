package polymorphism_1;

public class Fusion extends Ford implements HybridFords{
	
	public Fusion() {
		super(4,6 ,7);
		super.setModelName("Fusion");
	}

	public Fusion(String modelNumber, int modelYear) {
		super(4, 6, 7);

		super.setModelName("Fusion");
		super.setModelNumber(modelNumber);
		super.setModelYear(modelYear);

	}

	@Override
	public int CalculateSpeed() {

		return getTireSize() * 9;
	}

	@Override
	public boolean equals(Object aFusion) {
		if(aFusion==null)
			return false;
		if (aFusion.getClass() != this.getClass())
			return false;
		
		Fusion fusion = (Fusion)aFusion;
		
		boolean isEqual = fusion.getModelName().equals(getModelName()) && fusion.getModelNumber() == getModelNumber();

		return isEqual;
		
	}
}
