package comparator;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product>, Cloneable {

	private String name;
	private String brand;
	private double price;
	private double weight;
	private ProductCategory category;

	public Product() {

	}

	public Product(String name, String brand, double price) {
		super();

		this.name = name;
		this.brand = brand;
		this.weight = 0.00;
		this.price = price;
		// this.category.setDescription("default");
	}

	public Product(String name, String brand, double price, double weight, ProductCategory category) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.weight = weight;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	@Override
	public String toString() {

		return "Product name: " + getName() + ", " + "brand: " + getBrand() + ", " + "Price: " + getPrice() + ", "
				+ "weight: " + getWeight() + ", " + "Category: " + getCategory();
	}
	
	
	@Override
	public boolean equals(Object aProduct) {
		
		if(aProduct==null)
			return false;
		
		if(!(aProduct instanceof Product))
			return false;

		Product p = (Product) aProduct;

		return name.equals(p.name) && brand.equals(p.brand);
	}

	class NameComparator implements Comparator<Product> {

		@Override
		public int compare(Product o1, Product o2) {

			return o1.getName().compareToIgnoreCase(o2.getName());
		}

	}

	static class BrandComparator implements Comparator<Product> {

		@Override
		public int compare(Product o1, Product o2) {

			return o1.getBrand().compareToIgnoreCase(o2.getBrand());
		}

	}

	@Override
	public int compareTo(Product other) {
		if (other == null)
			return -1;

		int compareToResult = this.name.compareTo(other.getName());

		if (compareToResult == 0) {
			return this.brand.compareTo(other.getBrand());
		} else {
			return compareToResult;
		}

	}

	@Override
	public int hashCode() {

		return Objects.hash(name, brand);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
