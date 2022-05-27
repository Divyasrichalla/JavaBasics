package com.org.practice.java.basics.collections;

import java.util.*;

public class SortingExmpl {
	public static void main(String[] args) {
		///sorting strings/////
		List<String> animals = new ArrayList<>();
		animals.add("cat");
		animals.add("dog");
		animals.add("bear");
		animals.add("tiger");
		animals.add("elephant");
		animals.add("snake");
		//Collections.sort(animals, new StringLengthComparator());
		Collections.sort(animals, new AlphabeticalComparator());
		System.out.println("after sorting alphabeticl order");
		for (String s : animals){
			System.out.println(s);
		}
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		System.out.println("after sorting reverse alphabaticl");
		for (String s : animals){
			System.out.println(s);
		}
		/////sorting integers////
		System.out.println("sorting numbers");
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(32);
		list.add(13);
		list.add(7);
		list.add(69);
		list.add(16);
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return -i1.compareTo(i2);
			}
		});
		for (int i:list){
			System.out.println(i);
		}
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(123,"Sri"));
		employeeList.add(new Employee(12,"Div"));
		employeeList.add(new Employee(125,"Nav"));
		employeeList.add(new Employee(126,"Vena"));
		Collections.sort(employeeList, new Comparator<Employee>() {
			/*//sorting based on id//
			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.getId()>e2.getId()){
					return 1;
				}
				else if(e1.getId() < e2.getId()){
					return -1;
				}
				return 0;
			}*/
			//sorting based on name
			public int compare(Employee e1, Employee e2) {
				return -e1.getName().compareTo(e2.getName());
			}
		});
		for(Employee emp:employeeList){
			System.out.println(emp);
		}

	}
}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1>len2){
			return 1;
		}
		else if(len1<len2){
			return -1;
		}
		return 0;
	}
}

class AlphabeticalComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
}

class ReverseAlphabeticalComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
}

class Employee{
	private int id;
	private String name;

	public Employee(int id, String name){
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString(){
		return  name;
	}
}