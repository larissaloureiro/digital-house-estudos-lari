package exercicios;

public class L02Ex02ImprimeArray {

	public static void main(String[] args) {
		// Escreva um trecho Java que exiba os valores de um array a double numa mesma linha.
		double[] arrayA = {0.2, 1.6, 3.8, 16.9, 5.7};
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + "\t");
		}

	}

}
