package aulaCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestaSet {

	public static void main(String[] args) {
		Set<Double> notas = new HashSet<>(Arrays.asList(7.5, 8.9, 10.0, 5.5, 3.1)); //add valores
		notas.add(7.5);
		System.out.println(notas);
		
		for (Double doubleTemp : notas) {
			System.out.println(doubleTemp);
			
		}
		
		System.out.println("Maior nota: " + Collections.max(notas));
		System.out.println("Menor nota: " + Collections.min(notas));
		
		double soma = 0;
		for (Double doubleTemp : notas) {
			soma += doubleTemp;			
		}
		System.out.println("M�dia das notas: " + (soma/notas.size()));

		
	}

}
