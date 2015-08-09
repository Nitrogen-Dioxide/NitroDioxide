package net;

import javax.swing.JOptionPane;

public class Panes {
	public static void main(String[] args){
		work();
	}
	
	public static void work(){
	String firstNumber ="";
	String secondNumber="";
	firstNumber = JOptionPane.showInputDialog("Enter your first number to sum.", "0");
	secondNumber = JOptionPane.showInputDialog("Enter your second number to sum.", "0");
	try {
		int sum = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
		JOptionPane.showMessageDialog(null, "The sum is: " + sum, "The Sum", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception error) {
			JOptionPane.showMessageDialog(null, "Insert a valid int!", "Error", JOptionPane.WARNING_MESSAGE);
			work();
		}
	}
	
}
