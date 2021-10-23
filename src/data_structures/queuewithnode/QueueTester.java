package data_structures.queuewithnode;

public class QueueTester {

	public static void main(String[] args) {
		QueueWithNode q = new QueueWithNode();

		q.enqueue("FPP");
		q.enqueue("MPP");
		q.enqueue("WAPP");
		q.enqueue("ALG");

		System.out.println(q);

		System.out.println(q.dequeue());

		System.out.println(q);
	}

}
