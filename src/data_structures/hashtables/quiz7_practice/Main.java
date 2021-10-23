package data_structures.hashtables.quiz7_practice;

import java.util.Hashtable;
import java.util.Map;

public class Main {
	static Hashtable<Book, Author> ht = new Hashtable<Book, Author>();
	public static void main(String[] args) {

		Author a1 = new Author("Gale Anderson Cooper");
		Author a2 = new Author("George Nicely");
		Author a3 = new Author("Neil Old");
		Author a4 = new Author("Gale Anderson Cooper");
		Author a5 = new Author("Bart Sallot");

//		Book b1 = new Book("Hashtables and the end of humanity", 549204);
//		Book b2 = new Book("To link or not to link; a comprehensive guide to linked lists", 69295);
//		Book b3 = new Book("Recursion and the secret to depression", 329473);
//		Book b4 = new Book("The mother of all java", 832940);
//		Book b5 = new Book("Hashtables and the end of humanity", 238549);

//		ht.put(b1, a1);
//		ht.put(b2, a2);
//		ht.put(b3, a3);
//		ht.put(b4, a4);
//		ht.put(b5, a5);

		Book b1 = new Book("Hashtables and the end of humanity", 549204);
		Book b2 = new Book("To link or not to link; a comprehensive guide to linked lists", 69295);
		Book b3 = new Book("Recursion and the secret to depression", 329473);
		Book b4 = new Book("The mother of all java", 832940);
		Book b5 = new Book("Hashtables and the end of humanity", 549204);

		mergeDuplicateAuthors(b1, a1);
		mergeDuplicateAuthors(b2, a2);
		mergeDuplicateAuthors(b3, a3);
		mergeDuplicateAuthors(b4, a4);
		mergeDuplicateAuthors(b5, a5);

		// System.out.println(ht.values());

		for (Map.Entry<Book, Author> entry : ht.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}

		System.out.println("");

		ht.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		});

//		for (Author a : ht.values()) {
//			System.out.println(a);
//		}

	}

	public static void mergeDuplicateAuthors(Book b, Author a) {

		if (b == null || a == null)
			return;
		
		if (ht.containsKey(b)) {

			Author existingValue = ht.get(b);

			String newAuthor = existingValue + "" + a.getName();

			Author newAuth = new Author(newAuthor);

			ht.put(b, newAuth);
		} else {
			ht.put(b, a);
		}
	}

}
