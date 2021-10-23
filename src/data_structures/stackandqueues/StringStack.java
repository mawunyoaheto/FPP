package data_structures.stackandqueues;

public class StringStack {
	private Node h;
	
	public void push(String input) {
		Node n = new Node(input);
		n.next = h;
		h = n;
	}
	
	public String peak() {
		if(h == null) return "";
		return h.data;
	}
	
	public String pop() {
		if(h == null) return "";
		String result = peak();
		h = h.next;
		return result;
	}

	@Override
	public String toString() {
		String output = "";	
		Node temp = h;
		while(temp != null) {
			output += temp.data + " | ";
			temp = temp.next;
		}
		return output;
	}
}
