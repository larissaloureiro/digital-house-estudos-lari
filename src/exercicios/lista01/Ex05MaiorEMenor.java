package exercicios.lista01;

public class Ex05MaiorEMenor {
	public static void main(String[] args) {
		// Escreva um programa que, dados três números, informe o maior e o menor.
		
		int numeroA = 8;
		int numeroB = 3;
		int numeroC = 5;
		int menor = 0;
		int maior = 0;
		
		if (numeroA < numeroB && numeroA < numeroC) {
			menor = numeroA;
		} else if (numeroB < numeroC) {
			menor = numeroB;
		} else {
			menor = numeroC;
		}
		
		if (numeroA > numeroB && numeroA > numeroC) {
			maior = numeroA;
		} else if (numeroB > numeroC) {
			maior = numeroB;
		} else {
			maior = numeroC;
		}
		
		
		System.out.println("Menor: " + menor);
		System.out.println("Maior: " + maior);

	}

}
