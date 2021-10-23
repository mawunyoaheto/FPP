package adt;

public class ArrayStack {

	String[] arr = new String[200];
	int current = -1;
	int next = 0;

	void push(String data) {

		arr[next] = data;
		current++;
		next++;

	}

	String peek() {

		return (current == -1) ? null : arr[current];
	}

	String pop() throws ArrayIndexOutOfBoundsException {

		String temp = peek();

		if (temp == null)
			throw new ArrayIndexOutOfBoundsException("Cannot pop empty stack");
		else {

			temp = arr[current];
			arr[current] = null;
			current--;
			next--;

		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
