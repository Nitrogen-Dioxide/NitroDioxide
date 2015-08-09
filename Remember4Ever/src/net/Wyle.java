package net;

public class Wyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int nbr = 0;

		while (count < 10) {

			System.out.println(count);
			count++;
		}
		System.out.println();
		
		while (nbr < 100000){
			if(nbr >= 10){
				break;
			}
			nbr++;
			System.out.println(nbr);
		}
	}

}
