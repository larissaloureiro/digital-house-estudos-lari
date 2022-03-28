package exercicios;

public class LEstrRepEx01AumentoSalarial {

	public static void main(String[] args) {
		// Um funcion�rio de uma empresa recebe aumento salarial anualmente. Sabe-se que:
		// a) Esse funcion�rio foi contratado em 1995, com o sal�rio inicial de R$1000,00;
		// b) Em 1996 recebeu um aumento de 1,5% sobre o seu sal�rio inicial;
		// c) A partir de 1997 (inclusive), os aumentos salariais sempre corresponderam ao
		// dobro do percentual do ano anterior.
		// Fa�a um programa que determine o sal�rio atual desse funcion�rio.
		
		double salario = 1000.0;
		double aumentoPercentual = 1.5;
		for (int ano = 1996; ano <= 2022; ano++) {
			salario = salario + (salario * aumentoPercentual / 100);
			aumentoPercentual = aumentoPercentual * 2;
		}
		System.out.printf("Sal�rio Atual: R$ %.2f \n", salario);
		System.out.printf("Aumento Percentual: %.1f", aumentoPercentual);

	}

}
