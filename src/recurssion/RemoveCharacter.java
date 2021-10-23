package recurssion;

public class RemoveCharacter {
	static int count2 = 0;
	static int count1 = 0;
	public static void main(String[] args) {
		String myString = "There are three bees on the pine tree!";

		System.out.println(remove_e(myString));
		System.out.println(remove_e(myString, 'e'));

	}

	public static String remove_e(String s) {
		String temp = "";

		// base case here...
		if (s == null || count1 > s.length() - 1)
			return s;

		if (s.charAt(count1) == 'e' && s.charAt(count1 + 1) == 'e') {
			temp = s;
			s = s.substring(0, count1);
			s += temp.substring(count1 + 2, temp.length());
		} else if (s.charAt(count1) == 'e') {
			temp = s;
			s = s.substring(0, count1);
			s += temp.substring(count1 + 1, temp.length());
		}

		count1++;
		// method calls itself here...
		return remove_e(s);

	}

	public static String remove_e(String s, char c) {
		String temp = "";

		// base case here...
		if (s == null || count2 > s.length() - 1)
			return s;

		if (s.charAt(count2) == c && s.charAt(count2 + 1) == c) {
			temp = s;
			s = s.substring(0, count2);
			s += temp.substring(count2 + 2, temp.length());
		} else if (s.charAt(count2) == c) {
			temp = s;
			s = s.substring(0, count2);
			s += temp.substring(count2 + 1, temp.length());
		}

		count2++;
		// method calls itself here...
		return remove_e(s, c);

	}

}
