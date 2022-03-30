package exercicios;

import java.util.Scanner;

public class LEstrRepEx10PrimoOuNao {

	public static void main(String[] args) {
		// Faça um programa que receba um número inteiro maior que 1 e verifique se o
		// número é primo ou não. Mostrar mensagem de um número primo ou de um número não
		// primo.
		// Obs: Um número é primo quando é divisível apenas pelo número um e por ele mesmo.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro maior que 1: ");
		int numero = Integer.valueOf(scanner.nextLine());
		scanner.close();
		
		boolean ePrimo = true;
		
		for (int i = 2; i < numero / 2; i++) {
			if (numero % i == 0) {
				ePrimo = false;
				break;
			}
		}
		
		if (ePrimo) {
			System.out.printf("O número %d é primo", numero);
		} else {
			System.out.printf("O número %d não é primo", numero);
		}
		
	}

}
