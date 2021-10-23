package polymorphism.Assignment4_3.employeeinfo;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

import polymorphism.Assignment4_3.MyStringList;

public class Employee {

	private AccountList accounts = new AccountList();
	private MyStringList acctTypes;
	private String name;
	private LocalDate hireDate;

	private String[] str;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		/*
		 * update, using LocalDate GregorianCalendar cal = new
		 * GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire); hireDate =
		 * cal.getTime();
		 */
		// GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1,
		// dayOfHire);

		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = LocalDate.of(cal.get(Calendar.YEAR), 1 + cal.get(Calendar.MONTH), cal.get(Calendar.DATE));
	}

	public void createNewChecking(double startAmount) {
		// implement

		Account acct = new CheckingAccount(this, startAmount);
		accounts.add(acct);
	}

	public void createNewSavings(double startAmount) {
		// implement

		// savingsAcct.makeDeposit(startAmount);

		Account acct = new SavingsAccount(this, startAmount);
		accounts.add(acct);

	}

	public void createNewRetirement(double startAmount) {
		// implement

		// retirementAcct.makeDeposit(startAmount);

		Account acct = new RetirementAccount(this, startAmount);
		accounts.add(acct);

	}

	public String getFormattedAcctInfo() {
		// implement

		String validFormattedAccts = "";
		// Iterator itr = accounts.iterator();
		for (int i = 0; i < accounts.size(); i++) {

			validFormattedAccts += accounts.get(i).toString();
		}

		return validFormattedAccts;
	}
	public void deposit(int acctIndex, double amt) {

		Account selected = accounts.get(acctIndex);
		selected.makeDeposit(amt);

	}

	public boolean withdraw(int acctIndex, double amt) {

		Account selected = accounts.get(acctIndex);
		
		
		if (selected.makeWithdrawal(amt))
			return true;
			
		else {
			return false;
			}

	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {

		return hireDate;
	}

	public String[] getNamesOfAccounts() {


		acctTypes= new MyStringList();
		
		for (int i = 0; i < accounts.size(); i++) {

			acctTypes.add(accounts.get(i).getAcctType().toString());

		}

		str = new String[acctTypes.size()];
		for (int j = 0; j < acctTypes.size(); j++) {


			// Assign each value to String array
			if (acctTypes.get(j) != null)
				str[j] = acctTypes.get(j);
			else
				break;
		}

		return str;
	}

}
