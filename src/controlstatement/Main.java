package controlstatement;

public class Main {

	public static void main(String[] args) {

		// enum Positions1{FIRST, SECOND, THIRD}

		Positions value = Positions.FIRST;

		switch (value) {

		case FIRST: {
			System.out.println(value);
			break;
		}
		case SECOND: {
			System.out.println(value);
			break;
		}
		case THIRD: {
			System.out.println(value);
			break;
		}
		}

	}

}
