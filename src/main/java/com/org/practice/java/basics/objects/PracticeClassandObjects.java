package com.org.practice.java.basics.objects;

class Person{
	// Instance Variables
	String name;
	int age;
	String maritalStatus;
	static String husbandName;
}
// we can have many classes in one java class but only one public class
class Address{
	String areaName;
	String districtName;
	int pincode;
}



public class PracticeClassandObjects {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Divya";
		p.age = 27;
		p.maritalStatus = "married";
		Person.husbandName = "Naveen";
		System.out.println(Person.husbandName);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.maritalStatus);
		Address address = new Address();
		address.areaName = "Sai Ram colony";
		address.districtName = "GUNTUR";
		address.pincode = 522003;
		System.out.println(address.areaName);
		System.out.println(address.districtName);
		System.out.println(address.pincode);
	}

}
//two types of variable -static and Instance
//Instance variables can access with object
//Static variables can access with class name

