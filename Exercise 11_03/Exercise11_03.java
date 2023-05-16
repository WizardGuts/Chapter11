import java.util.Scanner;

public class Exercise11_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account account = new Account(1122, 20000);
		CheckingAccount checking = new CheckingAccount(-50, 1234, 20000);
		SavingsAccount savings = new SavingsAccount(2211, 2000);
		
		account.setAnnualInterestRate(4.5);
		checking.setAnnualInterestRate(4.5);
		savings.setAnnualInterestRate(4.5);
		
		account.withdraw(2500);
		checking.withdraw(2500);
		savings.withdraw(1999);
		
		checking.deposit(3000);
		account.deposit(3000);
		savings.deposit(3000);
		
		
		System.out.println(account.toString());
		System.out.println("\n" + checking.toString());
		System.out.println("\n" + savings.toString());
	}
}