package net;

public class AAextendArray {

	public static void main(String[] args) {
		AAextend3 carrot[]=new AAextend3[2];
		carrot[0]=new AAextend2();
		carrot[1]=new AAextend3();
		
		for(int x=0;x<2;x++){
			carrot[x].say();
		}

	}

}
