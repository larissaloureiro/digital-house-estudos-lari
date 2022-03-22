package aulas;

public class Arrays {

	public static void main(String[] args) {
		
		// ARRAY UNIDIMENSIONAL (VETOR)
		int[] idades = {1, 6, 7, 80, 45}; //já está inicializado, pq já tem valores
		int[] idades2 = new int[5]; //não possui dados escritos pelo usuário

		String[] nomes = {"Julia", "Marcia", "Ana"};
		String[] nomes2 = new String[3];
		
		System.out.println("Idade: " + idades[2] + " - Nome: " + nomes[2]);
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		
		// ARRAY MULTIDIMENSIONAL (MATRIZ)
		
		int [][] numeros = new int [3][3];
		int valor = 1;
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				numeros[linha][coluna] = valor++;
			}
		}
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print(numeros[linha][coluna] + "\t");
			}
			System.out.println();
		}
		
	}

}
