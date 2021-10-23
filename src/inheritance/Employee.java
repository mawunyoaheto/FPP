package inheritance;

import java.time.LocalDate;


public class Employee extends SalaryComparator {

	private String name;
	private double salary;
	private LocalDate hireDate;

	public Employee(String name, double salary, LocalDate hireDate) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void raiseSalary(double percent) {

		double raise = getSalary() * (percent / 100);
		salary += raise;
	}

//	@Override
//	public int compare(Employee o1, Employee o2) {
//		if (o1.getSalary() == o2.getSalary())
//			return 0;
//		else if (o1.getSalary() < o2.getSalary())
//			return 1;
//		else
//			return -1;
//	}

	@Override
	public boolean equals(Object aEmployee) {
		if (aEmployee == null)
			return false;
		if (aEmployee.getClass() != this.getClass())
//		if (!(aEmployee instanceof Employee))
			return false;
		Employee e = (Employee) aEmployee;
		boolean isEqual = this.name.equals(e.name);
		// && this.hireDate.equals(e.hireDate) && this.salary == e.salary;
		return isEqual;
	}

	public String toString() {
		return "Name: " + getName() + " Salary: " + getSalary();
	}

}
