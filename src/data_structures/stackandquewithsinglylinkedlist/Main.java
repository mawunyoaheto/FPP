package data_structures.stackandquewithsinglylinkedlist;

public class Main {

	public static void main(String[] args) {

		SinglyLinkedList s = new SinglyLinkedList();

		StackLinkedList stack = new StackLinkedList();

		try {
			s.addFirst("Raymond");
			s.addFirst("Dawit");
			s.addLast("Mahdi");
//		
//
			System.out.println(s);
//			s.insert("Kyaw", 1);
//			System.out.println(s);
//
//			s.remove(0);
//
//			System.out.println(s);
			s.remove("Dawit");
			System.out.println(s);
			s.remove("Mahdi");
			
			System.out.println(s);

//			System.out.println(s.contains("Dawi"));
//
//			s.remove();
//			System.out.println(s);
//
//			s.insert("Dawit", 1);
//			
//			System.out.println(s);
//
//			s.forEach(m -> System.out.println(m));

//			stack.push("Raymond");
//			stack.push("Dawit");
//			stack.push("Mahdi");

//			System.out.println(stack);
//
//			System.out.println(stack.pop() + "\n");
//
//			System.out.println(stack);

		} catch (Exception e) {
			// System.out.println(e.getClass().getName() + ">>>>>" + e.getMessage());
			System.out.println(e.getMessage());
		} finally {
			// System.out.println(s);
		}
	}

}
