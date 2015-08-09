package net;

import java.util.Random;

public class Rand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random dice = new Random();
		long huge;
		int number, number2, number3, number4;
		float number5;
		boolean torf;
		String test;
		
		for(int counter=1; counter <= 1; counter++ ){
			huge = dice.nextLong();
			number = 1+dice.nextInt(6);
			number2 = dice.nextInt(100);
			number3 = dice.nextInt(1000);
			number4 = dice.nextInt(100000);
			number5 = dice.nextFloat();
			torf = dice.nextBoolean();
			test = (number + "\n" + number2 + "\n" + number3 + "\n" + number4 + "\n" + number5 + "\n" + huge + "\n" + torf);
			
			System.out.println(test);
			
		}

	}

}
