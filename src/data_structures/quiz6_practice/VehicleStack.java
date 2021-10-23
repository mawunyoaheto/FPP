package data_structures.quiz6_practice;

public class VehicleStack {
	public Node head;
	public int size;

	public VehicleStack() {
		this.head = null;
		this.size = 0;
	}

	public void push(Vehicle input) throws MyStackException {
		if (input == null)
			throw new MyStackException("Null input not allowed");

		Node n = new Node(input);
		if (head == null) {
			head = n;
		} else {
			n.next = head;
			head = n;
		}
		size++;
	}

	public Vehicle peek() {
		if (head == null)
			return null;

		return head.data;
	}

	public Vehicle pop() {

		if (size == 0 || head == null)
			return null;

		Vehicle output = peek();
		head = head.next;
		size--;
		return output;
	}

	public Vehicle get(int index) throws IndexOutOfBoundsException {
		if (index > size || index < 0)
			throw new IndexOutOfBoundsException("Index not found");

		Node temp = head;
		int i = 0;
		while (temp != null) {
			if (i == index) {
				return temp.data;
			}

			temp = temp.next;
			i++;
		}
		return null;

	}
	@Override
	public String toString() {

		Node temp = head;

		String output = "";

		while (temp != null) {
			output += temp.data + " || ";
			temp = temp.next;
		}
		return output;
	}

}
