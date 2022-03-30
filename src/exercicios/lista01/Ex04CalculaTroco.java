package exercicios.lista01;

public class Ex04CalculaTroco {

	public static void main(String[] args) {
		// Escreva um programa que, dados o valor da mercadoria e o valor pago, calcule e exiba
		// o troco a ser devolvido.
		
		double valorMercadoria = 269.90;
		double valorPago = 300.00;
		double troco = valorPago - valorMercadoria;
		System.out.printf("Troco a ser devolvido: R$ %.2f", troco);

	}

}
