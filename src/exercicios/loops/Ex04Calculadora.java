package exercicios.loops;

import java.util.Scanner;

public class Ex04Calculadora {

	public static void main(String[] args) {
		// Implemente o programa da calculadora utilizando uma instru��o switch-case para
		// determinar a opera��o que deve ser executada, conforme o usu�rio escolhe no menu
		// de op��es. Conforme a op��o escolhida pelo usu�rio, um diferente m�todo da
		// calculadora � executado. Por exemplo: digamos que a op��o esteja associada ao
		// m�todo somar(op1, op2), ent�o ser� executado este m�todo da calculadora, e o
		// resultado obtido ser� a soma dos operandos 1 e 2.
		
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
		sb.append("Digite a opera��o desejada: \n");
		sb.append("1- Soma \n");
		sb.append("2- Subtra��o \n");
		sb.append("3- Multiplica��o \n");
		sb.append("4- Divis�o \n");
		
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
