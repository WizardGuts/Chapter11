import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	Account() {
		this(0, 0);
	}

	Account(int newId, double newBalance) {
		this.id = newId;
		this.balance = newBalance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	public void setId(int newId) {
		this.id = newId;
	}

	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}

	public void setAnnualInterestRate(double newAnnualInterestRate) {
		this.annualInterestRate = newAnnualInterestRate;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public String getDateCreated() {
		return dateCreated.toString();
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public String toString() {
		return "Account Statement" + "\nAccount ID: " + id + "\nDate Created: " + getDateCreated() + "\nBalance " + String.format("%.2f", balance) + "\nMonthly Interest: " + String.format("%.2f", getMonthlyInterest());
	}
}