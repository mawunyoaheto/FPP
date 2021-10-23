package innerclasses;

public class MyClass {
	private String s = "hello";
	MyInnerClass inner;

	public static void main(String[] args) {
		new MyClass();
	}

	MyClass() {
		// System.out.println(inner.anInt);// NullPointerException
		inner = new MyInnerClass();
		System.out.println(inner.anInt); // OK
	}

	class MyInnerClass {
		private int anInt = 3;

		void innerMethod() {
			System.out.println(s);
		}
	}
}
