package mpp_test.prob1.extras;

import java.util.ArrayList;
import java.util.List;

/**
 * This version of the class focuses on representing
 * permutations in terms of integer arrays
 *
 */
public class Perm {
	
	public static List<int[]> allPerms(int[] sortedArr) {
		ArrayList<int[]> l = new ArrayList<int[]>();
		if(sortedArr == null || sortedArr.length == 0) return l;
		
		ArrayList<Integer> inputAsList = new ArrayList<Integer>();
		for(int i = 0; i < sortedArr.length; ++i) {
			inputAsList.add(sortedArr[i]);
		}
		//System.out.println(inputAsList);
		List<ArrayList<Integer>> retList = allPerms(inputAsList);
		for(ArrayList<Integer> al : retList){
			int[] ar = makeArray(al);
			l.add(ar);
		}
		return l;
		
	}
	private static int[] makeArray(ArrayList<Integer> al) {
		int[] retVal = new int[al.size()];
		for(int i = 0; i < retVal.length; ++i) {
			retVal[i] = al.get(i).intValue();
		}
		return retVal;
	}
	
	//assume input is sorted -- otherwise do this step as a preliminary
	public static List<ArrayList<Integer>> allPerms(ArrayList<Integer> sortedInput){
		List<ArrayList<Integer>> retVal = new ArrayList<ArrayList<Integer>>();
		int sortedSize = sortedInput.size();
		if(sortedSize==1){
			retVal.add(sortedInput);
		}
		else {
			for(int i = 0; i < sortedSize; ++i){
				ArrayList<Integer> sortedRemoveIth = removeIth(sortedInput,i);
				
				//get all ordered permutations for (sortedInput-{ith element})
				List<ArrayList<Integer>> temp = allPerms(sortedRemoveIth);
				
				//put the ith element back in by placing it at the beginning
				//of each of the new permutations
				for(ArrayList<Integer> l : temp){
					//place the ith Integer at beginning
					l.add(0,sortedInput.get(i));
				}
				//now add this new batch of permutations to the main list
				retVal.addAll(temp);			
			}
		}
		return retVal;
	}

	
	static ArrayList<Integer> removeIth(ArrayList<Integer> list,int i){
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.addAll(list);
		aList.remove(i);
		return aList;
		
		
	}
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(4);
//		int[] arr = makeArray(list);
//		System.out.println(list);
//		System.out.println(Arrays.toString(arr));
//		
//		int[] test = {1,2};
		System.out.println(allPerms(list));
		
		
		/*
		Integer[] list = {1,2,3,4};
		ArrayList<Integer> l = new ArrayList();
		l.addAll(Arrays.asList(list));
		System.out.println(allPerms(l));
		*/
	}
}
