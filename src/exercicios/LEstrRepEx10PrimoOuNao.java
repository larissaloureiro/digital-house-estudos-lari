package exercicios;

import java.util.Scanner;

public class LEstrRepEx10PrimoOuNao {

	public static void main(String[] args) {
		// Fa�a um programa que receba um n�mero inteiro maior que 1 e verifique se o
		// n�mero � primo ou n�o. Mostrar mensagem de um n�mero primo ou de um n�mero n�o
		// primo.
		// Obs: Um n�mero � primo quando � divis�vel apenas pelo n�mero um e por ele mesmo.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira um n�mero inteiro maior que 1: ");
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
			System.out.printf("O n�mero %d � primo", numero);
		} else {
			System.out.printf("O n�mero %d n�o � primo", numero);
		}
		
	}

}
