package data_structures.queuewithnode;

import java.util.Iterator;
import java.util.Objects;

public class QueueWithNode implements Iterable<String> {
	private Node head;
	private int size;

	public QueueWithNode() {
		size = 0;
		// head = new Node();
	}

	public void enqueue(String data) {

		Node n = new Node(data);
		Node temp = head;

		if (temp == null) {
			head = n;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
			size++;

		}

	}

	public String peek() {
		if (head == null)
			return "";
		return head.data;
	}

	public String dequeue() {

		if (head == null)
			return "";
		String output = peek();

		head = head.next;
		size--;
		return output;
	}

	public String get(int index) {
		Node temp = head;
		if (temp == null)
			return "";

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
		String output = "";
		Node temp = head;

		while (temp != null) {
			output += temp.data + " || ";

			temp = temp.next;
		}
		return output;
	}

	@Override
	public Iterator<String> iterator() {

		return new QueueIterator();
	}

	class QueueIterator implements Iterator<String> {
		private int position;

		public QueueIterator() {
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

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(head.data);
	}

}
