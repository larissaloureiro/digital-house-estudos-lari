package exercicios.lista01;

public class Ex01Garcom {

	public static void main(String[] args) {
		// Fa�a um programa que, dado o valor da conta de uma refei��o realizada em um
		// restaurante, acrescente os 10% do gar�om e exiba o valor total da conta.
		
		double valorConta = 122.50;
		double valorContaGarcom = valorConta * 1.1;
		System.out.printf("Valor total da conta: R$ %.2f", valorContaGarcom);

	}

}
