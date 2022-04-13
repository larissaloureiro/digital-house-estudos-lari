package exercicios.dicionarios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercicio01 {
	// Exercício 1:
	// 1. Criar um dicionário que represente os primeiros 5 números da “Loteria dos Sonhos”, junto com seu 
	// significado. Para isso, o dicionário deverá ter como chave Integer e como valor uma String.
	// Números da Loteria dos Sonhos:
	// 0 -> Ovos
	// 1 -> Água
	// 2 -> Escopeta
	// 3 -> Cavalo
	// 4 -> Dentista
	// 5 -> Fogo
	
	// 2. Criar um dicionário que represente os apelidos que uso para chamar os meus amigos. Para isso, o 
	// dicionário deverá ter como chave String e como valor uma lista de Strings.
	// João -> Juan, Fissura, Maromba
	// Miguel -> Night Watch, Bruce Wayne, Tampinha
	// Maria -> Wonder Woman, Mary, Marilene
	// Lucas -> Lukinha, Jorge, George
			
	// Em seguida crie uma classe Exercício 1 com seu método main, imprimir no Main todas as chaves junto 
	// com seus valores associados. Para isso, utilizar o foreach com as chaves.
	
	public static void main(String[] args) {
		Map<Integer, String> loteriaDosSonhos = new HashMap<>();
		loteriaDosSonhos.put(0, "Ovos");
		loteriaDosSonhos.put(1, "Água");
		loteriaDosSonhos.put(2, "Escopeta");
		loteriaDosSonhos.put(3, "Cavalo");
		loteriaDosSonhos.put(4, "Dentista");
		loteriaDosSonhos.put(5, "Fogo");
		
		Map<String, ArrayList<String>> apelidosDosAmigos = new HashMap<>();
		apelidosDosAmigos.put("João", new ArrayList<>(Arrays.asList("Juan", "Fissura", "Maromba")));
		apelidosDosAmigos.put("Miguel", new ArrayList<>(Arrays.asList("Night Watch", "Bruce Wayne", "Tampinha")));
		apelidosDosAmigos.put("Maria", new ArrayList<>(Arrays.asList("Wonder Woman", "Mary", "Marilene")));
		apelidosDosAmigos.put("Lucas", new ArrayList<>(Arrays.asList("Lukinha", "Jorge", "George")));

		System.out.println("Loteria dos Sonhos: ");
		loteriaDosSonhos.forEach((chave, valor) -> System.out.println(chave + " : " + valor));
		
		System.out.println("===============================================");
		
		System.out.println("Apelidos dos amigos: ");
		apelidosDosAmigos.forEach((chave, valor) -> System.out.println(chave + " : " + valor));

		
		
		
		
		

	}

}
