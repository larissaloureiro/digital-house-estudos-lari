package aulas;

public class EstruturasDeRepeticao {

	public static void main(String[] args) {
		// WHILE
		
		int contador = 0;
		
		while (contador < 10) {
			System.out.println("Número " + contador);
			contador += 2;
		}
		
		System.out.println("==============");
		
		// DO WHILE
		
		int contador2 = 0;
		
		do {
			System.out.println("Número " + contador2);
			contador2 += 2;
		} while (contador2 < 10);
		
		System.out.println("==============");
		
		// FOR
		
		for (int contador3 = 0; contador3 < 10; contador3++) {
			System.out.println("Número " + contador3);
		}

	}

}
