package net;

import net.Metho;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Metho Method = new Metho();
		Time Time = new Time();
		Constructor Const = new Constructor();
		MonthDay Date = new MonthDay(22,01,1999);
		BirthReference Refer = new BirthReference("Mateus", Date);
		FinalAreaCalc Circle = new FinalAreaCalc();

		String sample = "This is an string :p.";
		byte b = 127;
		short s = 32767;
		int i = 1;
		int age = 18;
		float f = 3 * 2131231243;
		double d = 3.12345678987654321 * 3.231321;
		double tuna = 1.3;
		boolean z = false;
		char c = '\u0003';

		System.out.println("Hello World!");
		System.out.print("Hello World!");
		System.out.print("Hello World!");
		System.out.println("");

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
		System.out.println("\t\t" + d);
		System.out.println(z);
		System.out.println(c);
		System.out.println(Math.abs(-1.2));
		System.out.println(Math.ceil(1.1));
		System.out.println(Math.floor(1.9));
		System.out.println(Math.max(.3, .2));
		System.out.println(Math.min(.3, .2));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(9));

		System.out.print("I want ");
		System.out.print(tuna);
		System.out.println(" g of tuna.");

		System.out.printf("%s\n", sample);

		Method.print("This is a print from another class!");

		System.out.println(age >= 18 ? "You can enter." : "You can't enter.");
		
		System.out.println("The average = " + Metho.average(1,2,3,4,5,6,7,8,9,10));
		
		System.out.println(Time.toMilitary());
		
		Time.setime(0, 0,8400);
		
		System.out.println(Time.toMilitary());
		System.out.println(Time.toString());
		
		Time.setime(5);
		
		System.out.println(Time.toMilitary());
		
		Const.printString(5, 6, 7);
		Const.printThisString(5, 6, 7);
		
		System.out.println(Refer);
		
		Circle.calcArea(2);
		double area = Circle.returnArea();
		
		System.out.println("The area of the circle is: "+area);
		
		System.out.println("The average = " + Metho.average(1,2,3,4,54,6,7,8,3,34,24,213,42,4,6,87));
		
	}

}
