package data_structures.stackandquewithsinglylinkedlist;

public class QueueLinkedList {

	private SinglyLinkedList s = new SinglyLinkedList();


	public void enqueue(String data) throws NullInputException {

		if (data == null)
			throw new NullInputException("Null input not allowed");

		s.addLast(data);
	}

	public String peek() throws IndexOutOfBoundException {

		return s.get(0);
	}

	public String dequeue() throws IndexOutOfBoundException {

		String output = peek();

		s.remove(0);

		return output;
	}

	@Override
	public String toString() {

		return s.toString();
	}

}
