package exercicios.listaEstruturasDeRepeticao;

import java.util.Scanner;

public class Ex06CalculaS {

	public static void main(String[] args) {
		// Faca um programa que leia um numero de termos e um valor positivo para X, calcule
		// e mostre o valor da serie a seguir:
		// S = - (x^2 / 1!) + (x^3 / 2!) - (x^4 / 3!) + (x^5 / 4!) - (x^6 / 3!) + (x^7 / 2!) - (x^8 / 1!) + (x^9 / 2!) - (x^10 / 3!) + (x^11 / 4!) 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero de termos: ");
		int numeroDeTermos = Integer.valueOf(scanner.nextLine());
		System.out.print("Digite o valor de X: ");
		int valorX = Integer.valueOf(scanner.nextLine());
		
		scanner.close();
		
		int fatorial = 1;
		int passoFatorial = 1;
		double valorS = 0;
		
		for (int i = 1; i <= numeroDeTermos; i++) {
			// Calcular resultado do fatorial
			int resultadoFatorial = 1;

			for (int j = 1; j <= fatorial; j++) {
				resultadoFatorial = resultadoFatorial * j;
			}

			if (fatorial == 4) {
				passoFatorial = -1;
			}
			if (fatorial == 1) {
				passoFatorial = 1;
			}
			fatorial += passoFatorial;
			
			//Calcular termo atual
			double termoAtual =  Math.pow(valorX, i + 1) / resultadoFatorial;

			if (i % 2 == 0) {
				valorS += termoAtual;
			} else {
				valorS -= termoAtual;
			}
			
		}
		
		System.out.println("S = " + valorS);
		
	}

}
