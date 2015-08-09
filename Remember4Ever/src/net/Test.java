package net;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean boo = true;
		int x = 0;
		int trig = 0;
		System.out.println("Starting...");
		while(trig == 0){
			x++;
			if (x > 999999){
				trig++;
			}
			System.out.println(x);
		}
		System.out.println("End...");

	}

}
