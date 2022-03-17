package exercicios;

import java.util.Scanner;

public class L01Ex17PesoIdeal {

	public static void main(String[] args) {
		// Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um
		// programa que calcule seu peso ideal, utilizando as seguintes fórmulas:
		// Para homens: (72.7 * altura) - 58;
		// Para mulheres: (62.1 * altura) - 44.7;
		
		Scanner leia = new Scanner(System.in);
		
		double altura, pesoIdeal;
		char sexo;
		
		System.out.println("Informe sua altura: ");
		altura = Double.valueOf(leia.nextLine());
		System.out.println("Informe seu sexo (M ou F): ");
		sexo = leia.nextLine().toUpperCase().charAt(0);
		
		leia.close();
		
		if (sexo == 'M') {
			pesoIdeal = (72.7 * altura) - 58;
			System.out.println("Peso Ideal: " + String.format("%.1f", pesoIdeal));
		} else if (sexo == 'F') {
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.println("Peso Ideal: " + String.format("%.1f", pesoIdeal));
		} else {
			System.out.println("Sexo digitado é inválido.");
		}
		
	}

}
