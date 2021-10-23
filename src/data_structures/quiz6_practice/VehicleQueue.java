package data_structures.quiz6_practice;

public class VehicleQueue {
	public Node head;
	public int size;

	public VehicleQueue() {
		head = null;
		size = 0;
	}

	public void enqueue(Vehicle input) {
		if (input == null)
			return;
		Node n = new Node(input);

		if (head == null) {
			head = n;
		} else {

			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = n;
		}

		size++;
	}

	public Vehicle peek() {
		if (head == null)
			return null;
		return head.data;
	}

	public Vehicle dequeue() {

		if (size == 0 || head == null)
			return null;

		Vehicle output = peek();
		head = head.next;
		size--;
		return output;
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
