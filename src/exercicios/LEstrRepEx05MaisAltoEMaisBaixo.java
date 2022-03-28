package exercicios;

import java.util.Scanner;

public class LEstrRepEx05MaisAltoEMaisBaixo {

	public static void main(String[] args) {
		// Fa�a um programa que leia dez conjuntos de dois valores, o primeiro representando
		// o n�mero do aluno e o segundo representando a sua altura em cent�metros. Encontre o
		// aluno mais alto e o mais baixo. Mostre o n�mero do aluno mais baixo, junto com suas
		// alturas.
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numerosDosAlunos = new int[10];
		double[] alturas = new double[10];
		int indiceMaisAlto = 0;
		int indiceMaisBaixo = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o n�mero do " + (i + 1) + "� aluno: ");
			numerosDosAlunos[i] = Integer.valueOf(scanner.nextLine());
			System.out.print("Digite a altura do " + (i + 1) + "� aluno: ");
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
		
		System.out.printf("N�mero do aluno mais baixo: %d | Altura: %.2f m \n", 
				numerosDosAlunos[indiceMaisBaixo], alturas[indiceMaisBaixo]);
		System.out.printf("N�mero do aluno mais alto: %d | Altura: %.2f m", 
				numerosDosAlunos[indiceMaisAlto], alturas[indiceMaisAlto]);
	}

}
