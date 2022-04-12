package aulaCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStreams {

	public static void main(String[] args) {
		List<String> estudantes = new ArrayList<>();
		estudantes.add("Maria");
		estudantes.add("Jose");
		estudantes.add("Antonio");
		estudantes.add("Ruy");
		estudantes.add("Pedro");
		estudantes.add("Ana");
		
		System.out.println("Lista de Alunos");
		
		// Imprime todos os dados da lista
		estudantes.stream().forEach(System.out::println);
		
		System.out.println("====================");
		
		// Contador
		System.out.println("Total de estudantes da lista: " + estudantes.stream().count());
		
		// Saber qual o maior nome da lista
		System.out.println("Maior nome: " + estudantes.stream()
			.max(Comparator.comparingInt(String::length))
		);
		
		// Saber qual o menor nome da lista
		System.out.println("Menor nome: " + estudantes.stream()
			.min(Comparator.comparingInt(String::length))
		);
		
		// Saber qual o menor nome da lista
		System.out.println("Nomes que contem R: " + estudantes.stream()
			.filter((estudante) -> estudante.toLowerCase().contains("r"))
			.collect(Collectors.toList())
		);
		
		// Exibe os n primeiros valores da collection
		System.out.println("Os primeiros 3 itens: " + estudantes.stream()
			.limit(3)
			.collect(Collectors.toList())
		);
		
		// Retorna um valor booleano de acordo com o criterio da busca
		// Retorna true se todos os elementos tem a letra
		System.out.println("Possui a letra q em todos os nomes? " + estudantes.stream()
			.allMatch((elemento) -> elemento.contains("q"))
		);
		
		// Retorna um valor booleano de acordo com o criterio da busca
		// Retorna true se um dos elementos tem a letra
		System.out.println("Alguem possui a letra a no nome? " + estudantes.stream()
			.anyMatch((elemento) -> elemento.contains("a"))
		);
		
		// Retorna um valor booleano de acordo com o criterio da busca
		// Retorna true se nenhum elemento tem a letra
		System.out.println("Ninguem possui a letra w no nome? " + estudantes.stream()
			.noneMatch((elemento) -> elemento.contains("w"))
		);
		
		// Retorna uma nova coleçao com o tamanho de cada nome
		System.out.println("Nova coleção com tamanho dos nomes: " + estudantes.stream()
			.map((estudante) -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
			.collect(Collectors.toList())
		);

	}

}
