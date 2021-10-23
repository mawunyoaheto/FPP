package data_structures.stackandquewithdoublylinklist;

public class StackLinkedList {

	private StringDoublyLinkList s = new StringDoublyLinkList();

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
