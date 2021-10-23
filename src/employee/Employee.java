package employee;

public class Employee {

	private String name;
//	private String firstName;
//	private String middleName;
//	private String lastName;
	// private Date dateOfBirth;
	private String ssnNo;
//	private Date hireDate;
	private double salary;

	public Employee(String firstName, String middleName, String lastName, String ssnNo, double salary) {
		super();
//		this.firstName = firstName;
//		this.middleName = middleName;
//		this.lastName = lastName;

		// this.dateOfBirth = dateOfBirth;
		this.ssnNo = ssnNo;
//		this.hireDate = hireDate;
		this.salary = salary;

		String name = firstName + " " + middleName + " " + lastName;

		this.name = name;

	}

	public Employee() {

	}

	public void setName(String name) {
		this.name = name;
	}

//	public void setDateOfBirth(Date dateOfBirth) {
//		this.dateOfBirth = dateOfBirth;
//	}

	public void setSsnNo(String ssnNo) {
		this.ssnNo = ssnNo;
	}

//	public void setHireDate(Date hireDate) {
//		this.hireDate = hireDate;
//	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String geName() {
		return name;
	}


//	public Date getDateOfBirth() {
//		return dateOfBirth;
//	}

	public String getSsnNo() {
		return ssnNo;
	}

//	public Date getHireDate() {
//		return hireDate;
//	}

	@Override
	public String toString() {

		return "[" + name + "," + salary + "]";

	}

}
