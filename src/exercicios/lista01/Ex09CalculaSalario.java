package exercicios.lista01;

import java.util.Scanner;

public class Ex09CalculaSalario {

	public static void main(String[] args) {
		// Faça um programa para ler o nome , departamento e o salário de um funcionário.
		// Calcular e informar um abono de 10% ( dez por cento) sobre o salário e, ainda, o novo
		// salário acrescido do abono.
		
		Scanner leia = new Scanner(System.in);
		String nome = "";
		String departamento = "";
		double salario = 0.0;
		double abono = 0.0;
		double novoSalario = 0.0;
		
		System.out.print("Digite o nome: ");
		nome = leia.nextLine();
		System.out.print("Digite o departamento: ");
		departamento = leia.nextLine();
		System.out.print("Digite o salário: ");
		salario = Double.valueOf(leia.nextLine());
				
		leia.close();
		
		abono = salario * 0.1;
		novoSalario = salario + abono;
		
		System.out.println("Abono: " + String.format("%.2f", abono));
		System.out.println("Novo salário: " + String.format("%.2f", novoSalario));

	}

}
