package cloning_1.deep;


public class CallingClass {
	String myName;


	public static MyClass tryToClone(MyClass cl) {

		try {
			return (MyClass) cl.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// CallingClass cc = new CallingClass();

		MyAddress ad = new MyAddress("Iowa", 52557);
		MyClass o = new MyClass("Sheilla", ad);

		// clone created here
		MyClass cl = CallingClass.tryToClone(o);

		// MyClass cl = (MyClass) o.clone();


		System.out.println("original: " + o);
		System.out.println("clone: " + cl + "\n");

		System.out.println("Change clone state to Washington");
		cl.getAddress().setState("Washington");

		System.out.println("original: " + o);
		System.out.println("clone: " + cl + "\n");

		System.out.println("Change original state to Maryland  ");
		o.getAddress().setState("Maryland");
		System.out.println("original: " + o);
		System.out.println("clone: " + cl);
	}

}
