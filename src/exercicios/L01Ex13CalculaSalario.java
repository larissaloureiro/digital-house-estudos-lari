package exercicios;

import java.util.Scanner;

public class L01Ex13CalculaSalario {

	public static void main(String[] args) {
		// Fa�a um Programa que obtenha o sal�rio base e o n�mero de dependentes de um
		// funcion�rio e informe o sal�rio bruto (igual ao sal�rio base + R$ 100,00 por
		// dependente), e o sal�rio l�quido , sabendo se que o desconto para o INSS � de 10%
		// sobre o sal�rio base.
		
		Scanner leia = new Scanner(System.in);
		double salarioBase = 0.0;
		double salarioBruto = 0.0;
		double salarioLiquido = 0.0;
		double descontoInss = 0.0;
		int dependentes = 0;
		
		System.out.print("Digite o sal�rio base: ");
		salarioBase = Double.valueOf(leia.nextLine());
		System.out.print("Digite o n�mero de dependentes: ");
		dependentes = Integer.valueOf(leia.nextLine());
		
		salarioBruto = salarioBase + (100.00 * dependentes);
		descontoInss = salarioBase * 0.1;
		salarioLiquido = salarioBruto - descontoInss;
		
		System.out.println("Sal�rio Bruto: " + String.format("%.2f", salarioBruto));
		System.out.println("Sal�rio L�quido: " + String.format("%.2f", salarioLiquido));
		
		leia.close();

	}

}
