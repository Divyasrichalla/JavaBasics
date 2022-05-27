package com.org.practice.java.basics.collections;

import java.util.*;

public class SetExample {
	public static void main(String[] args) {
		Set<String > set = new TreeSet<>();
		if(set.isEmpty()){
			System.out.println("set is empty at start");
		}
		set.add("dog");
		set.add("cow");
		set.add("cat");
		set.add("camel");
		set.add("dog");
		set.add("cow");//it will not allow duplicates
		if(set.isEmpty()){
			System.out.println("set is empty at end");
		}
		System.out.println(set);
		if(set.contains("dog")){
			System.out.println("the given set contains dog");
		}
		for(String s:set){
			System.out.println(s);
		}
	}
}
