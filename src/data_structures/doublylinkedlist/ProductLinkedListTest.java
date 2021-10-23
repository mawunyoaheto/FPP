package data_structures.doublylinkedlist;

public class ProductLinkedListTest {

	public static void main(String[] args) {

		Product p1 = new Product("Milk Powder", "Nido", 15.50);
		Product p2 = new Product("Milk Powder", "Cowbell", 13.50);
		Product p3 = new Product("Cocoa Tea", "Milo", 18.50);
		Product p4 = new Product("Cocoa Tea", "Richocco", 14.50);

		ProductDoublyLinkedList p = new ProductDoublyLinkedList();

		p.addLast(p4);
		p.addFirst(p1);
		p.addFirst(p3);
		p.remove(0);

		System.out.println(p);

	}


}
