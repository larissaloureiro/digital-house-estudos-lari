package exercicios.dicionarios;

import java.util.HashSet;
import java.util.Set;

public class Exercicio03 {
	// Exercício 3:
	// Criar uma nova classe chamada Prova. Definir e implementar o seguinte método:
	// public void somaTotal(Set<Integer> conjuntoDeInteiros)
	// O método deve percorrer o conjunto de inteiros, ir acumulando o total da soma
	// dos valores e, no final, imprimir na
	// tela o valor da soma total.
	// Em seguida crie uma classe Exercício 3 com seu método main, imprimir no Main
	// todas as chaves junto com seus valores associados. Para isso, utilizar o
	// foreach com as chaves.
	
	public static void main(String[] args) {
		Set<Integer> conjunto = new HashSet<>();
		conjunto.add(1);
		conjunto.add(2);
		conjunto.add(5);
		conjunto.add(3);
		conjunto.add(7);
		conjunto.add(4);
		
		somaTotal(conjunto);
		
	}
	
	public static void somaTotal(Set<Integer> conjuntoDeInteiros) {
		int soma = 0;
		
		for (Integer valor : conjuntoDeInteiros) {
			soma += valor;
		}
		
		System.out.println("Soma total: " + soma);
	}

}
