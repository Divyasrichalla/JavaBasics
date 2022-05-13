package com.org.practice.java.basics.arryas;

public class ArraysOfStrings {
	public static void main(String[] args) {
		String[] names = {"Div","Nav","Sri","Vena"};
		for(String name: names){
			System.out.println(name);
		}
		String[][] words = { {"Div","Nav","Sri","Vena"},{"413","407"},{"ECE","2012","2015"}};  // Good Practice Appreciated
		for(int i=0;i< words.length;i++){
			for(int j=0;j< words[i].length;j++){
				System.out.print(words[i][j] +" ");
			}
			System.out.println();
		}

	}
}
