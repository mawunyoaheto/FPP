package adt;

import java.util.Arrays;

public class MyMinSort {

	String[] arr;

	char[] charStr;
	String str;
	StringBuilder sb;


	String[] sort(String[] arr) {

		this.arr = arr;

		if (arr.length == 0 || arr == null)
			return arr;

		for (int i = 0; i < arr.length; i++) {

			// find position of min value from arr[i] to arr[len-1]
			int netxMinPos = minPos(i, arr.length - 1);

			swap(i, netxMinPos);
		}

		return arr;
	}

	String[] sort(String str) {

		sb = new StringBuilder();

		this.str = str;

		if (str.length() == 0 || str == null)
			return arr;

		charStr = str.toCharArray();
		// arr=charStr.toString();
		for (int i = 0; i < charStr.length; i++) {

			// find position of min value from arr[i] to arr[len-1]
			int netxMinPos = minPos(i, arr.length - 1);

			swap(i, netxMinPos);
		}

		return arr;
	}

	void swap(int i, int j) {

		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	int minPos(int i, int j) {

		int pos = i;
		String min = arr[i];

		for (int k = i + 1; k < arr.length; k++) {

			if (arr[k].compareTo(arr[i]) < 0) {
				pos = k;
				min = arr[k];
			}
		}

		return pos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "Raymond", "Albert", "Andy", "Sarah" };

		MyMinSort myMinSort = new MyMinSort();
		System.out.println(Arrays.toString(myMinSort.sort(names)));

	}

}
