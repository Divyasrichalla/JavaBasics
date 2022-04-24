package com.org.practice.java.basics.methods;

public class App {
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.setName("Naveen");
		robot.setAge(29);
		System.out.println(robot.speak());
		System.out.println(robot.speak("Hello Divya!! How r u..?"));

	}
}
