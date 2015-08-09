package net;

import java.util.Scanner;

public class AverageProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int grade, average, ammount, total = 0, counter = 0;

		System.out
				.println("Hi! This program will make an\naverage of the numbers that\nyou will insert.\n\nFirst, insert how\nmany numbers you want to average.");
		ammount = input.nextInt();

		while (counter < ammount) {
			System.out.println("\nInsert an int.");
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}

		average = total / ammount;
		System.out.println("Your average is " + average);

		input.close();
	}

}
