package exercicios.lista02;

public class Ex04ContaX {

	public static void main(String[] args) {
		// Crie um array de inteiros a e um valor inteiro x e retorna a qC.
		int[] arrayA = {1, 6, 3, 5, 6, 7, 9, 4, 6};
		int x = 6;
		int contaX = 0;
		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] == x) {
				contaX++;
			}
		}
		System.out.println("Quantidade de vezes que x aparece no array a: " + contaX);

	}

}
