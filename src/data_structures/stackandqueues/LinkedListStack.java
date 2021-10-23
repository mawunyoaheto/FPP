package data_structures.stackandqueues;

public class LinkedListStack {
	StringLinkedList list = new StringLinkedList();
	
	public void push(String input) {
		list.addFirst(input);
	}
	
	public String peak() {
		return list.get(0);
	}
	
	public String pop() {
		String s = peak();
		list.remove(0);
		return s;
	}
	
	@Override
	public String toString() {
		String r = "";
		for(String s : list) {
			r += s + " || ";
		}
		return r;
	}
}
