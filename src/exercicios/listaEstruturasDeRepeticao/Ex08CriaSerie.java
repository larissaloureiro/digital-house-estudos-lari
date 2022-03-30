package exercicios.listaEstruturasDeRepeticao;

import java.util.Scanner;

public class Ex08CriaSerie {

	public static void main(String[] args) {
		// Fa�a um programa que leia o n�mero de termos, determine e mostre os valores de
		// acordo com a s�rie abaixo:
		// S�rie: 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567, 768, 64, ...
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o n�mero de termos: ");
		int termos =  Integer.valueOf(scanner.nextLine());
		scanner.close();
		
		int[] serie = new int[termos];
		int contador = 1;
		
		for (int i = 0; i < serie.length; i++) {
			switch (contador) {
			case 1:
				if (i > 2) {
					serie[i] = serie[i - 3] * 2;
				} else {
					serie[i] = 2;
				}
				contador++;
				break;

			case 2:
				if (i > 2) {
					serie[i] = serie[i - 3] * 3;
				} else {
					serie[i] = 7;
				}
				contador++;
				break;
			
			case 3:
				if (i > 2) {
					serie[i] = serie[i - 3] * 4;
				} else {
					serie[i] = 3;
				}
				contador = 1;
				break;
			} 
		}
		
		System.out.printf("S�rie de %d termos: \n", termos);
		for (int i = 0; i < serie.length; i++) {
			System.out.printf("%d\t", serie[i]);
		}

	}

}
