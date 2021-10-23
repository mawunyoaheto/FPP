package innerclasses;

public class Number {

	public static final Number ONE = newOne();
	public static final Number TWO = newTwo();

	private class One extends Number {

		@Override
		public String toString() {
			return "one";
		}
	}

	private Number() {

	}

	private class Two extends Number {

		@Override
		public String toString() {
			return "two";
		}
	}

	private static Number newOne() {

		return (new Number()).new One();
	}

	private static Number newTwo() {

		return (new Number()).new Two();
	}

	public static void main(String[] args) {
		System.out.println(Number.ONE);
		System.out.println(Number.TWO);
	}
}
