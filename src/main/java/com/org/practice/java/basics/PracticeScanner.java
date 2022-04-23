package com.org.practice.java.basics;


import java.util.Scanner;

public class PracticeScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		PracticeLoops.ifLoop(number);
		PracticeLoops.whileLoop(number);
		PracticeLoops.doWhileLoop(number);
	}
}
