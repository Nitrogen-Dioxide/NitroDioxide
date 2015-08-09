package net;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float multi = 1, times = 1, number, fixed;
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o numero ao qual deseja fazer a tabuada.");
		number = input.nextFloat();
		System.out.println("Agora insira quantas vezes quer multiplicar.");
		multi = input.nextFloat();
		fixed = number;
		for (; times <= multi; number += fixed) {
			System.out.println(fixed + " * " + times + " = " + number);
			times++;
		}
		input.close();
	}

}
