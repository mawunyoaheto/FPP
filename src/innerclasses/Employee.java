package innerclasses;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Employee {

	private String name;
	private double salary;
	private LocalDate hireDate;

	public Employee() {
		super();
	}

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

	public void sort(Employee[] emp) {
		class NameComparator implements Comparator<Employee> {

			@Override
			public int compare(Employee o1, Employee o2) {

				return o2.getName().compareTo(o1.getName());
			}

		}

		Arrays.sort(emp, new NameComparator());
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
	
	
	// static inner class implementation
	static class SalaryComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee e1, Employee e2) {
			// return (int) (e2.getSalary() - e1.getSalary());

			if (e1.getSalary() == e2.getSalary())
				return 0;
			else if (e1.getSalary() < e2.getSalary())
				return 1;
			else
				return -1;

		}

		
	}



}
