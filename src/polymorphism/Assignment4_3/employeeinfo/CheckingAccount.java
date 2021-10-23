package polymorphism.Assignment4_3.employeeinfo;

public class CheckingAccount extends Account {

	// private AccountType accType;

	public CheckingAccount(Employee emp, double balance) {
		super(emp, balance);

		// this.accType = AccountType.CHECKING;
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}

	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();

		return baseBalance;
	}
}
