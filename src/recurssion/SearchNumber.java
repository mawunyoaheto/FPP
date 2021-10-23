package recurssion;

import java.util.Arrays;

public class SearchNumber {

	public SearchNumber() {
		count = 0;
	}

	static int count = 0;
	public static void main(String[] args) {

		int[] ints = { 6, 3, 5, 4, 8, 2, 7, 1, 9 };
		String[] myArr = { "Alice", "Jayden", "Jayda", "Rosemond" };
//		System.out.println(search(ints, 10));
//		System.out.println(search1(ints, 2));

		//System.out.println(search("mango", 'e'));
		// System.out.println(search(myArr, "Rosemond"));
		// System.out.println(getFactorial(8));
		// System.out.println(pow(2.0000, 10));
		// System.out.println(recursiveSum(3));
		// System.out.println(reverseString("America"));
		System.out.println(reverseArray(myArr));

	}

	static boolean search(int[] arr, int num) {


		if (arr.length == 1)
			return arr[0] == num;

		int[] arr2 = Arrays.copyOf(arr, arr.length - 1);

		return search(arr2, num) ? true : arr[arr.length - 1] == num;
	}

	static boolean search1(int[] arr, int num) {

		if (count > arr.length - 1)
			return false;
		return (arr[count++] == num) ? true : search(arr, num);


	}

	static boolean search(String s, char c) {

		if (s.length() == 1)
			return s.charAt(0) == c;

		String newString = s.substring(0, s.length() - 1);

		return search(newString, c) ? true : s.charAt(s.length() - 1) == c;

	}

	static boolean search(String[] arr, String s) {

		System.out.println("Method " + Arrays.toString(arr));

		if (arr.length == 1) {

			return arr[0].equals(s);
		}
		String[] arr2 = Arrays.copyOf(arr, arr.length - 1);

		return search(arr2, s) ? true : arr[arr.length - 1].equals(s);
	}

	static int getFactorial(int num) {

		if (num == 1)
			return 1;
		return num * getFactorial(num - 1);

	}

	static boolean powerOfThree(int n) {

		return false;
	}

	static double pow(double x, int n) {

		if (n == 1)
			return 1;
		else {

			double result = x * pow(x, n - 1);

			return result;
		}
	}

	static int recursiveSum(int n) {

		if (n == 0)
			return 0;
		return n + recursiveSum(n - 1);
	}

	static String reverseString(String s) {
		if (s.length() == 1)
			return s.substring(0);

		return s.substring(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
	}

	static String reverseArray(String[] s) {
		if (s.length == 1)
			return s[0];

		String output = s[s.length - 1];
		return output + ", " + reverseArray(Arrays.copyOf(s, s.length - 1));
	}

	static String[] reverseArraySmart(String[] s) {

		return reverse(s, 0, s.length - 1);
	}

	static String[] reverse(String[] s, int i, int j) {
		
		if(i<j) {
			String temp=s[i];
			s[i]=s[j];
			s[j]=temp;	
		}
		return reverse(s, i++, j--);
}
}