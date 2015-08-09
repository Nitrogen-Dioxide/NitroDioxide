package net;

import java.util.Random;
import net.Metho;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Random rand = new Random();
		int choose = rand.nextInt(3);
		String colors[]=new String[3];
		int crazy[]=new int[10];
		
		crazy[0]=1;
		crazy[4]=3;
		crazy[1]=45;
		crazy[3]=3;
		crazy[2]=124;
		
		colors[0]="Red.";
		colors[1]="Blue.";		
		colors[2]="Green.";
		
		System.out.println(crazy[3]);
		System.out.println(crazy[9]);
		System.out.println(colors[choose] + "\n\n");
		
		//Array initializer. Better way to do that
		
		int better[]={1,3,4,5,6,7,8,9,324,40,412};
		String foods[]={"Potatoe.", "Carrot.", "Melon"};
		System.out.println(better[0] + ", " + better[10]);
		System.out.println(foods[choose]);
		
		//Index of array with for
		
		System.out.println("\nIndex\tValue");
		for(int counter=0; counter<better.length; counter++){
			System.out.println(counter + "\t" + better[counter]);
		}	
		//Operations with arrays
		int total = 0;
		int average = 0;
		for (int times=0; times<better.length; times++){
			total += better[times];
			average = total / better.length;
		}	
		System.out.println("\nThe total is: " + total +
				"\nThe average is: " + average);
		
		//Better way to sum:
		
		for(int x: crazy){
			total+=x;
		}
		int avera = total/crazy.length;
		
		System.out.println("\n\nThe other total is: " + total +
				"\nThe average is: " + avera);
		Metho.addarray(better, 20);
		
		for(int count=0; count<better.length; count++){
			System.out.println(better[count]);
		}
	}	
}
