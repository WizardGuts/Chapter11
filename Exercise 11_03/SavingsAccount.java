public class SavingsAccount extends Account {
	
	SavingsAccount() {
		super();
	}
	
	SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double amount) {
		if (getBalance() > amount) {
			setBalance(getBalance() - amount);
		}
		
		else {
			System.out.println("Overdrawn transaction.");
		}
		
	}
	
}