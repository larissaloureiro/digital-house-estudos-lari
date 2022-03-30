package exercicios.listaEstruturasDeRepeticao;

import java.util.Scanner;

public class Ex03TabelaFatoriais {

	public static void main(String[] args) {
		// Faça um programa que leia um número N e que indique quantos valores inteiros e
		// positivos devem ser lidos a seguir. Para cada número lido, mostre uma tabela contendo o
		// valor lido e o fatorial desse valor.
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Digite o valor de N: ");
		int valorN = Integer.valueOf(scanner.nextLine());
		
		int fatorial = 1;
		int[] valoresLidos = new int[valorN];
		int[] fatoriais = new int[valorN];
		
		// Ler N valores
		for (int i = 0; i < valorN; i++) {
			System.out.print("Digite um valor: ");
			valoresLidos[i] = Integer.valueOf(scanner.nextLine());
			
			// Calcular fatorial
			fatorial = 1;
			for (int j = 1; j <= valoresLidos[i]; j++) {
				fatorial = fatorial * j;
			}
			fatoriais[i] = fatorial;
		}
		scanner.close();
		
		// Imprimir tabela
		System.out.println(" ---------------------------------");
		System.out.println("|   Valor Lido   |    Fatorial    |");
		System.out.println(" ----------------|----------------");
		
		for (int i = 0; i < valorN; i++) {
			System.out.printf("| %14d | %14d |\n", valoresLidos[i], fatoriais[i]);
		}
		System.out.println(" ---------------------------------");

	}

}
