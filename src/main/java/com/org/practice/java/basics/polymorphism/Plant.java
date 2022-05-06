package com.org.practice.java.basics.polymorphism;

public class Plant {

	public void grow(){
		System.out.println("Plant Growing!!!");
	}

	//polymorphism -- method overloading
	public void shedLeaves(){
		System.out.println("Leaves Sheding from plant");
	}

	public void shedLeaves(String season){
		System.out.println("Shed leaves in "+season);
	}
}
