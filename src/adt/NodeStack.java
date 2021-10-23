package adt;

public class NodeStack {
	Node top;

	void push(String data) {
		
		Node newNode= new Node();
		newNode.data=data;

		newNode.next = top;
		top = newNode;
	}

	String peek() {

		if (top == null)
			return null;

		return top.data;
	}

	String pop() {

		if (top == null)
			return null;

		String s = peek();
		top = top.next;

		return s;
	}


	class Node {

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

	public static void main(String[] args) {

		NodeStack stack = new NodeStack();
		stack.push("HAROLD");
		stack.push("RAYMOND");
		stack.push("ALICE");
		System.out.println(stack.peek());
		System.out.println(stack.top.toString());
		System.out.println(stack.pop());
		System.out.println(stack.top.toString());

	}

}
