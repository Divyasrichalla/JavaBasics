package com.org.practice.java.basics.exceptionhandling;

public class FileNameException extends Exception {
	FileNameException(String s){
		super(s);
		System.out.println("Entered file name is not found");
	}
}
