package data_structures.stackandqueues;

public class StringQueue {
	private Node h;
	
	public void enqueue(String input) {
		Node n = new Node(input);
		Node temp = h;
		
		if(temp == null) {
			h = n;
		}else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}
	
	public String peak() {
		if(h == null) return "";
		return h.data;
	}
	
	public String dequeue() {
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
