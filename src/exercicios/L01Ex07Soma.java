package exercicios;

import java.util.Scanner;

public class L01Ex07Soma {

	public static void main(String[] args) {
		// Faça um programa que leia dois números inteiros e escreva a soma entre eles.
		
		Scanner leia = new Scanner(System.in);
		
		int valorA = 0;
		int valorB = 0;
		int soma = 0;
		
		System.out.print("Digite o primeiro valor: ");
		valorA = leia.nextInt();
		System.out.print("Digite o segundo valor: ");
		valorB = leia.nextInt();
		
		leia.close();
		
		soma = valorA + valorB;
		System.out.println("A soma dos dois valores é: " + soma);

	}

}
