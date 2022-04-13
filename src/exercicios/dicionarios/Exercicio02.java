package exercicios.dicionarios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio02 {

	public static void main(String[] args) {
		// Exercício 2:
		// 3. Definir e inicializar uma nova lista vazia. Adicionar os seguintes elementos à
		// lista vazia: 1,5,5,6,7,8,8,8.
		// Imprimir o resultado na tela.
		
		// 4. Definir e inicializar um novo conjunto vazio. Adicionar os seguintes elementos
		// ao conjunto vazio: 1,5,5,6,7,8,8,8.
		// Imprimir o resultado na tela. Qual é a diferença entre este exercício e o anterior?
		
		// Em seguida crie uma classe Exercício 2 com seu método main, imprimir no Main
		// todas as chaves junto com seus valores associados. Para isso, utilizar o
		// foreach com as chaves ou o método toString().
		
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(5);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(8);
		lista.add(8);
		
		System.out.println("Lista: " + lista.toString()); // Pode conter valores repetidos
		
		Set<Integer> conjunto = new HashSet<>();
		conjunto.add(1);
		conjunto.add(5);
		conjunto.add(5);
		conjunto.add(6);
		conjunto.add(7);
		conjunto.add(8);
		conjunto.add(8);
		conjunto.add(8);
		
		System.out.println("Conjunto: " + conjunto.toString()); // Não são adicionados valores repetidos
		

	}

}
