package exercicios.lista02;

public class Ex05ArrayPositivoOuNegativo {

	public static void main(String[] args) {
		// Escreva um array de inteiros a e devolve um array de boolean onde, cada posição 
		// indique true se o elemento da posição correspondente de a é positivo e 
		// false caso seja negativo ou zero.
		
		int[] arrayA = {2, -5, 0, 3, -1, 8, 7, -9, 4, 2};
		boolean[] arrayBoolean = new boolean[10];
		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] > 0) {
				arrayBoolean[i] = true;
			} else {
				arrayBoolean[i] = false;
			}
		}
		System.out.print("Array A: \t");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + "\t");
		}
		System.out.println();
		System.out.print("Array Boolean: \t");
		for (int i = 0; i < arrayBoolean.length; i++) {
			System.out.print(arrayBoolean[i] + "\t");
		}

	}

}
