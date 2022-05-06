package com.org.practice.java.basics.polymorphism;

public class Garden {
	public static void main(String[] args) {
		Plant plant = new Plant();
		Tree tree = new Tree();
		Plant plant1 = new Tree();
		plant.grow();
		plant1.grow();
		tree.grow();
		tree.shedLeaves();
		plant.shedLeaves();
		tree.growFlowers();
		doGrow(plant1);
		doGrow(tree);
		doGrow(plant);
		plant1.shedLeaves("spring");
	}
	public static void doGrow(Plant plant){
		System.out.println("executing do grow method");
		plant.grow();
	}
}
