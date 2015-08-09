package net;

public class ConvertAnyValue {
	public static void main (String[] args){
	int integer = 2;
	float me = 2.718F;
	double dec = 0.314;
	int convertInt;
	
	// random! easily made
	for (int x = 200; x > 0; x--){
		System.out.println((int) (Math.random()*10));
		}
	convertInt = (int) (integer * me);
	dec =(integer * me);
	System.out.println("\n" + convertInt);
	System.out.println(dec);
	}
}
