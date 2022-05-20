package com.org.practice.java.basics.multithreading;

public class MyThreadExample implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread Started!!!!");
		Thread thread = Thread.currentThread();
		System.out.println("this thread is called by "+thread.getName());
		System.out.println("priority of the thread: "+thread.getPriority());
	}

	public static void main(String[] args) {
		Thread thread1 = Thread.currentThread();
		System.out.println("Main thread is called by "+thread1.getName());
		System.out.println("priority of the thread: "+thread1.getPriority());
		//thread.run();
		Thread thread2 = new Thread(new MyThreadExample(),"Divy-Thread");
		thread2.start();
	}
}
