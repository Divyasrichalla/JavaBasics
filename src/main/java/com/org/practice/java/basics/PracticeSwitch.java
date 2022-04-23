package com.org.practice.java.basics;

import java.util.Scanner;

public class PracticeSwitch {
	public static void main(String[] args) {
		System.out.println("Executing Switch:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = sc.nextLine();
		switch (text){
			case "start":
				System.out.println("Started");
				break;
			case "stop":
				System.out.println("Stopped");
				break;
			case "run":
				System.out.println("Running");
				break;
			default:
				System.out.println("Invalid text");
		}
	}
}
