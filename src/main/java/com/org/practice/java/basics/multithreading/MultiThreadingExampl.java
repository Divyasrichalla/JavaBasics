package com.org.practice.java.basics.multithreading;

public class MultiThreadingExampl {
	public static void main(String[] args) throws InterruptedException {
		MyOwnThread mt = new MyOwnThread();
		//mt.setName("Dibbi-Thread");
		Thread thread = Thread.currentThread();
		System.out.println("Main method called by "+thread.getName());
		//mt.run();
		mt.start();
		new MyOwnThread().start();
		new MyOwnThread().start();
		new MyOwnThread().start();
		new MyOwnThread().start();
		new MyOwnThread().start();

	}
}



class MyOwnThread extends Thread{
	MyOwnThread(){
		super("Divythrad");
	}
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Thread running...!!");
			Thread thread = Thread.currentThread();
			System.out.println("My thread class called by " + thread.getName());
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
	}
}

