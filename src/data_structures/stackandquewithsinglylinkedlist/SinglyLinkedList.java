package data_structures.stackandquewithsinglylinkedlist;

import java.util.Iterator;

public class SinglyLinkedList implements Iterable<String> {
	private Node head;
	private int size;

	public void addFirst(String data) throws NullInputException {

		if (data == null)
			throw new NullInputException("Null input not allowed");

		Node n = new Node(data);

		n.next = head;
		head = n;
		size++;
	}

	public void addLast(String data) throws NullInputException {

		if (data == null)
			throw new NullInputException("Null input not allowed");

		if (head == null) {
			addFirst(data);
			return;
		} else {

			Node n = new Node(data);
			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = n;
			size++;
		}
	}

	public boolean remove(String data) throws NullInputException {

		if (data == null)
			throw new NullInputException("Null input not allowed");

		if (size == 0)
			return false;

		if (head.data.equals(data)) {

			head = head.next;
			size--;
			return true;
		}

		Node prev = head;
		Node temp = head.next;

		while (temp != null) {

			if (temp.data.equals(data)) {

				// temp = temp.next;
				prev.next = prev.next.next;
				size--;
				return true;
			}

			prev = temp;
			temp = temp.next;
		}

		return false;

	}

	public boolean remove(int pos) throws IndexOutOfBoundException {

		if (pos < 0 || pos > size)
			throw new IndexOutOfBoundException("Index to be removed does not exist");

		if (pos == 0) {
			head = head.next;
			size--;
			return true;

		}

		Node temp = head;
		int i = 0;
		while (temp.next != null) {
			if (i == pos - 1) {

				temp.next = temp.next.next;
				size--;
				return true;
			}

			temp = temp.next;
			i++;
		}

		return false;

	}

	public void insert(String data, int pos) throws NullInputException, IndexOutOfBoundException {

		if (data == null)
			throw new NullInputException("Null input not allowed");

		if (pos < 0 || pos > size)
			throw new IndexOutOfBoundException("Index to be removed does not exist");

		if (pos == 0) {
			addFirst(data);
			return;
		}

		Node n = new Node(data);
		int i = 0;

		Node temp = head;
		while (temp.next != null) {
			if (i == pos - 1) {
				n.next = temp.next;
				temp.next = n;
				size++;
				return;
			}

			temp = temp.next;
			i++;
		}

	}

	public boolean search(String data) throws NullInputException {

		if (data == null)
			throw new NullInputException("Null input not allowed");
		if (size == 0)
			return false;

		Node temp = head;
		while (temp.next != null) {

			if (temp.data.equals(data)) {
				return true;
			}

			temp = temp.next;
		}

		return false;
	}

	public String get(int pos) throws IndexOutOfBoundException {

		if (pos < 0 || pos > size)
			throw new IndexOutOfBoundException("Index does not exist");

		Node temp = head;
		int i = 0;

		while (temp.next != null) {
			if (i == pos)
				return temp.data;

			temp = temp.next;
			i++;
		}
		return null;

	}

	@Override
	public String toString() {

		String output = "";

		Node temp = head;
		while (temp != null) {

			output += temp.data + "\n";

			temp = temp.next;
		}

		return output;
	}

	@Override
	public Iterator<String> iterator() {

		return new ListIterator();
	}

	class ListIterator implements Iterator<String> {
		private int position;

		public ListIterator() {

			size = 0;
		}

		@Override
		public boolean hasNext() {

			return position < size;
		}

		@Override
		public String next() {

			try {
				return get(position++);
			} catch (IndexOutOfBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	}

}
