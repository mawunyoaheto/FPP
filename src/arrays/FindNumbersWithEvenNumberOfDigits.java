package arrays;

public class FindNumbersWithEvenNumberOfDigits {

	public int findNumbers(int[] nums) {

		int evenCount = 0;
		for (int i = 0; i < nums.length; i++) {
			int digitCount = FindNumbersWithEvenNumberOfDigits.countDigit(nums[i]);

			if (digitCount % 2 == 0)
				evenCount++;

		}
		return evenCount;
	}
	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };
		int[] nums1 = { 555, 901, 482, 1771 };

		FindNumbersWithEvenNumberOfDigits f = new FindNumbersWithEvenNumberOfDigits();
		System.out.println(f.findNumbers(nums));
		System.out.println(f.findNumbers(nums1));

	}

	static int countDigit(long n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			++count;
		}
		return count;
	}
}
