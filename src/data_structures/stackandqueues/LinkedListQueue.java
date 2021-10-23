package data_structures.stackandqueues;

public class LinkedListQueue {
	StringLinkedList list = new StringLinkedList();
	
	public void enqueue(String input) {
		list.addLast(input);
	}
	
	public String peak() {
		return list.get(0);
	}
	
	public String dequeue() {
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
