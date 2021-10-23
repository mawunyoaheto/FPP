package inheritance;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager boss = new Manager("Emmanuel Aggrey", 6000.00, LocalDate.of(2021, 10, 01));
		boss.setBonus(8000.00);

		Employee[] emp = new Employee[4];

		emp[0] = new Employee("Benjamin Batte", 7500.00, LocalDate.of(2021, 10, 01));
		emp[1] = boss;
		emp[2] = new Employee("Raymond Aheto", 8500.00, LocalDate.of(2021, 9, 01));
		emp[3] = new Employee("Emmanuel Aggrey", 6000.00, LocalDate.of(2021, 10, 01));

		List<Employee> myList = Arrays.asList(emp[0], emp[2], boss);


		Collections.sort(myList, new SalaryComparator());

		System.out.println(emp[3].equals(boss));
		System.out.println(boss.equals(emp[3]));


//		boolean isTrue = (boss instanceof Employee);
//
//		System.out.println(isTrue);

		for (Employee e : myList) {

			// System.out.println("Name: " + e.getName() + " Salary: " + e.getSalary());
			System.out.println(e);
		}

	}

}
