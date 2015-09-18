package net;

public class LabelDef {

	public static void main(String[] args) {
		
		//Label example
		
		for (int x = 0; x <= 3; x++) {
			System.out.println(x + " *");

			for (int i = 0; i <= 3; i++) {
				if (x == 2)
					break;
				System.out.println("@");
			}
		}
		
		System.out.println("\n\n");
		
		FirstFor : for (int x = 0; x <= 3; x++) {
			System.out.println(x + " -");

			for (int i = 0; i <= 3; i++) {
				if (x == 2)
					break FirstFor;
				System.out.println("#");
			}
		}
	}
}
