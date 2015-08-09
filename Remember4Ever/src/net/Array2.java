package net;

import net.Metho;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mult[][]={{1,2,3,4,5},{6,7,8,9,10}};
		int mult2[][]={{1,2,3,4},{5,6,0,11},{7,8,9,10}};

		System.out.println(mult[0][1]);
		System.out.println(mult[1][0]);
		System.out.println(mult[1][4]);
		System.out.println("\n" + mult2[0][3]);
		System.out.println(mult2[1][1]);
		System.out.println(mult2[2][3]);
		
		System.out.println("First Array.");
		Metho.display2darray(mult);
		System.out.println();
		System.out.println("Second Array.");
		Metho.display2darray(mult2);
	}

}
