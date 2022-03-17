package exercicios;

import java.util.Scanner;

public class L01Ex10CalculaValorVenda {

	public static void main(String[] args) {
		// Fa�a um programa para ler o c�digo, a descri��o, a quantidade, o pre�o de compra e
		// o percentual de lucro de uma mercadoria. Calcular o valor da venda com base no
		// percentual de lucro e, ainda, calcular o pre�o total em �R$� entre o pre�o da venda e
		// a quantidade. Ao final, escrever o pre�o de compra, o percentual de lucro, o pre�o da
		// venda, a quantidade e o pre�o total.
		
		Scanner leia = new Scanner(System.in);
		
		int codigo = 0;
		int quantidade = 0;
		int percentualLucro = 0;
		String descricaoProduto = "";
		double precoCompra = 0.0;
		double precoVenda = 0.0;
		double precoTotal = 0.0;
		double lucro = 0.0;
		
		System.out.print("Digite o c�digo do produto: ");
		codigo = Integer.valueOf(leia.nextLine());
		System.out.print("Digite a descri��o do produto: ");
		descricaoProduto = leia.nextLine();
		System.out.print("Digite a quantidade: ");
		quantidade = Integer.valueOf(leia.nextLine());
		System.out.print("Digite o pre�o de compra: ");
		precoCompra = Double.valueOf(leia.nextLine());
		System.out.print("Digite o percentual de lucro: ");
		percentualLucro = Integer.valueOf(leia.nextLine());
		
		leia.close();
		
		lucro = precoCompra * percentualLucro / 100;
		precoVenda = precoCompra + lucro;
		precoTotal = precoVenda * quantidade;
		
		System.out.println("Pre�o de compra: " + String.format("%.2f", precoCompra));
		System.out.println("Percentual de lucro: " + percentualLucro + "%");
		System.out.println("Pre�o de venda: " + String.format("%.2f", precoVenda));
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Pre�o Total: " + String.format("%.2f", precoTotal));
		
		

	}

}
