package exercicios.lista01;

import java.util.Scanner;

public class Ex06Funcionario {

	public static void main(String[] args) {
		// Fa�a um Programa que leia as seguintes informa��es de um funcion�rio: matricula,
		// nome, idade, sexo, endere�o, bairro e estado civil. Escreva o nome do funcion�rio.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a matr�cula: ");
		int matricula = Integer.valueOf(leia.nextLine());
		System.out.print("Digite o nome: ");
		String nome = leia.nextLine();
		System.out.print("Digite a idade: ");
		int idade = Integer.valueOf(leia.nextLine());
		System.out.print("Digite o sexo: ");
		char sexo = leia.nextLine().charAt(0);
		System.out.print("Digite o endere�o: ");
		String endereco = leia.nextLine();
		System.out.print("Digite o bairro: ");
		String bairro = leia.nextLine();
		System.out.print("Digite o estado civil: ");
		String estadoCivil = leia.nextLine();
		
		leia.close();
		
		System.out.println("Nome do funcion�rio: " + nome);

	}

}
