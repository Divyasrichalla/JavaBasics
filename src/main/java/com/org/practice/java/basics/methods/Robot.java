package com.org.practice.java.basics.methods;

public class Robot {
	private String name;
	private int age;
	private double capacity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	String speak(){
		return "Hello.. This is "+getName()+", "+getAge()+" years old";
	}

	String speak(String text){
		return text;
	}

}
