package adt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayListRemoveDuplicates {

	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

		// Create a new ArrayList
		ArrayList<T> newList = new ArrayList<T>();

		for (T element : list) {

			if (!newList.contains(element)) {
				newList.add(element);
			}
		}

		return newList;
	}

	public static <T> ArrayList<T> removeDuplicatesHashMap(ArrayList<T> list) {

		// Create a new ArrayList
		ArrayList<T> newList = new ArrayList<>();
		HashMap<T, T> map = new HashMap<T, T>();

		// T next=null;

		for (T element : list) {

			if (!map.containsKey(element)) {
				newList.add(element);
				map.put(element, element);
			}
		}

		return newList;
	}

	public static <T> ArrayList<T> removeDuplicatesHashSet(ArrayList<T> list) {

		HashSet<T> dupRemoved = new HashSet<T>(list);

		ArrayList<T> newList = new ArrayList<>(dupRemoved);

		return newList;
	}
	public static void main(String[] args) {
		// Get the ArrayList with duplicate values
		// ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3,
		// 10, 3, 4, 5, 5));
		ArrayList<String> list = new ArrayList<>();
		// ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Raymond", "Alice",
		// "Jayden", "Yohannes"));

		String[] distinctVals = { "Raymond", "Alice", "Jayden", "Yohannes", "Dagi" };

		String next = null;
		for (int i = 0; i < 25000000; ++i) {
			next = distinctVals[RandomNumbers.getRandomInt(0, 4)];
			list.add(next);
		}

		// Print the Arraylist
		// System.out.println("ArrayList with duplicates: " + list);

		// Print the Arraylist
		// System.out.println("ArrayList with duplicates: " + list2);

		long begin = System.currentTimeMillis();
		// Remove duplicates
		ArrayList<String> newList = removeDuplicates(list);

		long end = System.currentTimeMillis();
		long slowTime = end - begin;
		// Print the ArrayList with duplicates removed
		System.out.println("ArrayList with duplicates removed: " + newList + " Time: " + slowTime);



		begin = System.currentTimeMillis();
		// Remove duplicates
		// ArrayList<Integer> newList2 = removeDuplicates(list);
		ArrayList<String> newList2 = removeDuplicates(list);
		end = System.currentTimeMillis();
		slowTime = end - begin;
		// Print the ArrayList with duplicates removed
		System.out.println("ArrayList with duplicates removed using HashMap: " + newList2 + " Time: " + slowTime);

		begin = System.currentTimeMillis();
		// Remove duplicates
		// ArrayList<Integer> newList3 = removeDuplicatesHashSet(list);
		ArrayList<String> newList3 = removeDuplicatesHashSet(list);
		end = System.currentTimeMillis();
		slowTime = end - begin;
		// Print the ArrayList with duplicates removed
		System.out.println("ArrayList with duplicates removed using HashSet: " + newList3 + " Time: " + slowTime);
	}

}
