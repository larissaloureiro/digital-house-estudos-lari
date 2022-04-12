package exercicios.loops;

import java.util.Scanner;

public class Ex04Calculadora {

	public static void main(String[] args) {
		// Implemente o programa da calculadora utilizando uma instrução switch-case para
		// determinar a operação que deve ser executada, conforme o usuário escolhe no menu
		// de opções. Conforme a opção escolhida pelo usuário, um diferente método da
		// calculadora é executado. Por exemplo: digamos que a opção esteja associada ao
		// método somar(op1, op2), então será executado este método da calculadora, e o
		// resultado obtido será a soma dos operandos 1 e 2.
		
		Scanner scanner = new Scanner(System.in);;
		int opcao = mostrarMenu();
		
		System.out.print("Digite o primeiro valor: ");
		double valor1 = Double.valueOf(scanner.nextLine());
		System.out.print("Digite o segundo valor: ");
		double valor2 = Double.valueOf(scanner.nextLine());
		
		scanner.close();
		
		switch (opcao) {
		case 1:
			System.out.printf("%.2f + %.2f = %.2f", valor1, valor2, soma(valor1, valor2));
			break;

		case 2:
			System.out.printf("%.2f - %.2f = %.2f", valor1, valor2, subtracao(valor1, valor2));
			break;
		
		case 3:
			System.out.printf("%.2f * %.2f = %.2f", valor1, valor2, multiplicacao(valor1, valor2));
			break;
	
		case 4:
			System.out.printf("%.2f / %.2f = %.2f", valor1, valor2, divisao(valor1, valor2));
			break;
		}
		
		

	}
	
	static public int mostrarMenu() {
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Digite a operação desejada: \n");
		sb.append("1- Soma \n");
		sb.append("2- Subtração \n");
		sb.append("3- Multiplicação \n");
		sb.append("4- Divisão \n");
		
		System.out.println(sb.toString());
		return Integer.valueOf(scanner.nextLine());
	}
	
	public static double soma (double valor1, double valor2) {
		return valor1 + valor2;
	}
	
	public static double subtracao (double valor1, double valor2) {
		return valor1 - valor2;
	}
	
	public static double multiplicacao (double valor1, double valor2) {
		return valor1 * valor2;
	}
	
	public static double divisao (double valor1, double valor2) {
		return valor1 / valor2;
	}
	

}
