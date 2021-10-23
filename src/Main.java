
public class Main {

	public static void main(String[] args) {

//		String[] arr = { "Raymond", "Alex", "Alice", "Michael", "Dagi" };
//
//		RecursiveSearch2 r = new RecursiveSearch2(arr);

		double x = Math.sqrt(50);
		double y = x;

		if (x == y)
			System.out.println("x equals y");

		String s = "a friendly face";

		StringBuilder word1, word2;


//		word1 = new StringBuilder("Lisa");
//		word2.append(word1);
//		// word2 = word1;
//
//		word2.insert(0, "Mona");
//
//		String x = "David";
//		
//		String y = "X";
//		String q = "X";

		// System.out.println(b);
//		System.out.println(x.indexOf("id"));
		// System.out.println(y.equals(q));
//		System.out.println(s.charAt(2));
//		System.out.println(s.length());
//		System.out.println(s.substring(2, 9));
//		System.out.println(x.substring(1, 3));

//		int k = 0;
//		int i = 11;
//		for (; i > 10; --i) {
//
//			int z = 10023456;
//			float l = z;
//			System.out.println(l);
//		}

//		Student s1 = new Main().new Student();
//		Student s2 = new Main().new Student();
//
//		System.out.println(s1 + "\n" + s2 + "\n" + s1.compareTo(s2));
//		System.out.println("\n" + s1 + "\n" + s2 + "\n" + s1.equals(s2));
	}

	class Student implements Comparable<Student> {

		private int id;
		private String name;
		private double gpa;

		public Student() {
			super();

			this.id = 000;
			this.name = "defaut";
			this.gpa = 4.0;
		}

		public Student(int id, String name, int grade) {
			super();
			this.id = id;
			this.name = name;
			this.gpa = grade;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getGpa() {
			return gpa;
		}

		public void setGpa(double grade) {
			this.gpa = grade;
		}

		@Override
		public String toString() {

			return "Id: " + getId() + " name: " + getName() + " GPA: " + getGpa();
		}

		@Override
		public int compareTo(Main.Student o) {
			if (o == null)
				return -1;

			return this.getName().compareTo(o.getName());
		}

		@Override
		public boolean equals(Object obj) {

			if (obj == null)
				return false;
			if (!(obj instanceof Student))
				return false;

			Student s = (Student) obj;

			return s.getName().equals(getName());
		}

	}


}
