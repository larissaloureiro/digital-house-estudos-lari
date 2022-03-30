package exercicios.lista01;

import java.util.Scanner;

public class Ex06Funcionario {

	public static void main(String[] args) {
		// Faça um Programa que leia as seguintes informações de um funcionário: matricula,
		// nome, idade, sexo, endereço, bairro e estado civil. Escreva o nome do funcionário.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a matrícula: ");
		int matricula = Integer.valueOf(leia.nextLine());
		System.out.print("Digite o nome: ");
		String nome = leia.nextLine();
		System.out.print("Digite a idade: ");
		int idade = Integer.valueOf(leia.nextLine());
		System.out.print("Digite o sexo: ");
		char sexo = leia.nextLine().charAt(0);
		System.out.print("Digite o endereço: ");
		String endereco = leia.nextLine();
		System.out.print("Digite o bairro: ");
		String bairro = leia.nextLine();
		System.out.print("Digite o estado civil: ");
		String estadoCivil = leia.nextLine();
		
		leia.close();
		
		System.out.println("Nome do funcionário: " + nome);

	}

}
