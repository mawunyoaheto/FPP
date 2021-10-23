package innerclasses;

public class Outer {

	private int data = 10;
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.printVal(20);

	}

	void printVal(int bound) {

		if (data < bound) {

			// an example of a local inner class
			class Inner {
				public int getValue() {
					return data;
				}
			}

			Inner inner = new Inner();
			System.out.println("Inside Inner: " + inner.getValue());
		} else {
			System.out.println("Inside Outer: " + (data - bound));

		}
	}
}
