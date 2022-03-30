package exercicios.lista01;

import java.util.Scanner;

public class Ex18CategoriaNadador {

	public static void main(String[] args) {
		// Elabore um programa que, dada a idade de um nadador, classifique o em uma das seguintes categorias:
		// Infantil A = 5 - 7 anos
		// Infantil B = 8 - 10 anos
		// Juvenil A = 11 - 13 anos
		// Juvenil B = 14 - 17 anos
		// Sênior = maiores de 18 anos
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		String categoria = "";
		
		System.out.print("Informe a idade do nadador: ");
		idade = leia.nextInt();
		
		leia.close();
		
		if (idade >= 5 && idade <= 7) {
			categoria = "Infantil A";
		} else if (idade >= 8 && idade <= 10) {
			categoria = "Infantil B";
		} else if (idade >= 11 && idade <= 13) {
			categoria = "Juvenil A";
		} else if (idade >= 14 && idade <= 17) {
			categoria = "Juvenil B";
		} else if (idade >= 18) {
			categoria = "Sênior";
		} else {
			categoria = "(Idade inválida)";
		}
		
		System.out.println("Categoria do nadador: " + categoria);

	}

}
