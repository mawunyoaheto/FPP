package polymorphism.Assignment4_3.employeeinfo;

/**
 * Account.java is a class with a method to calculate area of a circle.
 * 
 * @author RMK Aheto
 * @version 01 September 2021
 */

class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	// private AccountType acctType;
	private Employee employee;

	public Account(Employee emp, double balance) {
		this.employee = emp;
		// this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp) {
	}

	public String toString() {
		return "Account type: " + getAcctType() + "\nCurrent bal: " + balance + "\n";
	}

	public void makeDeposit(double deposit) {
		// implement

		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement

		if (amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}

}
