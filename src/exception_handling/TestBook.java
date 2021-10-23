package exception_handling;

public class TestBook {

	public static void main(String[] args) {

		// Book b1 = new Book("Johnathan",52);
		Book b1 = new Book();

		try {
			b1.setName("John");
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println(b1.toString());

	}

}
