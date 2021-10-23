package mpp_test.prob1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import adt.RandomNumbers;
import mpp_test.prob1.extras.Perm;

public class Twice {
	private LinkedList<String> returnList = new LinkedList<>();
	private HashMap<String, Integer> returnMap = new HashMap<>();

	// recursively stores in returnList all elements of the
	// input list that occur at least two times in the input list
	public LinkedList<String> occursAtLeastTwice(LinkedList<String> list) {
		// implement

		if (list.isEmpty())
			return returnList;

		if (!returnMap.containsKey(list.getFirst())) {

			returnMap.put(list.getFirst(), 1);
			list.removeFirst();
		} else {

			if (!returnList.contains(list.getFirst())) {
				returnList.add(list.getFirst());
				list.removeFirst();
			}
		}

		return occursAtLeastTwice(list);
	}

	/////////////////////// for testing your code////////////////////

	public static void main(String[] args) {
		testOccursOnce();
		testOccursTwice();
		testOccursMoreThanTwice();
		for (int i = 0; i < 10; ++i) {
			testRandomOccurrence();
		}
	}

	public static void testOccursOnce() {
		Twice ti = new Twice();
		LinkedList<String> list = new LinkedList<String>() {
			{
				add("a");
				add("b");
				add("b");
			}
		};
		System.out.println("Expected output: [b]");
		System.out.println("Output: " + ti.occursAtLeastTwice(list));
	}

	public static void testOccursTwice() {
		Twice ti = new Twice();
		LinkedList<String> list = new LinkedList<String>() {
			{
				add("a");
				add("b");
				add("a");
				add("b");
			}
		};
		System.out.println("Expected output: [a,b] (or [b,a])");
		System.out.println("Output: " + ti.occursAtLeastTwice(list));
	}

	public static void testOccursMoreThanTwice() {
		Twice ti = new Twice();
		LinkedList<String> list = new LinkedList<String>() {
			{
				add("a");
				add("b");
				add("a");
				add("b");
				add("a");
			}
		};
		System.out.println("Expected output: [a,b] (or [b,a])");
		System.out.println("Output: " + ti.occursAtLeastTwice(list));
	}

	public static void testRandomOccurrence() {
		Twice ti = new Twice();
		int numElements = RandomNumbers.getRandomInt(4, 9);
		LinkedList<String> list = new LinkedList<>();
		String[] arr = { "a", "b", "c" };
		for (int i = 0; i < numElements; ++i) {
			int index = RandomNumbers.getRandomInt(0, 2);
			list.add(arr[index]);
		}
		String correct = computeAsString(list);
		System.out.println("\n\nStarting List: " + list);
		System.out.println("Expected output: Any of the following is correct: " + correct);
		List<String> result = ti.occursAtLeastTwice(list);
		System.out.println("Output: " + result);
		Set<String> studentSolution = new HashSet<>();
		studentSolution.addAll(result);
		Set<String> correctSolution = new HashSet<>();
		correctSolution.addAll(computeSolution(list));

	}

	public static List<String> computeSolution(LinkedList<String> list) {
		HashMap<String, Integer> map = new HashMap<>();
		LinkedList<String> basicReturn = new LinkedList<>();
		for (String s : list) {
			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				int val = map.get(s);
				val++;
				map.put(s, val);

			}

		}
		Set<String> keys = map.keySet();
		for (String key : keys) {
			if (map.get(key) > 1) {
				basicReturn.add(key);
			}
		}
		return basicReturn;
	}

	public static String computeAsString(LinkedList<String> list) {
		HashMap<String, Integer> map = new HashMap<>();
		LinkedList<String> basicReturn = new LinkedList<>();
		for (String s : list) {
			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				int val = map.get(s);
				val++;
				map.put(s, val);

			}

		}
		Set<String> keys = map.keySet();
		for (String key : keys) {
			if (map.get(key) > 1) {
				basicReturn.add(key);
			}
		}
		return computePerms(basicReturn);
	}

	private static String computePerms(LinkedList<String> list) {
		if (list == null || list.size() == 0) {
			return "";
		}
		int size = list.size();
		int[] nums = new int[size];
		for (int i = 0; i < size; ++i) {
			nums[i] = i;
		}
		List<int[]> perms = Perm.allPerms(nums);
		StringBuilder sb = new StringBuilder();
		for (int[] perm : perms) {
			sb.append("[");
			for (int i = 0; i < perm.length; ++i) {
				sb.append(list.get(perm[i]));
			}
			sb.append("] ");
		}
		String ret = sb.toString();
		ret = ret.substring(0, ret.length() - 1);
		return ret;
	}
}
