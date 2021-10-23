package tutorials;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("Raymond", 3.7);
		Student s2 = new Student("James", 3.4);
		Student s3 = new Student("Raymond", 3.7);
		Student s4 = new Student("Ben", 3.8);
		Student s5 = new Student("Sarah", 3.2);

		Student s6 = s1;

		Student[] stArray = { s1, s2, s3, s4, s5 };

		System.out.println(
				"Is " + s1 + " the same as " + s3 + "? :" + s1.equals(s3));
	}

}
