package com.org.practice.java.basics.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingPractice {
	public static void main(String[] args)  {
		File file = new File("/resources/test.txt");
		try {
			FileReader fileReader = new FileReader(file);
			String text=System.console().readLine();
			System.out.println("executing the code.....");
		} catch (FileNotFoundException e) {
			System.out.println("File is not found : "+file);
		}
	}
}
