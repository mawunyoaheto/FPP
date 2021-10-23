package inheritance.test;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	private String gender;

	public Person() {
		super();
		this.name = "unknown";
		this.age = 20;
		this.gender = "n/a";
	}

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Person))
			return false;
		Person p = (Person) obj;

		return this.name.equals(p.getName());
	}

	@Override
	public String toString() {

		return "name: " + getName() + " age: " + getAge() + " gender: " + getGender();
	}

	@Override
	public int compareTo(Person o) {
		if (o == null)
			return -1;
		return this.name.compareTo(o.getName());
	}

}
