package exercicios;

import java.util.Scanner;

public class L01Ex14CalculaTinta {

	public static void main(String[] args) {
		// Fa�a um Programa que calcule a quantidade necess�ria de tinta e o n�mero de latas,
		// para pintar uma parede de Xm de largura por Ym de altura. Considere que o consumo
		// de tinta � de 3 litros por metro quadrado e a quantidade de tinta por lata � de 2
		// litros.
		
		Scanner leia = new Scanner(System.in);
		double largura = 0;
		double altura = 0;
		double area = 0;
		double litrosTinta = 0;
		double latasTinta = 0;
		
		System.out.print("Digite a largura da parede: ");
		largura = Double.valueOf(leia.nextLine());
		System.out.print("Digite a altura da parede: ");
		altura = Double.valueOf(leia.nextLine());
		
		area = largura * altura;
		litrosTinta = 3 * area;
		latasTinta = Math.ceil(litrosTinta / 2); 
		
		System.out.println("Quantidade necess�ria de tinta: " + String.format("%.1f", litrosTinta) + " litros");
		System.out.println("Quantidade necess�ria de latas: " + String.format("%.0f", latasTinta));

		leia.close();

	}

}
