package net;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Metho Method = new Metho();

		System.out.println("What is your name?");
		Scanner input = new Scanner(System.in);
		System.out.print("\nYour name is " + input.nextLine() + ".");
		System.out.println("");

		System.out.println("\nWhat is your favourite color?");
		Method.Answer(input.nextLine());
		Method.printResult("So, you like the %s color.");

		input.close();
	}

}
