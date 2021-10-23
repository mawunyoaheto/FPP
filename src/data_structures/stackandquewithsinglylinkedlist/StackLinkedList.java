package data_structures.stackandquewithsinglylinkedlist;

public class StackLinkedList {

	private SinglyLinkedList s = new SinglyLinkedList();

	public void push(String data) throws NullInputException {
		s.addFirst(data);
	}

	public String peek() throws IndexOutOfBoundException {
		return s.get(0);
	}

	public String pop() throws IndexOutOfBoundException {

		String output = peek();

		s.remove(0);

		return output;
	}

	@Override
	public String toString() {

		return s.toString();
	}

}
