package com.org.practice.java.basics.exceptionhandling;

public class TestCustomExceptions {
	public static void validate(int age) throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("age not valid");
		else
			System.out.println("Eligible to vote");
	}

	public static void main(String[] args) {
		try {
			validate(13);
		} catch (Exception e) {
			System.out.println("Exception occured:"+e+"\n Invalid age to vote");
		}
		System.out.println("rest of the code");
	}

}

class InvalidAgeException extends Exception{
	InvalidAgeException(String s) {
		super(s);
	}
}
