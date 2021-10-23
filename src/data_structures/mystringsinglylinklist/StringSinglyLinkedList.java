package data_structures.mystringsinglylinklist;

public class StringSinglyLinkedList {
	private Node startNode; 
	private int size ;

	public StringSinglyLinkedList() {
		super();
		startNode = new Node();
		startNode.next = null;
		size = 0;
	}

	public void addFirst(String input) throws NullInputException {

		if (input == null)
			throw new NullInputException("Null input not allowed. please enter a string");

		if (input.isEmpty())
			throw new NullInputException("Empty String not allowed. Please enter a valid string");
		Node n = new Node(input);
		if (startNode.next == null)
			startNode.next = n;
		else {
			n.next = startNode.next;
			startNode.next = n;
		}
		size++;
	}

	public void addLast(String input) throws NullInputException {
		if (input == null)
			throw new NullInputException("Null input not allowed. please enter a string");

		if (input.isEmpty())
			throw new NullInputException("Empty String not allowed. Please enter a valid string");

		Node n = new Node(input);
		if (startNode.next == null)
			addFirst(input);
		else {
			Node temp = startNode.next;

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
			n.next = null;
		}

		size++;
	}

	@Override
	public String toString() {

		if (size == 0 || startNode == null)
			return null;

		String output = "";

		Node temp = startNode.next;
		while (temp != null) {

			output += temp.data + "\n";

			temp = temp.next;
		}
		return output;
	}

}
