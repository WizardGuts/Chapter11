public class CheckingAccount extends Account {
	
	double overdraftLimit;
	
	CheckingAccount() {
		super();
		double overdraftLimit = -50;
	}
	
	CheckingAccount(double overdraftLimit, int id, double balance) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	private void setOverdraftLimit(double overdraftLimit) {
		overdraftLimit = this.overdraftLimit;
	}
	
	private double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void withdraw(double amount, double overdraftLimit) {
		if (getBalance() - amount > overdraftLimit) {
			setBalance(getBalance() - amount);
		}
		
		else {
			System.out.println("Overdraft limit exceeded.");
		}
	}
	
	public String toString() {
		return "\n" + super.toString() + "\nOverdraft limit is $" + String.format("%.2f", overdraftLimit);
	}
}