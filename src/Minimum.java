import java.util.Scanner;

public class Minimum {

	public static int returnMinIndex(int[] arr) {
		if (arr.length == 0 || arr == null)
			return 0;
		int min = 0;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < arr[min])
				min = i;
		}

		return min;
	}

	public static int returnMinValue(int[] arr) {

		if (arr.length == 0 || arr == null)
			return 0;
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min)
				min = arr[i];
		}

		return min;
	}

	public static void main(String[] args) {

//		int[] numbers = { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22 };
//
//		System.out.println("Min value: " + Minimum.returnMinValue(numbers));
//		System.out.println("Min Position: " + Minimum.returnMinIndex(numbers));

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a positive number: ");
			int value = sc.nextInt();
			if (value <= 0) {
				break;
			}
		}
		System.out.println("The value you enter must be positive.");


}
}
