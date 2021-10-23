package inheritance;

import java.time.LocalDate;

public final class Manager extends Employee {

	private double bonus;

	public Manager(String name, double salary, LocalDate hireDate) {
		super(name, salary, hireDate);
		bonus = 0;
		// TODO Auto-generated constructor stub
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double getSalary() {

		double baseSalary = super.getSalary();

		return baseSalary + getBonus();
	}

	@Override
	public boolean equals(Object aManager) {

		if (aManager == null)
			return false;
		if (aManager.getClass() != this.getClass())
//		if (!(aManager instanceof Manager))
			return false;

		Manager m = (Manager) aManager;

		boolean isEqual = m.getName().equals(this.getName()) && m.getSalary() == this.getSalary();

		// && m.getHireDate().equals(this.getHireDate())

		return isEqual;
	}

}
