package employee_test_ishmael;

import java.util.Comparator;

public class SortEmployeeAscending implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		double compareResult = e1.getSalary() - e2.getSalary();

		if (compareResult == 0)
			return 0;
		else if (compareResult > 0)
			return 1;
		else
			return -1;
	}

}
