package employee_test_ishmael;

public class Employee implements Comparable<Employee> {

	private String name;
	private int age;
	private double salary;

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {

		return "[" + "name: " + getName() + ", Age: " + +getAge() + ", Salary: " + getSalary() + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof Employee))
			return false;
		Employee e = (Employee) o;

		return this.getName().equals(e.getName());
	}

	@Override
	public int compareTo(Employee o) {
		if (o == null)
			return -1;
		return this.getName().compareTo(o.getName());
	}
}
