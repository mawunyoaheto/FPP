package controlstatement;

public class MultiDimensionalArray {

	String[] studentNames = { "Benjamin", "Kyaw", "Raymond", "Dawit", "Mhadi", "Ishmael" };

	// String[][] position = new String[studentNames.length][3];
	Positions[][] position = {

			{ Positions.FIRST, Positions.SECOND, Positions.THIRD },
			{ Positions.THIRD, Positions.SECOND, Positions.FIRST },
			{ Positions.FIRST, Positions.FIRST, Positions.FIRST },
			{ Positions.SECOND, Positions.FIRST, Positions.THIRD },
			{ Positions.FIRST, Positions.SECOND, Positions.THIRD },
			{ Positions.FIRST, Positions.SECOND, Positions.THIRD }

	};

	public static void main(String[] args) {

		MultiDimensionalArray m = new MultiDimensionalArray();
		m.prinStudentPositions();

	}


	void prinStudentPositions() {

		for (int i = 0; i < studentNames.length; i++) {

			for (int j = 0; j < position[i].length; j++) {
				System.out.println(
						"Student name: " + studentNames[i] + " Quiz:" + (i + j) + " Position: " + position[i][j]);
			}
		}
	}

}
