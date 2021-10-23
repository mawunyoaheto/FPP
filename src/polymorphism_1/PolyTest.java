package polymorphism_1;

public class PolyTest {

	public static void main(String[] args) {
		
		Escape e1 = new Escape(1,1,1);
		e1.setTireSize(1500);
		Escape e2 = new Escape();
		Escape e3 = new Escape();
		
		Fusion f1 = new Fusion("F250", 2020);

		Fusion f2 = new Fusion("F250", 2020);
		Fusion f3 = new Fusion();
		
		Explorer x1 = new Explorer();
		Explorer x2 = new Explorer();
		Explorer x3 = new Explorer();
		
		Ford[] fords = {e1, e2, e3,
				f1, f2, f3,
				x1, x2, x3
		};
		
		System.out.println(f1.equals(f2));

		HybridFords[] hf = {e1, e2, e3, f1, f2, f3};
		
		for(HybridFords h : hf) {
			System.out.println(h.batteryCapacity());
		}
		
		for(Ford f : fords) {
			System.out.println(f.getYear());
		}
	}
}
