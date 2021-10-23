import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyEmployee {

	private String firstName;
	private String lastName;
	private Double salary;
	private LocalDate hireDate;

	public MyEmployee() {
		// TODO Auto-generated constructor stub
	}

	public MyEmployee(String firstName, String lastName, Double salary, LocalDate hireDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, hireDate, lastName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyEmployee other = (MyEmployee) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(hireDate, other.hireDate)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(salary, other.salary);
	}

	@Override
	public String toString() {
		
		return getFirstName() + " " + getLastName() + ", " + getSalary() + ", " + getHireDate();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		MyEmployee[] myStaff = new MyEmployee[{"Raymond", "Aheto", 1500.00, LocalDate.of(1975, 06, 04)},
//		                                      "Raymond", "Aheto", 1500.00, LocalDate.of(1975, 06, 04)]

		List<MyEmployee> staff = new ArrayList<MyEmployee>();

		staff.add(new MyEmployee("Raymond", "Aheto", 1500.00, LocalDate.of(1975, 06, 04)));
		staff.add(new MyEmployee("Stephen", "Aheto", 1500.00, LocalDate.of(1975, 06, 04)));
		staff.add(new MyEmployee("Lionel", "Aheto", 1500.00, LocalDate.of(1975, 06, 04)));

	}

}
