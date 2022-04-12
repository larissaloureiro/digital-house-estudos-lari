package exercicios.loops;

import java.util.Scanner;

public class Ex01NotaValida {

	public static void main(String[] args) {
		// Realize um programa que peça uma nota de 0 e 10. Mostre uma mensagem caso o
		// valor seja válido e continue pedindo caso o valor seja inválido.
		
		Scanner scanner = new Scanner(System.in);
		double nota = 0;
		
		do {
			System.out.print("Digite uma nota: ");
			nota = Double.valueOf(scanner.nextLine());
		} while (nota < 0 || nota > 10);
		
		scanner.close();
		
		System.out.printf("A nota digitada é %.2f", nota);

	}

}
