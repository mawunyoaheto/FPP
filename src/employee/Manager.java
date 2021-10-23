package employee;

import java.util.Date;

public class Manager extends Employee {

	private double bonus;

	public Manager(String firstName, String middleName, String lastName, Date dateOfBirth, String ssnNo, double salary,
			Date hireDate, double bonus) {
		super(firstName, middleName, lastName, ssnNo, salary);
		// TODO Auto-generated constructor stub
		this.bonus = bonus;

	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
