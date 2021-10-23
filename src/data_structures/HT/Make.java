package data_structures.HT;

import java.util.Objects;

public class Make {
	private String make;
	
	public Make(String make) {
		this.make = make;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==null) return false;
		if(!(o instanceof Make)) return false;
		Make m = (Make) o;
		return m.make.equals(make);
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(make);
	}

	@Override
	public String toString() {

		return make;
	}

}
