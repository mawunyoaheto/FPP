package data_structures.vehicle_linkedlist;

import java.util.Iterator;

public class VehicleLinkedList implements Iterable<Vehicle> {

	private Node head;
	private Node tail;
	private int size;

	public VehicleLinkedList() {
		super();
		
		head = new Node();
		tail = new Node();
		
		head.next=tail;
		tail.previous = head;
		size=0;
	}


	public void addFirst(Vehicle v) {

		if (v == null)
			return;
		Node newNode = new Node(v);

		newNode.next = head.next;
		head.next = newNode;
		newNode.previous = head;
		head.next.next.previous = newNode;
		size++;
	}

	public void addLast(Vehicle v) {

		if (v == null)
			return;
		Node newNode = new Node(v);

		newNode.next = tail;
		tail.previous.next = newNode;
		newNode.previous = tail.previous;
		newNode.next.previous = newNode;

		size++;
	}

	public boolean search(Vehicle v) {
		if (size == 0 || v == null)
			return false;

		Node temp = head.next;

		while (temp != tail) {

			if (temp.data.equals(v))
				return true;
			temp = temp.next;
		}

		return false;
	}

	public Vehicle get(int index) {
		if (index > size || index < 0)
			return null;
		int i = 0;
		Node temp = head.next;

		while (temp != tail) {

			if (i == index) {
				return temp.data;
			}
			temp = temp.next;
			i++;
		}

		return null;
	}

	public void insert(Vehicle v, int index) {
		if (index > size || index < 0 || v == null)
			return;

		Node newNode = new Node(v);
		int i = 0;
		Node temp = head.next;

		if (index == 0)
			addFirst(v);
		while (temp != tail) {
			if (i == index) {

				newNode.next = temp;
				temp.previous.next = newNode;
				newNode.previous = newNode.next.previous;
				newNode.next.previous = newNode;

			}

			temp = temp.next;
			i++;
		}

		size++;
	}

	public boolean remove(Vehicle v) {
		if (v == null)
			return false;

		Node temp = head.next;

		while (temp != null) {
			if (temp.data.equals(v)) {

				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;
				size--;
				return true;
			}

			temp = temp.next;
		}

		return false;
	}
	@Override
	public String toString() {

		Node temp = head.next;

		String output = "";
		while (temp != tail) {

			output += temp.data + "||";

			temp = temp.next;
		}

		return output;
	}

	@Override
	public Iterator<Vehicle> iterator() {

		return new VehicleIterator();
	}

	class VehicleIterator implements Iterator<Vehicle> {

		private int position;

		public VehicleIterator() {
			position = 0;
		}

		@Override
		public boolean hasNext() {

			return position < size;
		}

		@Override
		public Vehicle next() {

			return get(position++);
		}

		public void reset() {
			position = 0;
		}
	}

}
