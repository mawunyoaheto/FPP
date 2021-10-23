package polymorphism;

public class TestPolymorhism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SuperClass subClass = new SubClass();

		SubSuperAbstract[] obj = { new SubClass(), new SuperClass() };

		for (SubSuperAbstract s : obj) {
			System.out.println(s.method3());
		}

	}

}
