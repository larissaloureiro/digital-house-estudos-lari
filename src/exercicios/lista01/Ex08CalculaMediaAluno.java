package exercicios.lista01;

import java.util.Scanner;

public class Ex08CalculaMediaAluno {

	public static void main(String[] args) {
		// Fa�a um programa para ler o nome e as tr�s notas de um aluno. Calcular a m�dia e
		// escrever o nome e a m�dia. Vari�veis utilizadas: NOME, N1, N2, N3, MEDIA.
		
		Scanner leia = new Scanner(System.in);
		
		double n1 = 0.0;
		double n2 = 0.0;
		double n3 = 0.0;
		
		System.out.print("Digite nome do(a) aluno(a): ");
		String nome = leia.nextLine();
		System.out.print("Digite a nota 1: ");
		n1 = Double.valueOf(leia.nextLine());
		System.out.print("Digite a nota 2: ");
		n2 = Double.valueOf(leia.nextLine());
		System.out.print("Digite a nota 3: ");
		n3 = Double.valueOf(leia.nextLine());
		
		leia.close();
		
		double media = (n1 + n2 + n3) / 3;
		System.out.println("Nome do(a) aluno(a): " + nome);
		System.out.println("M�dia: " + String.format("%.1f", media));

	}

}
