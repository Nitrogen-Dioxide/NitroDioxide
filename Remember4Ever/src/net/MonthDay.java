package net;

public class MonthDay {
	private int month;
	private int day;
	private int year;
	
	public MonthDay(int m, int d, int y){
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for that is %s\n", this);
	}
	
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}

}
