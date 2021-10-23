package cloning_1.deep;


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

	@Override
	protected Object clone() throws CloneNotSupportedException {

		MyClass m = (MyClass) super.clone();
		m.setAddress((MyAddress) address.clone());

		return m;

	}

	public MyAddress getAddress() {
		return address;
	}

	public void setAddress(MyAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {

		return "name: " + getName() + ", address: " + getAddress();
	}

}
