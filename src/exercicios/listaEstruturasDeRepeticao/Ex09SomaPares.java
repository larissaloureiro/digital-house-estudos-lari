package exercicios.listaEstruturasDeRepeticao;

public class Ex09SomaPares {

	public static void main(String[] args) {
		// Faça um programa que calcule a soma dos primeiros 50 números pares. Esse
		// programa não recebe valor. Os primeiros números pares são 2, 4, 6, ...
		
		int parAtual = 2;
		int somaPares = 0;
		
		for (int i = 0; i < 50; i++) {
			somaPares += parAtual;
			parAtual += 2;
		}
		System.out.println("Soma dos primeiros 50 númmeros pares: " + somaPares);
	}

}
