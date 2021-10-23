package data_structures.stackandquewithdoublylinklist;

import java.util.Iterator;

public class StringDoublyLinkList implements Iterable<String> {
	private Node header;
	private Node tail;
	private int size;

	public StringDoublyLinkList() {

		header = new Node();
		tail = new Node();
		header.next = tail;
		tail.previous = header;
		size = 0;
	}

	public void addFirst(String data) throws NullInputException {

		if (data == null)
			throw new NullInputException("Null input not allowed");

		Node n = new Node(data);
		n.next = header.next;
		n.next.previous.next = n;
		n.next.previous = n;
		n.previous = header;
		size++;

	}

	public void addLast(String data) throws NullInputException {
		if (data == null)
			throw new NullInputException("Null input not allowed");

		Node n = new Node(data);
		n.next = tail;
		tail.previous.next = n;
		n.previous = n.next.previous;
		n.next.previous = n;

		size++;
	}

	public void insert(String data, int pos) throws NullInputException, IndexOutOfBoundException {

		if (data == null)

			return;
		// throw new NullInputException("Null input not allowed");
		if (pos < 0 || pos > size)
			throw new IndexOutOfBoundException("Cannot insert at a non-existent index");

		Node n = new Node(data);
		Node temp = header.next;

		int i = 0;

		while (temp != tail) {
			if (i == pos) {
				n.next = temp;
				temp.previous.next = n;
				n.previous = temp.previous;
				temp.previous = n;
				size++;
			}

			temp = temp.next;
			i++;
		}

	}

	public void remove(int pos) throws IndexOutOfBoundException {


		if (pos < 0 || pos > size)
			throw new IndexOutOfBoundException("Cannot remove from a non-existent index");

		int i = 0;
		Node temp = header.next;

		while (temp != tail) {

			if (i == pos) {

				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;
				size--;

				return;
			}

			temp = temp.next;
			i++;
		}

	}

	public void remove(String data) throws NullInputException {

		if (data == null)
			throw new NullInputException("Null input not allowed");

		Node temp = header.next;
		while (temp != tail) {

			if (temp.data.equals(data)) {

				temp.next.previous = temp.previous;
				temp.previous.next = temp.next;
				size--;
			}

			temp = temp.next;
		}
	}

	public boolean search(String data) throws NullInputException {

		if (data == null)
			throw new NullInputException("Null input not allowed");

		Node temp = header.next;

		while (temp != tail) {
			if (temp.data.equals(data)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public String get(int pos) throws IndexOutOfBoundException {

		if (pos < 0 || pos > size)
			throw new IndexOutOfBoundException("Cannot insert at a non-existent index");

		int i = 0;
		Node temp = header.next;
		while (temp != tail) {
			if (i == pos) {
				return temp.data;
			}

			temp = temp.next;
			i++;
		}

		return "";
	}
	@Override
	public String toString() {

		Node temp = header.next;

		String output = "";
		while (temp != tail) {
			output += temp.data + "\n";
			temp = temp.next;
		}
		return output;
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	class LinkIterator implements Iterator<String> {

		private int position;

		public LinkIterator() {
			position = 0;
		}

		@Override
		public boolean hasNext() {

			return position < size;
		}

		@Override
		public String next() {

			String output = null;

			try {
				output = get(position++);
			} catch (IndexOutOfBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return output;
		}

	}

}
