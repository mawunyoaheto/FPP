package data_structures.doublylinkedlist;

public class Node implements Cloneable {
	public Product data;
	public Node next;
	public Node previous;

	public Node() {

	}
	public Node(Product data) {
		this.data = data;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Node nCopy = (Node) super.clone();
		nCopy.data = (Product) data.clone();
		return nCopy;
	}

}
