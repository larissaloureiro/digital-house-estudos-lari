package aulaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaLista {

	public static void main(String[] args) {
		List<Carro> meusCarros = new ArrayList<>();
		
		Carro carro1 = new Carro("Audi X1", 2022, "Prata", "2.2");
		meusCarros.add(carro1); // Inserir informação
		meusCarros.add(new Carro("Renegade", 2018, "Preto", "2.0"));
		meusCarros.add(new Carro("Renegade", 2018, "Preto", "2.0"));
		meusCarros.add(new Carro("Etios Sedan", 2019, "Vermelho", "1.6"));
		meusCarros.add(new Carro("Etios Sedan", 2019, "Vermelho", "1.6"));
		
//		for (Carro carro : meusCarros) {
//			System.out.println(carro.toString());
//			System.out.println("======================");
//		}
		
		
//		for (int i = 0; i < meusCarros.size(); i++) {
//			System.out.println(meusCarros.get(i).toString());
//			System.out.println("======================");
//			
//		}
//		
//		System.out.println(meusCarros.get(1).toString());
		
//		meusCarros.remove(2); // Remove da lista o item com indice indicado
//		for (Carro carro : meusCarros) {
//			System.out.println(carro.toString());
//			System.out.println("======================");
//		}
//		
//		boolean resp = meusCarros.contains(carro1);
//		boolean resp2 = meusCarros.contains(new Carro("Etios Sedan", 2019, "Vermelho", "1.6"));
//		System.out.println(resp);
//		System.out.println(resp2);

		//sort() => Comparable => Strings
		Collections.sort(meusCarros);
		System.out.println(meusCarros.toString());
		System.out.println("========================");
		
		meusCarros.sort(new ComparadorDeAnos());
		System.out.println(meusCarros.toString());
		System.out.println("========================");
		
		Collections.shuffle(meusCarros); // Colocar em ordem aleatoria
		System.out.println(meusCarros.toString());
		
	}

}
