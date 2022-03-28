package exercicios;

import java.util.Scanner;

public class LEstrRepEx05MaisAltoEMaisBaixo {

	public static void main(String[] args) {
		// Faça um programa que leia dez conjuntos de dois valores, o primeiro representando
		// o número do aluno e o segundo representando a sua altura em centímetros. Encontre o
		// aluno mais alto e o mais baixo. Mostre o número do aluno mais baixo, junto com suas
		// alturas.
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numerosDosAlunos = new int[10];
		double[] alturas = new double[10];
		int indiceMaisAlto = 0;
		int indiceMaisBaixo = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o número do " + (i + 1) + "º aluno: ");
			numerosDosAlunos[i] = Integer.valueOf(scanner.nextLine());
			System.out.print("Digite a altura do " + (i + 1) + "º aluno: ");
			alturas[i] = Double.valueOf(scanner.nextLine());
			
			if (alturas[i] < alturas[indiceMaisBaixo]) {
				indiceMaisBaixo = i;
			}
			if (alturas[i] > alturas[indiceMaisAlto]) {
				indiceMaisAlto = i;
			}
			System.out.println();
		}
		scanner.close();
		
		System.out.printf("Número do aluno mais baixo: %d | Altura: %.2f m \n", 
				numerosDosAlunos[indiceMaisBaixo], alturas[indiceMaisBaixo]);
		System.out.printf("Número do aluno mais alto: %d | Altura: %.2f m", 
				numerosDosAlunos[indiceMaisAlto], alturas[indiceMaisAlto]);
	}

}
