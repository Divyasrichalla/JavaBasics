package com.test.java.org;

public class Car extends Vehicle{
	Car(){
		this("1");
		System.out.println("default constructor of car");
	}
	Car(String name){
		super(1324);
		System.out.println(name+" "+ "car constructor executed");
	}
	public static void main(String[] args) {
		System.out.println("executing default constructor at the time of object creation");
		Car car = new Car();
		Car car1 = new Car("Santro");
	}
}
