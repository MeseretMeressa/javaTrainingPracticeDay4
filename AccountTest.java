package com.training.sdet.day4.threads;

public  class AccountTest implements Runnable {
	private Account account ;
	private int amount;
	private Thread t;
	
	@Override
	public void run() {
		///synchronized (account) {  // if u don't use Synchronized in the method in the account class use it her it will give the same 
			account.withdraw(amount);
			// TODO Auto-generated method stub
		//}
		
	}
	public AccountTest(Account account , int amount, String customerName){
		
		this.account = account;
		this.amount = amount;
		t = new Thread (this, customerName);
		t.start();
		
				
	}
	public static void main(String[] args) {
		Account account = new Account(1000);
		new AccountTest(account, 500, "messi");
		new AccountTest(account, 750, "kaan");
		
	}
}
