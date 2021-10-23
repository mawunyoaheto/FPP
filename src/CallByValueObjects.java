import java.time.LocalDate;

public class CallByValueObjects {

	MyEmployee e1 = new MyEmployee("Raymond", "Aheto", 1500.00, LocalDate.of(2020, 06, 04));
	MyEmployee e2 = new MyEmployee("Alice", "Aheto", 1700.00, LocalDate.of(2021, 11, 04));

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallByValueObjects c = new CallByValueObjects();


//
		c.swap(c.e1, c.e2);

		System.out.println(c.e1);
		System.out.println(c.e2);

		c.change1(c.e1, c.e2);

		System.out.println(".....1...");
		System.out.println(c.e1);
		System.out.println(c.e2);

//		c.change2(c.e1, c.e2);
//
//		System.out.println("\n.....2...");
//		System.out.println(c.e1);
//		System.out.println(c.e2);
//
//		c.change3(c.e1, c.e2);
//
//		System.out.println("\n.....3...");
//		System.out.println(c.e1);
//		System.out.println(c.e2);
	}

	public void swap(MyEmployee x, MyEmployee y) {

		MyEmployee temp = x;

		x = y;
		System.out.println("x is now:" + x);
		y = temp;
		System.out.println("y is now:" + y);
	}


	public void change1(MyEmployee x, MyEmployee y) {
		double s = y.getSalary();

		y.setSalary(x.getSalary());
		x.setSalary(s);
	}

	public void change2(MyEmployee x, MyEmployee y) {

		y = x;
	}

	public void change3(MyEmployee x, MyEmployee y) {
		e1 = y;
		e2 = x;
		// e2 = e1;

	}
}
