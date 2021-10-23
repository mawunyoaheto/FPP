package inheritance.test;

public class Author extends Person {
	private int numberOfBooks;

	public Author() {
		super("unknown Author", 35, "queer");
		this.numberOfBooks = 1;
	}

	public Author(String name, int age, String gender, int numberOfBooks) {
		super(name, age, gender);
		this.numberOfBooks = numberOfBooks;
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Author))
			return false;

		Author a = (Author) obj;
		return this.numberOfBooks == a.getNumberOfBooks();
	}

	@Override
	public String toString() {

		return super.toString() + " no. of books: " + getNumberOfBooks();
	}

	@Override
	public int compareTo(Person o) {
		if (o == null)
			return -1;
		Author a = (Author) o;

		return this.numberOfBooks - a.getNumberOfBooks();
	}

}
