package data_structures.stackandqueues;

import java.util.Iterator;

public class StringLinkedList implements Iterable<String>{
	private Node head;
	private Node tail;
	public int size = 0;
	
	public StringLinkedList() {
		head = new Node("");
		tail = new Node("");
		head.next = tail;
	}
	
	private boolean isEmpty() {
		return head.next == tail;
	}
	
	public void addFirst(String input) {
		Node n = new Node(input);
		
		if(isEmpty()) {
			head.next = n;
			n.previous = head;
			n.next = tail;
			tail.previous = n;
		}else {
			n.next = head.next;
			head.next.previous = n;
			
			head.next = n;
			n.previous = head;
		}
		
		size++;
	}
	
	public boolean search(String input) {
		Node temp = head.next;
		while(temp != tail) {
			if(temp.data.equals(input)) return true;
			temp = temp.next;
		}
		return false;
	}
	
	public void addLast(String input) {
		Node n = new Node(input);
		
		if(isEmpty()) {
			head.next = n;
			n.previous = head;
			n.next = tail;
			tail.previous = n;
		}else {
			tail.previous.next = n;
			n.previous = tail.previous;
			
			n.next = tail;
			tail.previous = n;
		}
		
		size++;
	}
	
	public String get(int index) {
		int i = 0;
		Node temp = head.next;
		while(temp != tail) {
			if(i == index) return temp.data;
			temp = temp.next;
			i++;
		}
		return "";
	}
	
	public void remove(int index) {
		int i = 0;
		Node temp = head.next;
		while(temp != tail) {
			if(i == index) {
				
				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;
			}
			temp = temp.next;
			i++;
		}
		
		size--;
	}
	
	public void insert(String input, int pos) {
		Node n = new Node(input);
		
		if(isEmpty() || pos > size) return;
		
		int i = 0;
		Node temp = head.next;
		while(temp != tail) {
			
			if(i == pos) {
				temp.previous.next = n;
				n.previous = temp.previous;
				
				n.next = temp;
				temp.previous = n;
			}
		
			temp = temp.next;
			i++;
		}
		
		size++;
	}

	@Override
	public Iterator<String> iterator() {
		return new ListIterator();
	}
	
	class ListIterator implements Iterator<String>{
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
