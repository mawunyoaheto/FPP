
public class MultiDimensionalArray {

	String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

	String[][] students = new String[days.length][3];

	public static void main(String[] args) {

		MultiDimensionalArray m = new MultiDimensionalArray();
		m.printAttendance();

	}

	void populateStudents() {

		students[0][0] = "James";
		students[0][1] = "Michael";
		students[0][2] = "James";
		students[1][0] = "Sarah";
		students[1][1] = "Michael";
		students[1][2] = "James";
		students[2][0] = "Jayden";
		students[2][1] = "Ewoenam";
		students[2][2] = "James";
		students[3][0] = "Sarah";
		students[3][1] = "Gidel";
		students[3][2] = "Micah";
		students[4][0] = "Ewoenam";
		students[4][1] = "James";
		students[4][2] = "Micah";
		students[5][0] = "Ewoenam";
		students[5][1] = "Sarah";
		students[5][2] = "James";
		students[6][0] = "Michael";
		students[6][1] = "Sarah";
		students[6][2] = "Gidel";
	}

	void printAttendance() {

		populateStudents();

		for (int i = 0; i < days.length; i++) {

			for (int j = 0; j < students[i].length; j++) {

				System.out.println(days[i] + ":" + students[i][j]);
			}
		}

	}

}
