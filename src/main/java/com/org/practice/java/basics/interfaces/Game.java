package com.org.practice.java.basics.interfaces;

public interface Game {
	public void startNewGame();

	public void resumeGame();
	public int score(int noOfAttempts);

	public void stop();

}
