package net;

import java.util.EnumSet;

public class EnumLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Enums people: Enums.values())
			System.out.printf("Name: %s\tDesc: %s\tYears: %s\n", people, people.getDesc(), people.getAge());
		
		System.out.println("\nRange of constants.\n");
		
		for(Enums people: EnumSet.range(Enums.miranda, Enums.robot))
			System.out.printf("Name: %s\tDesc: %s\tYears: %s\n", people, people.getDesc(), people.getAge());
	}

}
