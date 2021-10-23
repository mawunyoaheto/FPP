package adt;

public class StringLinkedList {

	Node header = null;
	Node startNode;
	String data;

	public StringLinkedList() {
		super();
		header = new Node();
	}

	public void add(String data) {
		Node newNode = new Node();
		newNode.data = data;

		if (data == null)
			return;

		if (header.next == null)
			header.next = newNode;
		newNode.next = null;

	}

	public void addFirst(String data) {
		if (data == null)
			return;

		Node newNode = new Node();

		if (header.next != null) {

			Node prevHead = header;

			newNode = header;
			newNode.data = data;
			newNode.next = prevHead;
		} else {

			add(data);

		}

	}

	public void addLast(String data) {

		Node newNode = new Node();
		newNode.data = data;

		if (header == null) {
			header = newNode;

		} else {

			Node last = header;
			while (last.next != null) {

				last = last.next;
			}

			last.next = newNode;
		}

	}

	public boolean search(String data) {

		if (header == null)
			return false;

		// Node startSearch = head;

		Node temp = header;

		while (temp != null) {

			if (header.data.equals(data)) {
				return true;
			}

			temp = temp.next;
		}

		return false;
	}

	public boolean remove(String data) {

		if (data == null || header == null)
			return false;

		if (data.equals(header.data))
			header = header.next;

		Node prev = header;
		Node next = header.next;

		while (next != null) {

			if (data.equals(next.data)) {

				prev.next = next.next;
				return true;
			}

			prev = next;
			next = next.next;
		}
		return false;
	}

	public int size() {

		int count = 0;

		if (header == null)
			return count;

		Node temp = header;
		while (temp != null) {

			count++;

			temp = header.next;

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
