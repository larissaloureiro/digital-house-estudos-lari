package exercicios.loops;

public class Ex01SomaNumerosAte100 {

	public static void main(String[] args) {
		// Fa�a um programa que mostre a soma de todos os n�meros no intervalo de 1 at� 100.
		
		int soma = 0;
		int n = 1;
		
		while (n <= 100) {
			soma += n;
			n++;
		}
		
		System.out.println("Resultado: " + soma);

	}

}
