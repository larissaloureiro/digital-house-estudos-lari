package exercicios.listaEstruturasDeRepeticao;

public class Ex09SomaPares {

	public static void main(String[] args) {
		// Fa�a um programa que calcule a soma dos primeiros 50 n�meros pares. Esse
		// programa n�o recebe valor. Os primeiros n�meros pares s�o 2, 4, 6, ...
		
		int parAtual = 2;
		int somaPares = 0;
		
		for (int i = 0; i < 50; i++) {
			somaPares += parAtual;
			parAtual += 2;
		}
		System.out.println("Soma dos primeiros 50 n�mmeros pares: " + somaPares);
	}

}
