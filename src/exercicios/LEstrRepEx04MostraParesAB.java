package exercicios;

import java.util.Scanner;

public class LEstrRepEx04MostraParesAB {

	public static void main(String[] args) {
		// Faça um programa que leia cinco pares de valores (a,b) todos inteiros e positivos, um
		// de cada vez. Mostre os números inteiros pares de a até b (inclusive).
		
		Scanner scanner = new Scanner(System.in);
		
		int[] valoresA = new int[5];
		int[] valoresB = new int[5];
		
		int valorA = 0;
		int valorB = 0;
		
		// Ler os pares a-b
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor de a: ");
			valorA = Integer.valueOf(scanner.nextLine());
			System.out.print("Digite o " + (i + 1) + "º valor de b: ");
			valorB = Integer.valueOf(scanner.nextLine());
			
			System.out.printf("Valores pares entre %d e %d:", valorA, valorB);
			
			for (int j = valorA; j <= valorB; j += 2) {
				if (j % 2 != 0) {
					j++;
				}
				System.out.printf(" %d ", j);				
			}
			
			System.out.println();
			System.out.println();
		}

	}

}
