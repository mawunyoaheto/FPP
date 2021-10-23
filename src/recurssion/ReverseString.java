package recurssion;

public class ReverseString {

	static int length = 0;

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {


		System.out.println(ReverseString.reverseString("naciremA"));
	}

	static String reverseString(String s) {

		if (s.length() <= 0)
			return sb.toString();

		sb.append(s.charAt(s.length() - 1));
		return reverseString(s.substring(0, s.length() - 1));

		// return reverseString(s.substring(1) +s.charAt(0));

	}

	static String reverse(String s, int i) {

		if (s.length() == 1)
			return s;

		String saved = reverse(s.substring(1), i + 1);

		System.out.println("Iteration: " + i + " s= " + s + " reversed string so far: " + saved + " to be added to: "
				+ s.charAt(0));

		return saved + s.charAt(0);
	}

	static int pow(int x) {
		if (x == 1)
			return x;
		int result = pow(x - 1);
		return result;
	}

}
