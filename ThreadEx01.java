package com.training.sdet.day4.threads;

class MyBusinessLogic extends Thread {
	//simulate some time
	public void run(){
		for (int i =0; i < 500; i++){
			System.out.println("value of "+ i +" " + Thread.currentThread().getName());
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread " + Thread.currentThread().getName () +"Existing");
	}
}


public class ThreadEx01 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); //check if there is a thread
		
		MyBusinessLogic mbl = new MyBusinessLogic();
		//mbl.run();
		mbl.start();
		MyBusinessLogic mbl2 = new MyBusinessLogic();
		//mbl2.run();
		mbl2.start();
		MyBusinessLogic mbl3 = new MyBusinessLogic();
		//mbl3.run();
		mbl3.start();
		
		try {
			mbl.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			mbl2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			mbl2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of main"); //cos of join method this one is printed at the end 
	}
}

