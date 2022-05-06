package com.org.practice.java.basics.interfaces;

public class GameApp {
	public static void main(String[] args) {

		Game game1 = new Blocks();
		game1.startNewGame();
		Blocks block = new Blocks();
		System.out.println(block.addBlock(1,10));
		game1.stop();
	}
}
