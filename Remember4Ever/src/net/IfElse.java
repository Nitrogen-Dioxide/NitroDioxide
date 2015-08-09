package net;

import java.util.Locale;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner value = new Scanner(System.in);
		value.useLocale(Locale.US);
		double number;
		long nodec;

		System.out
				.println("Insert an number, and master pc will answer if\nit is decimal, "
						+ "positive, negative or equals 0.");
		number = value.nextDouble();

		nodec = Math.round(number);

		if (number == 0) {
			System.out.println("The number inserted equals 0.");
		}

		else if (number > 0) {
			if ((number - nodec) > 0) {
				System.out
						.println("The number inserted is positive and decimal.");
			}

			else
				System.out.println("The number inserted is positive.");
		}

		else if (number < 0) {
			if ((number - nodec) < 0) {
				System.out
						.println("The number inserted is negative and decimal.");
			}

			else
				System.out.println("The number inserted is negative.");
		}

		value.close();

	}

}
