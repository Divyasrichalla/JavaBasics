package com.org.practice.java.basics.polymorphism;

public class Tree extends Plant {

	//Inheritence - method overriding
	@Override
	public void grow() {
		System.out.println("Tree Growing!!!!");
	}

	public void growFlowers(){
		System.out.println("Flowers ******$$$$$******");
	}

	public void shedLeaves(String season){
		System.out.println("Shed leaves in "+season);
	}
}
