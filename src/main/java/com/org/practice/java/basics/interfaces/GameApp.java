package com.org.practice.java.basics.interfaces;

public class GameApp {
	public static void main(String[] args) {

		Game game1 = new Blocks();
		game1.startNewGame();
		Blocks block = new Blocks();
		System.out.println(block.addBlock(1,10));
		game1.stop();
		Object o = 2;
		Object o1 = new String("Divya");
		Object obj = new Integer(1);
		Object obj1 = "Sri";

		Integer i1 = new Integer(10);
		int i2 = new Integer(19);
		Integer i3 = 10;

		int i = 11;
		Integer i4 = i;
		Integer int1 = new Integer(1234);
		int int2 = int1;

		float f = 10f;//intialization
		Float f1 = f;//AutoBoxing f into Float

		Float flt = new Float(11);
		float f2 = flt; //Auto unboxing

		Boolean bool = new Boolean(false);
		boolean b = bool;//auto unboxing

		boolean bl = true;
		Boolean b1 = bl;// Auto boxing

		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Boolean.FALSE);
		System.out.println(Float.MIN_NORMAL);
		System.out.println(Float.MAX_VALUE);

		int a = 1234;
		Integer abc = (Integer) a;
	}
}
