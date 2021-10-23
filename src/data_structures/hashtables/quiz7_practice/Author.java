package data_structures.hashtables.quiz7_practice;

public class Author {

	private String name;

	public Author(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {

		// return "name: " + getName();
		return getName();
	}

}
