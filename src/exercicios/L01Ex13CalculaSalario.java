package exercicios;

import java.util.Scanner;

public class L01Ex13CalculaSalario {

	public static void main(String[] args) {
		// Faça um Programa que obtenha o salário base e o número de dependentes de um
		// funcionário e informe o salário bruto (igual ao salário base + R$ 100,00 por
		// dependente), e o salário líquido , sabendo se que o desconto para o INSS é de 10%
		// sobre o salário base.
		
		Scanner leia = new Scanner(System.in);
		double salarioBase = 0.0;
		double salarioBruto = 0.0;
		double salarioLiquido = 0.0;
		double descontoInss = 0.0;
		int dependentes = 0;
		
		System.out.print("Digite o salário base: ");
		salarioBase = Double.valueOf(leia.nextLine());
		System.out.print("Digite o número de dependentes: ");
		dependentes = Integer.valueOf(leia.nextLine());
		
		salarioBruto = salarioBase + (100.00 * dependentes);
		descontoInss = salarioBase * 0.1;
		salarioLiquido = salarioBruto - descontoInss;
		
		System.out.println("Salário Bruto: " + String.format("%.2f", salarioBruto));
		System.out.println("Salário Líquido: " + String.format("%.2f", salarioLiquido));
		
		leia.close();

	}

}
