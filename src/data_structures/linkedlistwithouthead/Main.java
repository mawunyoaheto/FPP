package data_structures.linkedlistwithouthead;

public class Main {

	public static void main(String[] args) {

		SinglyLinkedList s = new SinglyLinkedList();

		try {
			s.addFirst("Raymond");
			s.addFirst("Dawit");
			s.addLast("Mahdi");
			s.insert("Kyaw", 1);
			System.out.println(s);

			s.remove(0);

			System.out.println(s);
			// s.remove("Raymond");
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

		} catch (Exception e) {
			// System.out.println(e.getClass().getName() + ">>>>>" + e.getMessage());
			System.out.println(e.getMessage());
		} finally {
			// System.out.println(s);
		}
	}

}
