package net;

/**
* Fatorial de N utilizando o conceito de pilha
*@autor Tarcnux
*@param N Inteiro
*
* Para compilar
* javac Fatorial.java
*
* Para rodar
* java Fatorial
*/

import java.util.Stack;
import java.util.Scanner;

public class PilhaStack {
	
	public static void main (String[] args)
	  {
	    Scanner scan = new Scanner ( System.in );
	    int n=1;
	    System.out.print("\nDigite um numero: ");   
	    n = scan.nextInt();
	    Fatorialx(n);
	      
	  }

	  public static void Fatorialx( int N )
	  {
		
	        Stack <Integer> pilha = new Stack<Integer>();
		int fatorial = 1, aux = N;
		
		//Empilha
		while(aux > 1)
			pilha.push(aux--); //Empilha e depois decrementa
		
		while(!pilha.empty()) //Enquanto há elementos na pilha
			fatorial *= pilha.pop(); //Desempilha e calcula o Fatorial
			
		System.out.println("O fatorial de " + N + " é: " + fatorial);
	  }
}
