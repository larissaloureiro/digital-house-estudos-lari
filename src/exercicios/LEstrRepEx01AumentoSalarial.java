package exercicios;

public class LEstrRepEx01AumentoSalarial {

	public static void main(String[] args) {
		// Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
		// a) Esse funcionário foi contratado em 1995, com o salário inicial de R$1000,00;
		// b) Em 1996 recebeu um aumento de 1,5% sobre o seu salário inicial;
		// c) A partir de 1997 (inclusive), os aumentos salariais sempre corresponderam ao
		// dobro do percentual do ano anterior.
		// Faça um programa que determine o salário atual desse funcionário.
		
		double salario = 1000.0;
		double aumentoPercentual = 1.5;
		for (int ano = 1996; ano <= 2022; ano++) {
			salario = salario + (salario * aumentoPercentual / 100);
			aumentoPercentual = aumentoPercentual * 2;
		}
		System.out.printf("Salário Atual: R$ %.2f \n", salario);
		System.out.printf("Aumento Percentual: %.1f", aumentoPercentual);

	}

}
