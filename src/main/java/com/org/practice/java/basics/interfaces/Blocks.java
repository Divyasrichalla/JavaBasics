package com.org.practice.java.basics.interfaces;

import java.util.Random;

public class Blocks implements Game{
	int noOfAttempts = 3;
	private int min;
	private int max;

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int addBlock(int min, int max){
		System.out.println("Adding two blocks");
		Random randm = new Random();
		//random.nextInt(max - min + 1) + min
		int i = randm.nextInt(max - min + 1) + min;
		System.out.println("generated number is "+i);
		return i;
	}
	@Override
	public void startNewGame() {
		System.out.println("Started New Game...!!!");
	}

	@Override
	public void resumeGame() {
		System.out.println("Game Resumed..........!!!");
	}

	@Override
	public int score(int noOfAttempts) {
		System.out.println("No. of Attempts :"+ noOfAttempts);
		int i = addBlock(getMin(),getMax())+noOfAttempts;
		return i*100;
	}

	@Override
	public void stop() {
		System.out.println("End Game");
	}
}
