package innerclasses;

public class MyClass2 {
	
	private MyInner inner;

	public MyInner getMyInner() {
		// inner = new MyInner(3);
		return inner;
	}
	
	public class MyInner {
		private int innerInt;
		
		public MyInner(int x) {
			innerInt=x;
		}

	}

	public static void main(String[] args) {
		MyClass2 mc = new MyClass2();
		MyInner mi = mc.getMyInner();
		System.out.println(mi.innerInt);
	}
	
}
