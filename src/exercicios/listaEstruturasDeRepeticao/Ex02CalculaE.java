package exercicios.listaEstruturasDeRepeticao;

import java.util.Scanner;

public class Ex02CalculaE {

	public static void main(String[] args) {
		// Faça um programa que leia um valor N inteiro e positivo, calcule e mostre o valor de
		// E, conforme a fórmula a seguir:
		// E = 1 + 1! + 1 + 2! + 1 + 3! + ... + 1/N!
		
		Scanner scanner = new Scanner(System.in);
		
		int valorE = 0;
		int fatorial = 1;
		
		System.out.print("Digite o valor de N: ");
		int valorN = Integer.valueOf(scanner.nextLine());
		
		scanner.close();
		
		for (int i = 1; i <= valorN; i++) {
			// Calcular fatorial
			fatorial = 1;
			for (int j = i; j > 0; j--) {
				fatorial = fatorial * j;
			}
			
			valorE += 1 + fatorial;
		}
		
		System.out.println("E = " + valorE);

	}

}
