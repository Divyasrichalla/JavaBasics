package com.org.practice.java.basics.collections;

import java.util.ArrayList;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//List<String> newList = new ArrayList();
		//adding
		list.add(10);
		list.add(100);
		list.add(50);
		list.add(40);
		//retriving
		System.out.println(list.get(2));
		//iterating
		System.out.println("Iterating the list using basic for loop!!!");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		//removing the item from list
		list.remove(0);
		System.out.println("Iterating the list using enhanced for loop...!!");
		for(int j :list){
			System.out.println(j);
		}
	}
}
