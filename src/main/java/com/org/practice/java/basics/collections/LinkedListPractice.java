package com.org.practice.java.basics.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<>();
		List<Integer> lList = new LinkedList<>();

		doTimings("Array List",aList);
		doTimings("Linked List",lList);

	}

	public static void doTimings(String s, List<Integer> list){
		System.out.println(s+" of elements");
		long start = System.currentTimeMillis();
		for(int i=0;i<1E5;i++){
			list.add(0, i);
		}
		for(int i=0;i<1E5;i++){
			list.add(0, i);
		}
		//list.add(0,12);
		long end = System.currentTimeMillis();
		System.out.println("Time Taken: "+(end-start)+"ms for type "+s);
	}
}
