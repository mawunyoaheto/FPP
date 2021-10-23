package employee_test_ishmael;

import java.util.Arrays;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Joseph Leman", 29, 6500.00);
		Employee emp2 = new Employee("Andy Sharp", 39, 4500.00);
		Employee emp3 = new Employee("Bernard Gun", 33, 8500.00);
		Employee emp4 = new Employee("Amenyo Aheto", 34, 5500.00);
		Employee emp5 = new Employee("Elaine Guthrie", 29, 9500.00);

		Employee[] allEmployees = { emp1, emp2, emp3, emp4, emp5 };

		for (Employee e : allEmployees) {
			System.out.println(e);
		}

		Arrays.sort(allEmployees);

		System.out.println("\n***************Sorting with compareTo***************");
		for (Employee e : allEmployees) {
			System.out.println(e);
		}

		Arrays.sort(allEmployees, new SortEmployeeAscending());

		System.out.println("\n***************Sorting with comparator***************");
		for (Employee e : allEmployees) {
			System.out.println(e);
		}

	}

}
