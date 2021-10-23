package animalinterface;

public interface Mammal extends Animal {

	public default void breastFeed() {
		System.out.println("Mamals breastfeed their babies");

	}

	abstract int getNumberOfMammaryGland(int nOfMGlans);

}
