package mpp_test.prob1.extras;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDups {
	ArrayList<String> list;
	public RemoveDups(ArrayList<String> list) {
		this.list = list;
	}
	
	public ArrayList<String> getUpdatedList() {
		return list;
	}
	
	public void removeFastWay() {
		ArrayList<String> distinct = new ArrayList<String>();
		HashMap<String, String> alreadyChecked = new HashMap<String, String>();
		String next = null;
		for(int i = 0; i < list.size(); ++i) {
			next = list.get(i);
			if(!alreadyChecked.containsKey(next)) {
				distinct.add(next);
				alreadyChecked.put(next, next);
			}
		}
		list = distinct;
	}
	public static void main(String[] args) {
		
	}
}
