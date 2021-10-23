package data_structures.stackwithnode;

import java.util.Iterator;

public class StackWithNode implements Iterable<String> {
	private Node head;
	int size = 0;

	public void push(String data) {

		Node n = new Node(data);

		n.next = head;
		head = n;
		size++;
	}

	public String peak() {

		if (head == null)
			return "";
		return head.data;
	}

	public String pop() {
		if (head == null)
			return "";

		String output = peak();

		head = head.next;

		size--;
		return output;
	}

	public String get(int index) {
		if (head == null)
			return "";
		Node temp = head;
		int counter = 0;

		while (temp != null) {
			if (counter == index) {
				return temp.data;
			}

			temp = temp.next;
			counter++;
		}

		return "";
	}

	@Override
	public String toString() {

		if (head == null)
			return "";
		Node temp = head;
		String output = "";
		while (temp != null) {
			output += temp.data + "||";

			temp = temp.next;
		}

		return output;
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	class StackIterator implements Iterator<String> {

		private int position;

		public StackIterator() {
			position = 0;
		}

		@Override
		public boolean hasNext() {

			return position < size;
		}

		@Override
		public String next() {

			return get(position++);
		}

	}

}
