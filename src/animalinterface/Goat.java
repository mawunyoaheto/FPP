package animalinterface;

public class Goat implements Animal, Mammal {

	private int mammaryGlands;

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sound() {
		System.out.println("Meerrrr Meerrrr Meerrr");

	}

	@Override
	public int getNumberOfMammaryGland(int nOfMGlans) {
		// TODO Auto-generated method stub
		return 0;
	}

}
