package net;

public class Metho {

	private String answer;

	public void print(String msg) {

		System.out.println(msg);

	}

	public void Answer(String input) {
		answer = input;
	}

	public String Answer() {
		return answer;
	}

	public void printResult(String result) {
		System.out.printf(result, Answer());
	}
	
	public static void addarray(int x[], int add){
		for(int count=0; count<x.length; count++){
			x[count]+=add;
		}
	}
	
	public static void display2darray(int x[][]){
		for(int row=0;row<x.length;row++){
			for(int column=0;column<x[row].length;column++){
				System.out.print(x[row][column]+"\t");
			}
		System.out.println();
		}
	}
	
	public static int average(int...numbers){
		int total = 0;
		for(int x:numbers)
			total += x;

		return total/numbers.length;
	}
	
	public static boolean somenteNum(String str) {
	    for (int i = 0; i < str.length(); i++) {
	      if (!Character.isDigit(str.charAt(i)))
	        return false;
	    }
	    return true;
	  }
	public static int resto(int x,int y) {
		int res = 0;
		int z=x;
		
		while(z >= y){
			z-=y;
			res = z;
		}
		return res;
	}
}
