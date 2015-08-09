package net;

import java.util.Scanner;

public class Swith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner question = new Scanner(System.in);
		int answer;
		System.out.println("How many is?\n2 * 4 + 2 - (3) * (-1)");
		answer = question.nextInt();

		switch (answer) {

		case 13:
			System.out.println("You answered it right!");
			break;

		default:
			System.out
					.println("It is wrong! Remember that (2 * 4) comes\n before than (4 + 2)");
			System.out
					.println("\nRemember that (3) * (-1) = -3 then\n2 - (-3) = 2 + 3!");
			break;

		}
		question.close();

	}

}
