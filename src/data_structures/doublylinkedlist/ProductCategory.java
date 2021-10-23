package data_structures.doublylinkedlist;

public class ProductCategory {
	private String description;

	public ProductCategory() {
		super();

		this.description = "Default";
	}

	public ProductCategory(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return getDescription();
	}
}
