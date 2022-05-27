package com.org.practice.java.basics.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//List<String> newList = new ArrayList();
		//adding
		list.add(10);
		list.add(100);
		list.add(50);
		list.add(40);
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

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(null);
		list1.add(null);
		list1.add(null);
		System.out.println("Size of the list if we add null :"+list1.size());
		Map<String , String> m = new HashMap<>();
		m.put("A","B");
		m.put("A","c");
		m.put("A",m.put("A","c"));

		for(String s: m.keySet()){
			System.out.println(s+":"+m.get(s));
		}

	}
}
