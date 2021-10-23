package leetcode;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number to check if it is a Palindrome");
		int input = sc.nextInt();
		sc.close();
		if (isPalindrome(input))
			System.out.println("Yes " + input + " is a Palindrome");
		else {
			System.out.println("No " + input + " is not a Palindrome");
		}
	}

	public static boolean isPalindrome(int n) {

		int revNumber = reverseNumber(n);
		System.out.println(revNumber);
		if (n == revNumber)
			return true;
		else
			return false;
	}

	public static int reverseNumber(int n) {
		int reverse = 0;

		while (n > 0) {

			reverse = reverse * 10 + n % 10;

			n = n / 10;
		}
		// System.out.println(reverse);
		return reverse;
	}

	public static int reverseOddNumber(int n) {
		int reverse = 0;


		while (n > 0) {

			int lastDigit = n % 10;
			if (lastDigit % 2 != 0)
				reverse = reverse * 10 + n % 10;
			n = n / 10;
		}
		// System.out.println(reverse);
		return reverse;
	}

}
