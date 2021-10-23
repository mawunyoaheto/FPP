package data_structures.stackandqueues;

public class SQTest {

	public static void main(String[] args) {
		StringLinkedList list = new StringLinkedList();
		list.addFirst("FPP");
		list.addFirst("MPP");
		list.addFirst("DBMS");
	
		System.out.println(list.search("WAP"));
	}
	
	
	static void printList(StringLinkedList list) {
		for(String s : list) {
			System.out.println(s);
		}
	}

}
