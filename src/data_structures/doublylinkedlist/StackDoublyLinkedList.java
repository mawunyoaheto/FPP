package data_structures.doublylinkedlist;

public class StackDoublyLinkedList {

	MyDoublyLinkedList m = new MyDoublyLinkedList();

	public void push(String s) {

		m.addFirst(s);
	}

	public String peak() {

		return m.get(0);
	}

	public String pop() {
		String output = peak();
		m.remove(0);
		return output;
	}

	@Override
	public String toString() {
		String output = "";
		for (String s : m) {
			output += s + " || ";
		}
		return output;
	}


	public static void main(String[] args) {
		StackDoublyLinkedList s = new StackDoublyLinkedList();
		s.push("Dawit");
		s.push("Raymond");
		s.push("Ismael");
		s.push("Kyaw");
		s.push("Mhadi");

		System.out.println(s);

	}


}
