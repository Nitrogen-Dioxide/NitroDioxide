package net;

import java.util.Locale;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner calc = new Scanner(System.in);
		calc.useLocale(Locale.ENGLISH);
		double x, y, plus, minus, minus2, divide, divide2, mult;
		System.out.println("Enter the first number:");
		x = calc.nextDouble();
		System.out.println("Enter the second number:");
		y = calc.nextDouble();
		plus = x + y;
		minus = x - y;
		minus2 = y - x;
		divide = x / y;
		divide2 = y / x;
		mult = x * y;
		System.out.println("\n" + x + " + " + y + " = " + plus);
		System.out.println("\n" + x + " - " + y + " = " + minus);
		System.out.println("\n" + y + " - " + x + " = " + minus2);
		System.out.println("\n" + x + " / " + y + " = " + divide);
		System.out.println("\n" + x + " / " + y + " = " + divide2);
		System.out.println("\n" + x + " * " + y + " = " + mult);
		calc.close();

	}

}
