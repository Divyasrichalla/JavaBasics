package com.org.practice.java.basics.exceptionhandling;


import java.io.IOException;

public class TestThrows1{
	void m() throws IOException {
		throw new IOException("device error");
	}
	void n() throws IOException{
		m();
	}
	void p(){
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}

	public static void main(String[] args) throws IOException {
		TestThrows1 t1 = new TestThrows1();
		t1.p();
		System.out.println("Exception handled !!!...working fine....");

	}
}