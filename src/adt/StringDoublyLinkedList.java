package adt;

public class StringDoublyLinkedList {
	Node next;
	Node previous;
	Node header;

	public StringDoublyLinkedList() {
		header = new Node(null);
	}

	void addFirst(String data) {

		Node n = new Node(data);

		n.next = header.next;
		n.previous = header;

		if (header.next != null) {
			header.next.previous = n;
		}

		header.next = n;

	}

	void addLast(String data) {

		Node n = new Node(data);

		if (header.next == null) {
			addFirst(data);
		} else {

			Node lastNode = header.next;
			while (lastNode != null) {

				lastNode = lastNode.next;

			}
			n.previous = lastNode.previous;
			lastNode.previous.next = n;
			// Node prevNode = nextNode.previous;

		}
	}

	class Node {

		String data;
		Node next;
		Node previous;

		public Node(String data) {
			super();
			this.data = data;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringDoublyLinkedList doublyLL = new StringDoublyLinkedList();

		// Iterator<String> it = doublyLL.iterator();

	}


}

