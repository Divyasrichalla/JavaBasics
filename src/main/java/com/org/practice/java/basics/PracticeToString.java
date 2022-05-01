package com.org.practice.java.basics;


class Animal{
	private int rollNum;
	private String name;

	Animal(int num, String name){
		this.rollNum = num;
		this.name = name;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(rollNum).append(": ").append(name);
		return sb.toString();
	}
}

public class PracticeToString {
	public static void main(String[] args) {
		Animal animal = new Animal(7,"Dog");
		System.out.println(animal);
	}
}
