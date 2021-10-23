package polymorphism.Assignment4_3.employeeinfo;

public class RetirementAccount extends Account {

	public RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}

	@Override
	public boolean makeWithdrawal(double amount) {
		// implement

		if (amount <= getBalance()) {
			double balance = getBalance();

			balance -= amount + (0.02 * balance);
			return true;
		}
		return false;
	}
}
