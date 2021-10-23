
class MyClass {
	public static void main(String[] args) {
		MyClass cl = new MySubClass();
		System.out.println(cl.compute());
	}

	private int value = 3;

	public final int compute() {
		return value;
	}

	public int getValue() {
		return value;
	}
}

class MySubClass extends MyClass {
	MySubClass() {
	}

	// MyClass m = new MyClass();

//	public int compute() {
//
//		return 4;
//	}


	}