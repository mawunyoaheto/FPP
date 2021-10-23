package polymorphism_1;

public interface HybridFords {
	public default int batteryCapacity() {
		return 560 + mpg();
	}
	
	public static int mpg() {
		return 5 * 16;
	}

}
