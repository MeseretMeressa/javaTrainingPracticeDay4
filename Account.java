package com.training.sdet.day4.threads;

public class Account {
	private int balance;
	
	//this is to be got from db
	public Account (int balance){
		this.balance = balance;
			}
	
	public synchronized void withdraw(int amount){
		
		if (amount < balance ){
			System.out.println("Amount withdraw "+ amount + "b y" + Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);} catch (InterruptedException e){
					e.printStackTrace();
				}
			balance = balance - amount;
			System.out.println(" Remaining balance after " + balance);
			} else {
				
				System.out.println("Sorry :" + Thread.currentThread().getName() + "You don't have balance  :" + balance);
			}
		}
	}

