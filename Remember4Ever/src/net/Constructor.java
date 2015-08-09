package net;

public class Constructor {
	
	private int a = 1, b = 2, c = 3;
	
	public void printString(int a,int b,int c){
		System.out.println("" + a + " " + b + " " + c);
	}
	
	public void printThisString(int a,int b,int c){
		System.out.println("" + this.a + " " + this.b + " " + this.c);
	}

}
