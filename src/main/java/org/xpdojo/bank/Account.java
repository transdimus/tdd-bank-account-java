package org.xpdojo.bank;

public class Account {
	private int balance = 0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void addBalance(int balance) {
		this.balance += balance;
	}

	public void transferFunds(Account targetAccount, int balance) {
		targetAccount.addBalance(balance);
		this.balance -= balance;
	}
	
}
