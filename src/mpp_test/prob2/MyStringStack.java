package mpp_test.prob2;

public class MyStringStack {
	private Node top;
	
	//Pushes the string s onto the stack -- the top
	//Node is populated with this input String
	//If the input String is null, it is ignored
	public void push(String s) {

		Node newNode = new Node();
		newNode.value = s;
		if (top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}

	}
	
	//Pops the stack -- the value stored in the top 
	//Node is returned. If the stack is empty
	//when pop() is called, pop() returns null.
	public String pop() {
		//implement
		String topValue;

		if(top==null)
			throw new IllegalArgumentException("Cannot pop an empty stack");
		else {
			topValue = top.value;
			top = top.next;
		}
		
		return topValue;
	}
	
	//DO NOT MODIFY
	//Returns a space-separated string consisting
	//of the elements of this stack
	public String toString() {
		return Util.toString(this);
	}

	//DO NOT MODIFY
	private class Node {
		private String value;
		private Node next;
	}
}
