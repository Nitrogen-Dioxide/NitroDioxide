package net;

public class FinalAreaCalc {
	private final double PI = Math.PI;
	private double area;
	
	public void calcArea(double radius){
		area = Double.NaN;
		area = PI*(radius*radius);
	}
	
	public double returnArea(){
		return area;
	}

}
