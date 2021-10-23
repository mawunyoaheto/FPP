package data_structures.linkedlist;

import java.util.Iterator;

public class MyLinkedList implements Iterable<String> {
	Node head = new Node();
	private int size = 0;

	void addFirst(String data) {

		Node newNode = new Node(data);
		Node temp = head.next;
		if (temp == null) {
			head.next = newNode;
			size++;
		} else {
			newNode.next = head.next;
			head.next = newNode;
			size++;
		}

	}

	void addLast(String data) {

		Node newNode = new Node(data);
		if (head.next == null) {
			head.next = newNode;
			size++;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			size++;
		}
	}

	boolean remove(String s) {

		if (head.next == null || s == null)
			return false;

			Node prev = head;
			Node next = head.next;
			while (next != null) {

				if (next.data.equalsIgnoreCase(s)) {
					prev.next = next.next;
					size--;
					return true;

				}

				prev = prev.next;
				next = next.next;

			}

		return false;
	}

	boolean search(String s) {
		if (s == null || head.next == null)
			return false;
		Node temp = head.next;
		while (temp != null) {

			if (temp.data.equals(s))
				return true;
			temp = temp.next;
		}

		return false;
	}

	void insert(String s, int pos) {

		if (pos > size || s == null)
			return;

		int count = 0;

		Node newData = new Node(s);
		Node next = head.next;
		Node prev = head;

		while (next != null) {

			if (count == pos) {
				newData.next = next;
				prev.next = newData;
				size++;
			}

			next = next.next;
			prev = prev.next;
			count++;
		}
	}

	public Iterator<String> iterator() {
		return new MyIterator();
	}

	private class MyIterator implements Iterator<String> {

		private int position = 0;

		public MyIterator() {
			position = 0;
		}

		@Override
		public boolean hasNext() {

			return (position < size);
		}

		@Override
		public String next() throws IndexOutOfBoundsException {
			if (!hasNext())
				throw new IndexOutOfBoundsException();

			Node n = head;
			return n.next.data;
		}

	}


	static class Node {
		Node next;
		String data;

		Node() {

		}

		Node(String d) {
			super();
			data = d;
			next = null;
		}

	}

	@Override
	public String toString() {
		String result = "";
		Node temp = head.next;
		if (temp == null)
			return result;


		int count = 0;
		while (temp != null) {

			if (count == 0) {
				result = result + temp.data;
				count++;
			} else {
				result = result + ", " + temp.data;
				count++;
			}
			temp = temp.next;
		}

		return result;
	}
	public static void main(String[] args) {
		MyLinkedList l = new MyLinkedList();
		l.addFirst("Dhawit");
		l.addLast("Raymond");
		l.addFirst("Benjamin");

		System.out.println(l.search("Benjamin"));

		System.out.println(l);

		l.remove("Raymond");
		System.out.println(l);
		System.out.println("Is Raymond in the list? " + l.search("Raymond"));

		l.insert("Mahdi", 1);

		System.out.println(l);
	}
}
