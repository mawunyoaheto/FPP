package data_structures.singlylinklist;

import java.util.Iterator;

public class StringList implements Iterable<String> {
	private Node StartNode;
	public int size = 0;

	public StringList() {
		StartNode = new Node();
		StartNode.next = null;
	}

	public void addFirst(String input) {

		if (input == null)
			return;
		Node n = new Node(input);
		if (StartNode == null) {
			StartNode = n;
		} else {
			n.next = StartNode;
			StartNode = n;
		}
		size++;
	}

	public void addLast(String input) {

		if (input == null) return;
		
		Node n = new Node(input);
		
		if (StartNode == null) {
			// StartNode = n;
			addFirst(input);
			return;
		} else {
			Node temp = StartNode;
			
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = n;
		}
		size++;
	}

	public boolean search(String input) {

		if (input == null) return false;
		
		Node temp = StartNode;
		while (temp != null) {
			{
			  if (input.equals(temp.data)) return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public String get(int index) {
		
		if(index < 0 || index > size || size == 0) return null;

		int i = 0;
		Node temp = StartNode;
		while (temp != null) {
			if (i == index) {
				return temp.data;
			}
			temp = temp.next;
			i++;
		}
		return null;
	}

	public boolean remove(String s) {

		if (s == null || StartNode == null) return true;

		if (s.equals(StartNode.data)) {
			StartNode = StartNode.next;
			return true;
		}

		Node prev = StartNode;
		Node cur = StartNode.next;
		while (cur != null) {
			if (s.equals(cur.data)) {
				prev.next = cur.next;
				return true;
			}
			prev = cur;
			cur = cur.next;
		}
		return false;

	}

	public boolean remove(int index) {
		
		if (index == 0) {
			StartNode = StartNode.next;
			return false;
		}
		int i = 1;
		Node Prev = StartNode;
		Node temp = StartNode.next;
		while (temp != null) {
			if (i == index) {
				Prev.next = temp.next;
				size--;
				return true;
			}
			Prev = temp;
			temp = temp.next;
			i++;
		}

		return false;
	}

	public void insert(String input, int pos) throws ArrayIndexOut{
	
		
		if(pos== 0) addFirst(input);
		
		
		
		if(pos < 0 || pos > size) throw new ArrayIndexOut("my index ex");
		
		Node n = new Node(input);
		int i = 1;
		Node Prev = StartNode;
		Node temp = StartNode.next;
		while (temp != null) {

			if (i == pos) {
				Prev.next = n;
				n.next = temp;
			}
			Prev = temp;
			temp = temp.next;
			i++;
		}
		size++;
	}

	@Override
	public Iterator<String> iterator() {
		return new ListIterator();
	}

	class ListIterator implements Iterator<String> {
		int position = 0;

		@Override
		public boolean hasNext() {
			return position < size;
		}

		@Override
		public String next() {
			return get(position++);
		}

		void reset() {
			position = 0;
		}

	}
}
