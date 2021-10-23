package polymorphism.Assignment4_3.employeeinfo;

public class SavingsAccount extends Account {

	private final static double MONTHLY_INTEREST = 0.25;

	public SavingsAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}

	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = MONTHLY_INTEREST * baseBalance;
		return baseBalance + interest;
	}

}
