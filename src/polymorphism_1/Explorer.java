package polymorphism_1;

public class Explorer extends Ford{
	
	public Explorer() {
		super(443, 652, 6);
	}

	@Override
	public int CalculateSpeed() {
		
		return getTireSize() * 4;
	}
}
