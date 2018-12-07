package com.training.sdet.day4.threads;


class OtherClass{
	
}

class MyClass extends OtherClass implements Runnable {
	
	private Thread t;
	private String threadName;
	
	public MyClass (){
		
	}
	public MyClass (String threadName, int priority ){
		
		t = new Thread(this, threadName);
		
		t.setPriority(priority);
		// the OS level thread is created 
		// and control is given for run() in b/n it goes to scheduler
		
		t.start();
	}
	public void run(){
		for (int i =0; i < 500;i++){
			print(i);
		}
		System.out.println("Thread "+ Thread.currentThread() +"exiting");
	}
	public void print(int i){
		System.out.println("i value in " + Thread.currentThread().getName() +", " +i);
	}
}
public class ThreadEx02 {
	public static void main(String[] args) {
		MyClass m1 = new MyClass("Messi",Thread.NORM_PRIORITY +1);
		MyClass m2 = new MyClass("Kaan",Thread.NORM_PRIORITY +2);
		MyClass m3 = new MyClass("Desta",Thread.NORM_PRIORITY);
		
		MyClass m4 = new MyClass();
		Thread t = new Thread(m4);
		//Thread t = new Thread(new MyClass()); i can also write the above two codes like this 
		t.setName("Kiflom");
		t.setPriority(10);
		t.start();
	}
}
