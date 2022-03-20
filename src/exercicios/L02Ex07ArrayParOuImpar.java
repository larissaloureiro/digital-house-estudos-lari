package exercicios;

public class L02Ex07ArrayParOuImpar {

	public static void main(String[] args) {
		// Crie um array de inteiros positivos e substitui seus elementos de
		// valor ímpar por -1 e os pares por +1.
		
		int[] numeros = {1, 52, 48, 57, 7, 3, 4, 6, 98, 25};
		for (int i = 0; i < numeros.length; i++) {
			if ((numeros[i] % 2) != 0) {
				numeros[i] = -1;
			} else {
				numeros[i] = 1;
			}
		}
		System.out.print("Array: \t");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "\t");
		}

	}

}
