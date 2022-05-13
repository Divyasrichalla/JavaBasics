package com.org.practice.java.basics;

public class PracticeVariables {
	public static void main(String[] args) {
		System.out.println("Practicing types of variables or datatype");
		int number = 1934;
		Long longNum = 1234L;
		long myLong = 123;
		float myFloat = 4565.913f;
		Float floatNum = 345.998293f;
		char c = 'D';
		double myDouble = 87452;
		byte byteNum = 123;
		boolean myBoolean = true;
		short myShort = 546;
		System.out.println(number);
		System.out.println(longNum);
		System.out.println(myBoolean);
		System.out.println(myDouble);
		System.out.println(c);
		System.out.println(myShort);
		System.out.println(myFloat);
		System.out.println(myLong);
		System.out.println(floatNum);
		System.out.println(byteNum);

		Integer i = 10;
		Integer i1 = 10;
		System.out.println(i==i1);//t
		Integer in = 137;
		Integer in1 = 137;
		System.out.println(in==in1);//fa
		int a = 137;
		int b = 137;
		System.out.println(a==b);//t
		System.out.println(i.equals(i1));//t
		System.out.println(i.equals(in));//f
		System.out.println(in1.equals(in));//tr
		System.out.println("137".equals(in));//tr
		System.out.println(in1==in);//tr
		add(123);
		add(1.02,1.998f);



	}
	public static float add(float f) {
		return f+f;
	}

	public static void add(double d, float f){
		System.out.println("adding double and float");
	}
	public static void add(float f, double d){
		System.out.println("adding float and double");
	}
}
