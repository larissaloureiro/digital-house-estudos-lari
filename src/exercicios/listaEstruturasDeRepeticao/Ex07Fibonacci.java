package exercicios.listaEstruturasDeRepeticao;

public class Ex07Fibonacci {

	public static void main(String[] args) {
		// Faça um programa que monte os oito primeiros termos da sequência de Fibonacci.
		
		int[] fibonacci = new int[8];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		
		System.out.println("Sequencia de Fibonacci: ");
		for (int i = 0; i < fibonacci.length; i++) {
			System.out.printf("%d\t", fibonacci[i]);
		}

	}

}
