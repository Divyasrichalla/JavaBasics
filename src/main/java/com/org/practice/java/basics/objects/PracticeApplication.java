package com.org.practice.java.basics.objects;

import javax.swing.*;

class Vehicle{
	public int noOfWheels;
	Vehicle(){
		System.out.println("Default constructor of Vehicle");
	}

}

class Car extends Vehicle{
	private String name;
	private int version;
	private Boolean start;


	Car(){
		System.out.println("Default constructor");
	}
	Car(String name, int version, boolean start){
		this.name = name;
		this.version = version;
		this.start = start;
		if(start==true)
		start();
	}

	public String getName(){
		return name;
	}
	void start(){
		System.out.println( name+" Car Started!!!");
	}
}
public class PracticeApplication {
	public static void main(String[] args) {
		Car car = new Car();
		Vehicle vehicle = new Vehicle();

		Car c = new Car("Benz",14,true);
	}
}
