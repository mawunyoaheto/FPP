package cloning_1.deep;

public class MyAddress implements Cloneable {

	private String state;
	private int zipcode;

	public MyAddress(String state, int zipcode) {
		super();
		this.state = state;
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {

		return "state: " + getState() + ", zip code: " + getZipcode();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}
