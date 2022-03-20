package exercicios;

public class L02Ex03ContaNegativos {

	public static void main(String[] args) {
		// Crie um array de inteiros e retorna a quantidade de elementos do array que são números negativos.
		int[] numeros = {1, 5, -4, 3, -2, 9, 8, -7, -1, 6};
		int contaNegativos = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				contaNegativos++;
			}
		}
		System.out.println("Quantidade de elementos negativos: "+ contaNegativos);

	}

}
