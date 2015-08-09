package net;

import java.util.Scanner;

public class Cpf extends Metho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String cpf;
		int dig1 = 0, dig2 = 0, soma, x;
		while (true) {
			System.out.println("Insira o seu CPF: ");
			cpf = input.nextLine();
			cpf = cpf.replace("-", "").replace(" ", "").replace(".", "")
					.replace("_", "").replace(",", "");

			if (!somenteNum(cpf)) {
				erro(1);
				break;
			}

			if (cpf.length() != 11) {
				erro(0);
				break;
			}

			soma = 0;
			for (x = 0; x <= 8; x++) {
				soma += Character.getNumericValue(cpf.charAt(x)) * (10 - x);
			}

			dig1 = 11 - resto(soma, 11);
			if (dig1 > 9)
				dig1 = 0;
			if (dig1 != Character.getNumericValue(cpf.charAt(9))) {
				erro(2);
				break;
			}

			soma = 2 * dig1;
			for (x = 8; x >= 0; x--) {
				soma += Character.getNumericValue(cpf.charAt(x)) * (11 - x);
			}

			dig2 = 11 - resto(soma, 11);

			if (dig2 > 9)
				dig2 = 0;

			if (dig2 != Character.getNumericValue(cpf.charAt(10))) {
				erro(2);
				break;
			}

			System.out.println("CPF Válido!");
			break;
		}
		input.close();
	}

	public static void erro(int i) {
		switch (i) {
		case 0:
			System.out.println("CPF de tamanho invalido.");
			break;
		case 1:
			System.out
					.println("CPF deve ter somente números\n - _ . , ou espaços.");
		case 2:
			System.out.println("CPF invalido.");
		}
	}

}
