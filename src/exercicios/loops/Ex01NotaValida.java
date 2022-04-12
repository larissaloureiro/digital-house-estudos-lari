package exercicios.loops;

import java.util.Scanner;

public class Ex01NotaValida {

	public static void main(String[] args) {
		// Realize um programa que pe�a uma nota de 0 e 10. Mostre uma mensagem caso o
		// valor seja v�lido e continue pedindo caso o valor seja inv�lido.
		
		Scanner scanner = new Scanner(System.in);
		double nota = 0;
		
		do {
			System.out.print("Digite uma nota: ");
			nota = Double.valueOf(scanner.nextLine());
		} while (nota < 0 || nota > 10);
		
		scanner.close();
		
		System.out.printf("A nota digitada � %.2f", nota);

	}

}
