package innerclasses;

import java.time.LocalDate;
import java.util.Arrays;


public class EmployeeData {

	EmployeeData() {

	}

	static Employee[] prepareData() {

		Employee[] employees = { new Employee("Raymond", 15000.00, LocalDate.of(2020, 10, 1)),
				new Employee("Alemu", 18000.00, LocalDate.of(2020, 10, 01)),
				new Employee("Woldermihael", 12000.00, LocalDate.of(2021, 8, 01)) };
		return employees;
	}

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		EmployeeData empData = new EmployeeData();

		Employee[] employees = prepareData();
		
		// Arrays.sort(employees, new Employee.SalaryComparator());
		emp.sort(employees);
		
		System.out.println(Arrays.toString(employees));

	}

}
