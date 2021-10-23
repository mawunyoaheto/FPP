package data_structures.mystringsinglylinklist;

public class Main {

	public static void main(String[] args) {

		StringSinglyLinkedList s = new StringSinglyLinkedList();

		try {
			s.addFirst("Raymond");
			s.addFirst("Dawit");
			s.addLast("Mahdi");

			System.out.println(s);

		} catch (Exception e) {
			// System.out.println(e.getClass().getName() + ">>>>>" + e.getMessage());
			System.out.println(e.getMessage());
		} finally {
			// System.out.println(s);
		}
	}

}
