package exercicios.lista02;

public class Ex01PreencherArrays {

	public static void main(String[] args) {
		// Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s), que preencha um array com os valores:
		// a) 10 9 8 7 6 5 4 3 2 1
		// b) 0 1 4 9 16 25 36 49 64 81 100
		// c) 1 2 3 4 5 10 20 30 40 50
		
		// a) 10 9 8 7 6 5 4 3 2 1
		int[] arrayA = new int[10];
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = 10 - i;
		}
		System.out.println("Array A:");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + "\t");
		}
		
		System.out.println();
		System.out.println();
		
		// b) 0 1 4 9 16 25 36 49 64 81 100
		int[] arrayB = new int[11];
		for (int i = 0; i < arrayB.length; i++) {
			arrayB[i] = i*i;
		}
		System.out.println("Array B:");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayB[i] + "\t");
		}
		
		System.out.println();
		System.out.println();
		
		// c) 1 2 3 4 5 10 20 30 40 50
		int[] arrayC = new int[10];
		for (int i = 0; i < arrayC.length; i++) {
			if (i < 5) {
				arrayC[i] = i + 1;
			} else {
				arrayC[i] = (i - 4) * 10;
			}
		}
		System.out.println("Array C:");
		for (int i = 0; i < arrayC.length; i++) {
			System.out.print(arrayC[i] + "\t");
		}
		

	}

}
