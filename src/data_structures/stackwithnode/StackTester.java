package data_structures.stackwithnode;

public class StackTester {

	public static void main(String[] args) {

		StackWithNode s = new StackWithNode();

		s.push("WAP");
		s.push("MPP");
		s.push("FPP");

		System.out.println(s);

		s.pop();
		
		System.out.println(s.peak());


		System.out.println(s);
	}

}
