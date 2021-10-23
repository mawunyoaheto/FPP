package adt;

import java.util.AbstractList;

public class LinkedListQueue extends AbstractList<String> {
	Node front;
	Node rear;

	void enqueue(String data) {

		Node newNode = new Node();
		newNode.data = data;
		if (rear == null) {
			this.front = this.rear = newNode;
		} else {

			this.rear.next = newNode;
			this.rear = newNode;
		}

	}

	void dequeue() {

		if (front == null)
			return;

		front = front.next;

		if (front == null) {
			rear = null;
		}
	}

	String peek() throws IndexOutOfBoundsException {

		if (front == null)
			throw new IndexOutOfBoundsException("Cannot view an empty stack");

		return front.data;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private class Node {

		Node next;
		String data;

		public Node() {
			super();
		}

		@Override
		public String toString() {
			if (data == null)
				return "";
			StringBuilder sb = new StringBuilder(data + " ");
			sb = toString(sb, next);
			return sb.toString();
		}

		private StringBuilder toString(StringBuilder sb, Node n) {
			if (n == null)
				return sb;
			sb.append(n.data + " ");
			return toString(sb, n.next);
		}
}

@Override
public String get(int index) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int size() {
	// TODO Auto-generated method stub
	return 0;
}
}