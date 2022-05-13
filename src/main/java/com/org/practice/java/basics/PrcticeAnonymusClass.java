package com.org.practice.java.basics;

import javax.crypto.Mac;

class Machine{
	public void start(){
		System.out.println("Machine Started!!!");
	}
}

public class PrcticeAnonymusClass {
	public static void main(String[] args) {
		Machine machine = new Machine();
		machine.start();
		Machine mac = new Machine(){
			@Override
			public void start() {
				System.out.println("Application Satarted!!!!");
			}
		};
		mac.start();
	}
}
