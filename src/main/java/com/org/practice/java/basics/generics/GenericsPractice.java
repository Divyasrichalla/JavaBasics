package com.org.practice.java.basics.generics;


import java.util.ArrayList;

class Machine{
	@Override
	public String toString() {
		return "I am a Machine";
	}
}

class Camera extends Machine{
	@Override
	public String toString() {
		return "I am a Camera";
	}
}
public class GenericsPractice {
	public static void main(String[] args) {
		ArrayList<Machine> list = new ArrayList<Machine>();
		list.add(new Machine());
		list.add(new Machine());
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		list2.add(new Camera());
		list2.add(new Camera());
		System.out.println(list);
		System.out.println(list2);
		showList(list);
		showList(list2);

	}

	public static void showList(ArrayList<?> list){
		for(Object obj : list){
			System.out.println(obj);
		}
	}
}
