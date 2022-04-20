package exercicios.dicionarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex04GuardaVolumes {
	private Map<Integer, ArrayList<Ex04Peca>> volumes;
	private Integer contador;
		
	public Ex04GuardaVolumes() {
		this.volumes = new HashMap<Integer, ArrayList<Ex04Peca>>();
		this.contador = 1;
	}

	public Integer guardarPecas(ArrayList<Ex04Peca> listaDePeca) {
		Integer identificador = contador;
		contador++;
		volumes.put(identificador, listaDePeca);
		return identificador;
	}
	
	public void mostrarPecas() {
		volumes.forEach((chave, valor) -> System.out.println(chave + " : " + valor));
		
	}
	
	public void mostrarPecas(Integer numero) {
		System.out.println(numero + " : " + volumes.get(numero));
	}
	
	public void devolverPecas(Integer numero) {
		volumes.remove(numero);
		System.out.println("Peças removidas com sucesso.");
	}

}
