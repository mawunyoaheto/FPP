package data_structures.doublylinkedlist;

import java.util.Iterator;

public class MyDoublyLinkedList implements Iterable<String> {
	private Node head;
	private int size = 0;

	public MyDoublyLinkedList() {
		head = new Node();
	}

	/*
	 * void addFirst(String val){...} void addLast(String val){...} boolean
	 * search(String val){...} int size() boolean remove(String val){...} void
	 * insert(String val, int pos){...} boolean remove(int pos){...}
	 */

	public void addFirst(String s) {
		if (s == null)
			return;
		Node newNode = new Node(s);

		newNode.next = head.next;
		head.next = newNode;
		newNode.prev = head;

		if (head.next.next != null) {
			newNode.next.prev = newNode;

		}
			size++;
	}

	public void addLast(String s) {
		if (s == null)
			return;
		Node temp = head;
		Node newNode = new Node(s);
		while (temp.next != null) {
			temp = temp.next;

		}
		temp.next = newNode;
		newNode.prev = temp;
		size++;

	}

	public boolean remove(String s) {

		Node current = head.next;

		while (current != null) {
			if (current.data.equals(s)) {

				Node prevNode = current.prev;
				current.prev.next = current.next;
				current.next.prev = prevNode;

				size--;
				return true;
			}
			current = current.next;
		}

		return false;
	}

	public boolean remove(int pos) {

		if (pos > size || pos < 0)
			return false;

		int count = 0;
		Node temp = head.next;
		while (temp != null) {
			if (count == pos) {

				Node nextNode = temp.next;
				temp.prev.next = nextNode;
				nextNode.prev = temp.prev;
				size--;
				return true;
			}

			count++;
			temp = temp.next;
		}

		return false;
	}

	public void insert(String s, int pos) {

		if (pos > size || pos < 0)
			return;

		int count = 0;
		Node temp = head.next;
		Node newNode = new Node(s);
		while (temp != null) {

			if (count == pos) {

				Node prevNode = temp.prev;
				newNode.next = temp;
				prevNode.next = newNode;

				newNode.prev = prevNode;
				newNode.next.prev = newNode;

				size++;
			}


			temp = temp.next;
			count++;
		}

	}

	public boolean search(String s) {

		if (s == null)
			return false;

		Node temp = head.next;
		while (temp != null && !temp.data.equals(s)) {

			temp = temp.next;
		}

		if (temp == null)
			return false;
		else {
			return true;
		}
	}

	public String get(int index) {
		int i = 0;
		Node temp = head.next;
		while (temp != null) {
			if (i == index)
				return temp.data;
			temp = temp.next;
			i++;
		}
		return "";
	}
	public int size() {
		return size;
	}
	@Override
	public String toString() {

		Node temp = head.next;
		String output = "";

		if (temp == null)
			return output;
		while (temp != null) {

			output += temp.data + " | ";
			temp = temp.next;
		}
		return output;
	}

	static class Node {
		Node next;
		Node prev;
		String data;

		public Node() {

		}

		public Node(String data) {
			super();
			this.data = data;
			next = null;
			prev = null;
		}

	}

	@Override
	public Iterator<String> iterator() {

		return new MyIterator();
	}

	class MyIterator implements Iterator<String> {

		private int position = 0;

		public MyIterator() {
			position = 0;
		}

		@Override
		public boolean hasNext() throws IndexOutOfBoundsException {
//			if (!hasNext())
//				throw new IndexOutOfBoundsException();
			return (position < size);
		}

		@Override
		public String next() {
			return get(position++);
		}

		public void reset() {
			position = 0;
		}


	}

	public static void main(String[] args) {

		MyDoublyLinkedList d = new MyDoublyLinkedList();
		d.addFirst("Dawit");
		d.addFirst("Raymond");
		d.addFirst("Ismael");
		d.addLast("Kwaw");
		d.addFirst("Mhadi");

		/*
		 * Using for each construct (the list has to implement Iterable in order to use
		 * for each construct)
		 */
		System.out.println(
				"\n****Using for each construct (the list has to implement Iterable in order to use for each construct)*****");
		for (String s : d) {
			System.out.println(s);
		}

		System.out.println("\n****using new Java 8 forEach method of Iterable*****");
		/*
		 * using new Java 8 forEach method of Iterable interface to print content of the
		 * Doubly linked list
		 */
		d.forEach(n -> System.out.println(n));


		System.out.println("\n");
		/*
		 * Using Iterator
		 */

		System.out.println("****Using Iterator*****");
		Iterator<String> it = d.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("\n");
		System.out.println(d);

		System.out.println("\n" + d.remove("Raymond") + "\n");

		System.out.println(d);

		System.out.println("\n" + d.remove("Dhawit") + "\n");

		System.out.println(d);

		System.out.println(d.remove(0));

		System.out.println(d);

		d.insert("Yohannes", 1);

		System.out.println("\n" + d);

		System.out.println("\nIs Kwaw in the list? :" + d.search("Kwaw"));

		System.out.println("\nIs Raymond in the list? :" + d.search("Raymond"));

	}



}
