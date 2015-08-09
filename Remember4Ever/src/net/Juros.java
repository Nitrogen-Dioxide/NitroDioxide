package net;

import java.util.Locale;
import java.util.Scanner;

public class Juros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A formula para juros compostos � M = P . (1 + i)^n
		double price, total = 0, percent, permonth;
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		System.out.println("Insira o pre�o do produto.");
		price = input.nextDouble();
		System.out.println("Insira o tempo de pagamento em meses.");
		int months = input.nextInt();
		System.out.println("Insira a porcentagem.");
		percent = input.nextDouble();

		for (int time = 1; time <= months; time++) {
			total = price * Math.pow(1 + (percent / 100), time);
		}
		permonth = total / months;

		System.out.println("Parcelas: " + months + " vezes de R$ " + permonth
				+ "\nTaxa de juros: " + percent + "% por m�s"
				+ "\nPre�o total com juros: R$ " + total
				+ "\nPre�o sem juros: R$ " + price
				+ "\nPre�o total dos juros: R$ " + (total - price));
		input.close();
	}

}
