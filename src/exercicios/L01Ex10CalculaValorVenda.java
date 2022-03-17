package exercicios;

import java.util.Scanner;

public class L01Ex10CalculaValorVenda {

	public static void main(String[] args) {
		// Faça um programa para ler o código, a descrição, a quantidade, o preço de compra e
		// o percentual de lucro de uma mercadoria. Calcular o valor da venda com base no
		// percentual de lucro e, ainda, calcular o preço total em “R$” entre o preço da venda e
		// a quantidade. Ao final, escrever o preço de compra, o percentual de lucro, o preço da
		// venda, a quantidade e o preço total.
		
		Scanner leia = new Scanner(System.in);
		
		int codigo = 0;
		int quantidade = 0;
		int percentualLucro = 0;
		String descricaoProduto = "";
		double precoCompra = 0.0;
		double precoVenda = 0.0;
		double precoTotal = 0.0;
		double lucro = 0.0;
		
		System.out.print("Digite o código do produto: ");
		codigo = Integer.valueOf(leia.nextLine());
		System.out.print("Digite a descrição do produto: ");
		descricaoProduto = leia.nextLine();
		System.out.print("Digite a quantidade: ");
		quantidade = Integer.valueOf(leia.nextLine());
		System.out.print("Digite o preço de compra: ");
		precoCompra = Double.valueOf(leia.nextLine());
		System.out.print("Digite o percentual de lucro: ");
		percentualLucro = Integer.valueOf(leia.nextLine());
		
		leia.close();
		
		lucro = precoCompra * percentualLucro / 100;
		precoVenda = precoCompra + lucro;
		precoTotal = precoVenda * quantidade;
		
		System.out.println("Preço de compra: " + String.format("%.2f", precoCompra));
		System.out.println("Percentual de lucro: " + percentualLucro + "%");
		System.out.println("Preço de venda: " + String.format("%.2f", precoVenda));
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preço Total: " + String.format("%.2f", precoTotal));
		
		

	}

}
