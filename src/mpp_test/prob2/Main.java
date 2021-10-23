package mpp_test.prob2;

public class Main {

	/*
	 * Expected output:
	 *    B A C B A 
	      B
	      A C B A 
	      C A C B A 
	      C A C B A 
	 */
	public static void main(String[] args) {
		MyStringStack mss = new MyStringStack();
		mss.push("A");
		mss.push("B");
		mss.push("C");
		mss.push("A");
		mss.push("B");
		System.out.println(mss);
		System.out.println(mss.pop());
		System.out.println(mss);
		mss.push("C");
		System.out.println(mss);

	}

}
