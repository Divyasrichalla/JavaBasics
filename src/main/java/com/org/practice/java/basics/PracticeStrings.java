package com.org.practice.java.basics;

public class PracticeStrings {
	public static void main(String[] args) {
		String s = new String();
		String text = "";
		text = "Divya Loves";
		System.out.println(text);
		text = " Naveen";
		System.out.println(text);
		StringBuilder sb = new StringBuilder("");
		sb.append("Hi, this is Divya!!!");
		sb.append(" hw r u???").append(" am gd");
		System.out.println(sb);
		String s1 = new String(sb);
		String s2 = String.valueOf(sb);
		System.out.print("Hello Naveen!! \tHw r U?? \ndo u love me??\n");
		System.out.printf("Hello Divya!! \t%s \n%12s","yes","Yes, i do");
	}
}
