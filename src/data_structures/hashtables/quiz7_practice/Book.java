package data_structures.hashtables.quiz7_practice;

import java.util.Objects;

public class Book {
	private String title;
	private int iSBN;

	public Book(String title, int iSBN) {
		super();
		this.title = title;
		this.iSBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public int getiSBN() {
		return iSBN;
	}

	@Override
	public int hashCode() {

		return Objects.hash(title, iSBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Book))
			return false;

		Book b = (Book) obj;

		return title.equals(b.getTitle()) && iSBN == b.getiSBN();
	}

	@Override
	public String toString() {

		return "Title: " + getTitle() + ", ISNB: " + getiSBN();
	}

}
