package com.org.practice.java.basics.inheritence;

public class PracticeInheritence {
	public static void main(String[] args) {
		Vehicle veh = new Vehicle();
		Bike bike = new Bike();
		Vehicle bikeVeh = new Bike();
		veh.showInfo();
		bike.showInfo();
		bikeVeh.showInfo();
		bike.start();
		//Single level inheritence
		Employee emp = new Employee();
		emp.salary = 50000;
		emp.address = "Guntur";
		emp.name = "VenaDivs";
		emp.phnNumber = 923516724;
		emp.specialization = "Java";
		emp.printSalary(emp.salary);
		//multilevel inheritence
		Manager man = new Manager();
		man.doWork();
		man.inspect();
		man.printSalary(1000000);

	}
}
