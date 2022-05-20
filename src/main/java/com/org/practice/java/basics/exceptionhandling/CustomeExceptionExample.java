package com.org.practice.java.basics.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CustomeExceptionExample {
	public static void openFile(String s) throws FileNameException {
		if(s.contains("@"))
			throw new FileNameException("File name is not valid");
		else
			System.out.println("opening the file");
	}

	public static void main(String[] args) {
		try {
			openFile("test.txt");
			System.out.println("Executing the remaining code.....");
		} catch (FileNameException e) {
			System.out.println("Exception occured: "+e);
		}
	}
}
