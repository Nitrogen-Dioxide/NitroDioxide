package net;

import net.Equation;

public class SolveEquation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] result;
		double[] get;
		System.out.println("This program will solve a second grade equation."
				+ "\nThey looks like:" + "\na*x² b*x c*x = 0."
				+ "\nIf the one you wants to solve doesn't look"
				+ "\nlike that, you can transform it.");
		get = Equation.getabc();
		result = Equation.solvequation(get[0], get[1], get[2]);
		System.out.println("\nX1 equals: " + result[0]
				+ "\nX2 equals: " + result[1] 
				+ "\nDelta equals: " + result[2]);
	}

}
