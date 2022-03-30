package exercicios.lista02;

public class Ex06PosicaoMaiorNumero {

	public static void main(String[] args) {
		// Escreva um array de números e devolve a posição onde se encontra o maior valor do array.
		int[] numeros = {1, 8, 9, 45, 12, 3, 65, 94, 42, 55};
		int posicaoMaiorNumero = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > numeros[posicaoMaiorNumero]) {
				posicaoMaiorNumero = i;
			}
		}
		System.out.print("Array: \t");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "\t");
		}
		System.out.println("\n" + "Índice do maior número no array: " + posicaoMaiorNumero);

	}

}
