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
		
		// . max -> Saber qual o maior nome da lista
		System.out.println("Maior nome: " + estudantes.stream()
			.max(Comparator.comparingInt(String::length))
		);
		
		// .min -> Saber qual o menor nome da lista
		System.out.println("Menor nome: " + estudantes.stream()
			.min(Comparator.comparingInt(String::length))
		);
		
		// .toLowerCase -> Transforma a string toda em letras minusculas
		// .filter -> Retorna os valores que atendem às condicoes estabelecidas 
		// .contains -> Verifica se a string contem a sequencia de caracteres indicada (no caso do exemplo, a letra "r")
		// .collect(Collectors.toList()) -> Coleta o resultado das operações na stream em uma List
		System.out.println("Nomes que contem R: " + estudantes.stream()
			.filter((estudante) -> estudante.toLowerCase().contains("r"))
			.collect(Collectors.toList())
		);
		
		// Exibe os n primeiros valores da collection
		System.out.println("Os primeiros 3 itens: " + estudantes.stream()
			.limit(3)
			.collect(Collectors.toList())
		);
		
		// .allMatch -> Retorna true se todos os elementos atendem ao criterio da busca
		// No exemplo: Retorna true se todos os elementos tem a letra q
		System.out.println("Possui a letra q em todos os nomes? " + estudantes.stream()
			.allMatch((elemento) -> elemento.contains("q"))
		);
		
		// .anyMatch -> Retorna true se pelo menos um dos elementos atende ao criterio da busca
		// No exemplo: Retorna true se um dos elementos tem a letra a
		System.out.println("Alguem possui a letra a no nome? " + estudantes.stream()
			.anyMatch((elemento) -> elemento.contains("a"))
		);
		
		// .noneMatch -> Retorna true se nenhum dos elementos atende ao criterio da busca
		// No exemplo: Retorna true se nenhum elemento tem a letra w
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
