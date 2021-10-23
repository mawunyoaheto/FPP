package leetcode;

public class PalindromeInteger {
	static int count = 0;
	static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 1001;

		// PalindromeInteger p = new PalindromeInteger();
		System.out.println("is " + m + " Palindrome? " + PalindromeInteger.isPalindrome(m));

	}

	public static boolean isPalindrome(int n) {

		int[] test = getDigits(n);

		int j = test.length - 1;
		int i = 0;
		while (i < j) {
			if (test[i] != test[j])
				return false;
			else {
				i++;
				j--;
			}
		}

		return true;
	}

	private static int[] getDigits(int n) {
		int len = String.valueOf(n).length();
		arr = new int[len];
		int count = 0;
		while (n > 0) {
			arr[count++] = n % 10;
			n = n / 10;

		}

		return arr;
	}
}

