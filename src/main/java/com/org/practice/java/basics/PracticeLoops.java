package com.org.practice.java.basics;

public class PracticeLoops {
	public static void main(String[] args) {
		int num = 5;
		int i=0;
		ifLoop(num);
		whileLoop(i);
		doWhileLoop(i);
		forLoop();
	}

	public static void ifLoop(int num){
		System.out.println("executing if");
		if(num<4){
			System.out.println(num + " is less than four");
		}
		else if(num>10){
			System.out.println(num+" is greater than 10 ");
		}
		else{
			System.out.println(num+" is not satisfying the above conditions");
		}
	}

	public static void whileLoop(int num){
		System.out.println("executing while");
		while(num<5){
			System.out.println(num+". Hello Divya");
			num++;
		}
	}

	public static void doWhileLoop(int num){
		System.out.println("Executing do while");
		do{
			System.out.println(num+".How is Naveen ");
			num++;
		}while(num<5);
	}

	public static void forLoop(){
		System.out.println("Executing for loop");
		for(int num=0;num<5;num++){
			System.out.println(num+".HI Divya! how is Naveen");
		}
	}
}
