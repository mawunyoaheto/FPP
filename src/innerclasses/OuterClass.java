package innerclasses;

public class OuterClass {
	private static String s = "hello";

	class MidInner {
		private static String name = "Ishmael";

		static class MidBottom {
			private static String b = "at the bottom";

			static String printInfo() {
				return b.concat(s);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// OuterClass o = new OuterClass();
		// OuterClass.MidInner m = new OuterClass.MidInner();
		OuterClass.MidInner.MidBottom b = new OuterClass.MidInner.MidBottom();

		System.out.println(MidInner.MidBottom.printInfo());

	}

}
