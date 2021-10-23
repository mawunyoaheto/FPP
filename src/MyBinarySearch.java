
public class MyBinarySearch {

	public static boolean search(int[] arr, int x) {
		if (arr == null || arr.length == 0)
			return false;
		return recursiveBinarySearch(arr, x, 0, arr.length - 1);
	}

	public static boolean recursiveBinarySearch(int[] arr, int x, int lower, int upper) {
		if (arr == null)
			return false;

		if (lower > upper)
			return false;

		int mid = (upper + lower) / 2;

		if (x == arr[mid])
			return true;

		if (x < arr[mid])
			return recursiveBinarySearch(arr, x, lower, mid - 1);

		else
			return recursiveBinarySearch(arr, x, mid + 1, upper);
	}

	public static void main(String[] args) {
		int[] test1 = { 1, 2, 3 };
		System.out.println(search(test1, 1));
		System.out.println(search(test1, 4));

	}

}
