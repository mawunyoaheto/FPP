package data_structures.doublylinkedlist;

import java.util.Iterator;

public class ProductDoublyLinkedList implements Iterable<Product> {
	private Node head;
	private Node tail;
	private int size;

	public ProductDoublyLinkedList() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.previous = head;
		size = 0;
	}

	public void addFirst(Product input) {

		Node n = new Node(input);
		if (input == null)
			return;
		n.next = head.next;
		n.next.previous.next = n;
		n.next.previous = n;
		n.previous = head;
		size++;

	}

	public void addLast(Product input) {
		if (input == null)
			return;

		Node n = new Node(input);
		Node temp = head.next;
		if (temp == tail)
			addFirst(input);
		else {

			n.next = tail;
			n.next.previous.next = n;
			n.previous = n.next.previous;
			n.next.previous = n;
		}

		size++;
		}

		public boolean remove() {
			if (size == 0 || head.next == tail)
				return false;

			head.next = head.next.next;
			head.next.previous = head;
			size--;

			return true;
		}

		public boolean search(Product input) {

			Node temp = head.next;
			if (size == 0 || temp == tail)
				return false;

			while (temp != null) {
				if (temp.data.equals(input))
					return true;
				temp = temp.next;
			}
			return false;
		}

		public void insert(Product input, int pos) {

			if (pos > size || pos < 0 || input == null)
				return;
			Node temp = head.next;
			Node n = new Node(input);
			if (pos == 0)
				addFirst(input);
			if (pos == size)
				addLast(input);

			int i = 0;
			while (temp != null) {
				if (i == pos) {

					n.next = temp;
					temp.previous.next = n;
					n.previous = temp.previous;
					temp.previous = n;
				}

				temp = temp.next;
			}
			size++;
		}

		public void remove(int pos) {

			if (pos > size || pos < 0)
				return;
			Node temp = head.next;

			int i = 0;
			while (temp != tail) {
				if (i == pos) {

					temp.previous.next = temp.next;
					temp.next.previous = temp.previous;
				}

				temp = temp.next;
				i++;
			}
			size--;
		}

		public Product get(int pos) {
			if (pos > size || pos < 0)
				return null;

			Node temp = head.next;

			int i = 0;
			while (temp != null) {
				if (i == pos) {
					return temp.data;
				}

				temp = temp.next;
			}

			return null;
		}

		@Override
		public Iterator<Product> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		class ProductIterator implements Iterator<Product> {
			private int position;

			public ProductIterator() {
				this.position = 0;
			}

			@Override
			public boolean hasNext() {

				return position < size;
			}

			@Override
			public Product next() {

				return get(position++);
			}

		}

		@Override
		public String toString() {

			Node temp = head.next;
			String output = "";
			while (temp != tail) {
				output += temp.data + " \n";
				temp = temp.next;
			}

			return output;
		}


}
