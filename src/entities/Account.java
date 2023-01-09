package entities;

public class Account {

	private String nameHolder;
	private int accountNumber;
	private double accountBalance;

	public Account(String nameHolder, int accountNumber, double initialDeposit) {
		this.nameHolder = nameHolder;
		this.accountNumber = accountNumber;
		deposit(initialDeposit);
	}
	
	public Account(String nameHolder, int accountNumber)
	{
		this.nameHolder = nameHolder;
		this.accountNumber = accountNumber;
	}

	public String getNameHolder() {
		return nameHolder;
	}

	public void setNameHolder(String nameHolder) {
		this.nameHolder = nameHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}	
	
	public double getAccountBalance() {
		return accountBalance;
	}

	public double withdraw(double ammount) {
		return accountBalance -= ammount + 5.00;
	}

	public double deposit(double ammount) {
		return accountBalance += ammount;
	}

	public String toString() {
		return "Account: " 
				+accountNumber
				+", Holder: "
				+nameHolder
				+ ", Balance: "
				+String.format("%.2f%n", accountBalance);
	}

}
