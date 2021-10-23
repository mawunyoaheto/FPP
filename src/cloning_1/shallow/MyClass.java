package cloning_1.shallow;

public class MyClass implements Cloneable {

	private String name;
	private MyAddress address;

	public MyClass() {
		name = "Raymond";
		address = new MyAddress("Ohio", 43214);
	}

	public MyClass(String name, MyAddress address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyAddress getAddress() {
		return address;
	}

//	public void setAddress(MyAddress address) {
//		this.address = address;
//	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}


	@Override
	public String toString() {

		return "name: " + getName() + ", address: " + getAddress();
	}

}
