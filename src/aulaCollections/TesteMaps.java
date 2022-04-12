package aulaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TesteMaps {

	public static void main(String[] args) {
		Map<String, Integer> quadroMedalhasOlimpicas2020 = new HashMap<>();
		
		// .put -> Adiciona valores ao Map.
		quadroMedalhasOlimpicas2020.put("EUA", 113);
		quadroMedalhasOlimpicas2020.put("China", 88);
		quadroMedalhasOlimpicas2020.put("Japão", 58);
		quadroMedalhasOlimpicas2020.put("Grã-Bretanha", 65);
		quadroMedalhasOlimpicas2020.put("Brasil", 21);
		
		//.containsKey -> Buscar através de uma chave. Retorna true ou false.
		System.out.println(".containsKey(\"EUA\") -> " + quadroMedalhasOlimpicas2020.containsKey("EUA"));
		
		//.containsValue -> Buscar através de um valor. Retorna true ou false.
		System.out.println(".containsValue(58) -> " + quadroMedalhasOlimpicas2020.containsValue(58));
		
		//.size -> Retorna o tamanho do Map.
		System.out.println(".size() -> " + quadroMedalhasOlimpicas2020.size());
		
		// .get -> Consultar o valor armazenado na chave.
		System.out.println(".get(\"Brasil\") -> " + quadroMedalhasOlimpicas2020.get("Brasil"));
		
		// .remove -> Remover valores da lista. 
		System.out.println(".remove(\"Brasil\") -> " + quadroMedalhasOlimpicas2020.remove("Brasil"));
		
		for (Map.Entry<String, Integer> entry : quadroMedalhasOlimpicas2020.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		System.out.println("==========================");
		for (String key : quadroMedalhasOlimpicas2020.keySet()) {
			System.out.println(key + " -> " + quadroMedalhasOlimpicas2020.get(key));
			
		}
		
		
		System.out.println("==========================");
		System.out.println("Implementação de TreeMap");
		System.out.println("==========================");
		TreeMap<String, Integer> quadroMedalhasOlimpicas2016 = new TreeMap<>();
		quadroMedalhasOlimpicas2016.put("EUA", 103);
		quadroMedalhasOlimpicas2016.put("China", 90);
		quadroMedalhasOlimpicas2016.put("Japão", 50);
		quadroMedalhasOlimpicas2016.put("Grã-Bretanha", 70);
		quadroMedalhasOlimpicas2016.put("Brasil", 17);
		
		// O TreeMap organiza as chaves em ordem alfabética.
		
		// .firstKey -> Retorna a primeira chave
		System.out.println(".firstKey() -> " + quadroMedalhasOlimpicas2016.firstKey());
		
		// .lastKey -> Retorna a ultima chave
		System.out.println(".lastKey() -> " + quadroMedalhasOlimpicas2016.lastKey());
		
		// .lowerKey -> Retorna a chave anterior à indicada
		System.out.println(".lowerKey(\"China\") -> " + quadroMedalhasOlimpicas2016.lowerKey("China"));
		
		// .higherKey -> Retorna a chave posterior à indicada
		System.out.println(".higherKey(\"China\") -> " + quadroMedalhasOlimpicas2016.higherKey("China"));
		
		// .pollFirstEntry -> Exibe o valor e apaga posteriormente
		System.out.println(".pollFirstEntry() -> " + quadroMedalhasOlimpicas2016.pollFirstEntry());
				
		// .pollLastEntry -> Exibe o valor e apaga posteriormente
		System.out.println(".pollLastEntry() -> " + quadroMedalhasOlimpicas2016.pollLastEntry());
		
		

	}

}
