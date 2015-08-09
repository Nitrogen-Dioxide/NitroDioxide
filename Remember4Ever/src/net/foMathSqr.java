package net;

public class foMathSqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = Math.sqrt(2);
		
		for(int times = 28; times>0; times--){
			x = Math.sqrt(2 + x);
		}
		
		System.out.println(x);

	}

}
