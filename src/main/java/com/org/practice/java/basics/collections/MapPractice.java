package com.org.practice.java.basics.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();
		getData(map);
		getData(linkedHashMap);
		getData(treeMap);//sort the data numerical order --sorted map
		}
	public static void getData(Map<Integer, String> map){
		map.put(5,"FIVE");
		map.put(6,"six");
		map.put(15,"fifteen");
		map.put(7,"Seven");
		map.put(4,"Four");
		map.put(1,"one");
		map.put(9,"Nine");
		map.put(9,"Nine");
		String s = map.get(9);
		System.out.println(map);
		System.out.println(map.entrySet());
		for(Map.Entry<Integer,String> entry:map.entrySet()){
			int i = entry.getKey();
			String txt = entry.getValue();
			System.out.println("Key: "+i+" , value: "+txt);
		}
	}
}
