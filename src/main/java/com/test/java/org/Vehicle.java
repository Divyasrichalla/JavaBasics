package com.test.java.org;

public class Vehicle {
	/*Vehicle(){
		System.out.println("Vehicle Constructor");
	}*/
	int noOfWheels;
	Vehicle(int number){
		//this();

		System.out.println(number+": constructor of vehicle");
	}
	public static void main(String[] args) {
		System.out.println("Executing vehicle class constructor");
		//Vehicle vehicle = new Vehicle();
		Vehicle vehicle1 = new Vehicle(1);
	}
}
