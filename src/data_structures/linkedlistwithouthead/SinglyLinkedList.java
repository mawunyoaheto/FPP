package data_structures.linkedlistwithouthead;

import java.util.Iterator;

public class SinglyLinkedList implements Iterable<String> {
	private Node startNode;
	public int size;
	
	
	public SinglyLinkedList() {
		super();
		
		startNode = null;
		size=0;
	}
	
	public void addFirst(String input) {
		
		if (input == null)
			return;
		Node n = new Node(input);
		
//		if(startNode==null)
//			startNode=n;
//		else {
			n.next = startNode;
			startNode = n;
//		}

		size++;

	}

	public void addLast(String input) {

		if (input == null)
			return;

		if (startNode == null)
			addFirst(input);
		else {
			Node n = new Node(input);
			Node temp = startNode;

			while (temp.next != null) {

				temp = temp.next;
			}
			temp.next = n;
			size++;
		}



	}

	public void insert(String input, int pos) {

		if (input == null)
			return;
		if (pos > size || pos < 0)
			return;

		Node n = new Node(input);
		int i = 0;
		Node temp = startNode;
		while (temp.next != null) {
			if (i == pos - 1) {

				n.next = temp.next;
				temp.next = n;
			}
			temp = temp.next;
			i++;
		}
		size++;
	}

	public boolean contains(String input) {

		if (input == null)
			return false;

		if (size == 0)
			return false;

		Node temp = startNode;
		while (temp != null) {
			if (temp.data == input)
				return true;
			temp = temp.next;
		}
		return false;
	}

	public boolean remove() {

		if (size == 0)
			return false;
		startNode = startNode.next;
		size--;
		return true;
	}

	public boolean remove(String input) {

		if (input == null || size == 0)
			return false;

		if (input.equals(startNode.data)) {
			startNode = startNode.next;
			size--;
			return true;

		}

		Node temp = startNode;
		while (temp != null) {

			if (temp.data == input) {
				temp = temp.next;
				size--;
				return true;
			}

			temp = temp.next;
		}

		return false;
	}

	public boolean remove(int pos) {

		if (pos > size || pos < 0 || size == 0)
			return false;

		if (pos == 0) {
			startNode = startNode.next;
			size--;
			return true;
		}

		int i = 0;
		Node temp = startNode;
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

	public String get(int pos) {

		if (pos > size || pos < 0 || size == 0)
			return null;

		int i = 0;
		Node temp = startNode;

		while (temp.next != null) {
			if (i == pos)
				return temp.data;
			temp = temp.next;
			i++;
		}

		return temp.data;
	}
	@Override
	public String toString() {

		String output = "";
		Node temp = startNode;

		int count = 0;
		while (count < size) {

			output += temp.data + "\n";

			temp = temp.next;
			count++;
		}
		return output;

	}

	@Override
	public Iterator<String> iterator() {

		return new LinkedListIterator();
	}
	
	
	class LinkedListIterator implements Iterator<String> {
		private int position;

		public LinkedListIterator() {
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
