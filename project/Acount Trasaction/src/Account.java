
public class Account {
	private String accountNumber ;
	private int balance ;
	
	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int transactionAmount) {
		int total = balance + transactionAmount ;
		System.out.println("Your balance after the transaction is : "+ total);
		
	}
	
	public void withdraw(int transactionAmount) {
		int total = balance - transactionAmount ;
		System.out.println("Your balance after the transaction is : "+ total);
	}
	
	
	

}
