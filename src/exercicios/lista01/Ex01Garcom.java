package exercicios.lista01;

public class Ex01Garcom {

	public static void main(String[] args) {
		// Faça um programa que, dado o valor da conta de uma refeição realizada em um
		// restaurante, acrescente os 10% do garçom e exiba o valor total da conta.
		
		double valorConta = 122.50;
		double valorContaGarcom = valorConta * 1.1;
		System.out.printf("Valor total da conta: R$ %.2f", valorContaGarcom);

	}

}
