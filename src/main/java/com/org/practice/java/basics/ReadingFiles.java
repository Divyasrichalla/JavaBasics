package com.org.practice.java.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "F:/DivProjects/javaNotes.txt";

		File textFile = new File(fileName);

		Scanner sc = new Scanner(textFile);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
	}

}
