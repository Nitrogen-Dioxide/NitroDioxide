package net;

import java.util.Locale;
import java.util.Scanner;

public class Equation {
	
	public static double[] solvequation(double a, double b, double c){
		
		int time = 0;
		double x1, x2;
		double answer[] = {0, 0, 0};
		double delta = Math.pow(b, 2) - 4 * a * c;
		if(delta >= 0) {
			do {
				x1 = (-(b) + Math.sqrt(delta)) / (2 * a);
				x2 = (-(b) - Math.sqrt(delta)) / (2 * a);
				answer[0] = x1;
				answer[1] = x2;
				answer[2] = delta;
				time++;
			} while (time == 0);
		}
		else if(delta < 0){
			x1 = Double.NaN;
			x2 = Double.NaN;
			System.out.println("\nError! Delta is negative!"
					+ "\nCould not solve the equation, since"
					+ "\nit doesn't have an solution!");
			answer[0] = x1;
			answer[1] = x2;
			answer[2] = delta;
			return answer;
			}
		return answer;
	}

	public static double[] getabc(){
		double set[] = {0, 0, 0};
		double a = 0, b = 0, c = 0;
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		try {
		System.out.println("Insert a :");
		a = input.nextDouble();
		System.out.println("Insert b :");
		b = input.nextDouble();
		System.out.println("Insert c :");
		c = input.nextDouble();
		set[0] = a; set[1] = b; set[2] = c;
		} catch (Exception error) {
			System.out.println("\nError! Insert a valid double!");
		}
		input.close();
		return set;
	}
	
	
}
