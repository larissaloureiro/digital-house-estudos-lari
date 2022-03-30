package exercicios.lista01;

public class Ex03DescontoAVista {

	public static void main(String[] args) {
		// Construa um programa que, dado o valor de uma mercadoria, sejam aplicados 15%
		// de desconto em uma venda à vista e exiba o valor a ser pago.
		
		double valorMercadoria = 100.00;
		double valorMercadoriaAVista = valorMercadoria * 0.85;
		System.out.printf("Valor a ser pago (à vista): R$ %.2f", valorMercadoriaAVista);

	}

}
