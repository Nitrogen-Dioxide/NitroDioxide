package net;

import java.util.Scanner;

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

public class PilhaStack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 1;
		System.out.print("\nDigite um numero: ");
		n = scan.nextInt();
		Fatorialx(n);
		
		scan.close();

	}

	public static void Fatorialx(long N) {

		Stack<Long> pilha = new Stack<Long>();
		long fatorial = 1, aux = N;

		// Empilha
		while (aux > 1)
			pilha.push(aux--); // Empilha e depois decrementa

		System.out.println("Foram incrementados " + pilha.size() + " na pilha\nO numero " + pilha.peek()
				+ " e o topo da fila e o " + pilha.elementAt(0) + " e a base da pilha.");

		while (!pilha.empty()) // Enquanto h� elementos na pilha
			fatorial *= pilha.pop(); // Desempilha e calcula o Fatorial

		System.out.println("O fatorial de " + N + " �: " + fatorial);
	}
}
