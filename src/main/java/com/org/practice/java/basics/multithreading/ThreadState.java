package com.org.practice.java.basics.multithreading;

class ABC implements  Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try{
			Thread.sleep(200);
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}


public class ThreadState implements Runnable{

	@Override
	public void run() {
		ABC abc = new ABC();
		Thread t2 = new Thread(abc);
		System.out.println("The state of thread t2 after inoking it - "+ t2.getState());
		t2.start();
		System.out.println("The state of thread t2 after starting it - "+ t2.getState());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The state of thread t2 after invoking sleep method - "+ t2.getState());
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The state of thread t2 after completing the execution - "+ t2.getState());
	}

	public static void main(String[] args) {

		ThreadState obj = new ThreadState();
		Thread t1 = new Thread(obj);
		System.out.println("t1 thread state after invoking it - "+t1.getState());
		t1.start();
		System.out.println("T1 thread state after starting the thread-"+t1.getState());
	}
}
