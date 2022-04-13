package exercicios.dicionarios;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex04Main {
	// Exercício 4:
	// SaveTheRoupa S.A.
	// A SaveTheRoupa S.A. é uma empresa que deseja implementar um sistema informatizado de guarda-volumes de nível 
	// mundial. O sistema permite que uma pessoa guarde seus pertences no guarda-volumes e depois os retire de maneira 
	// simples, bastando apresentar o número de identificação recebido.
	// Os pertences são representados no sistema por algo abstrato chamado peça, que tem marca e modelo. Assim, se a 
	// pessoa perder o número, também poderia retirá-los com essas informações. No entanto, o método de retirada será 
	// projetado em outro momento.
	
	// 1. Criar a classe abstrata Peça, que contenha as variáveis marca e modelo, ambas de tipo String e um método 
	// abstrato chamado retirada.
	
	// 2. Criar a classe GuardaVolumes , que contenha como variável um dicionário e um contador que será utilizado
	// como identificador. As chaves do dicionário serão Integer e, como valor, haverá uma lista de peças.
	
	// 3. Criar o método public Integer guardarPecas(List<Peca> listaDePeca) na Classe GuardaVolumes, que recebe uma
	// lista de peças adiciona essa lista de peças em nosso dicionário e retorna o número de identificação, ou seja,
	// a chave do dicionário onde guardamos as peças, que neste caso é o nosso contador.
	
	// 4. Criar o método public void mostrarPecas() na Classe GuardaVolumes, que imprime na tela todas as peças que
	// estão no guarda-volumes, junto com o número correspondente.
	
	// 5. Criar o método public void mostrarPecas(Integer numero) na Classe GuardaVolumes, que imprima as peças que
	// estão associadas ao número recebido.
	
	// 6. Criar o método public void devolverPecas(Integer numero) na Classe GuardaVolumes, que remova a lista de 
	// peças que esta associada ao número recebido.
	
	// 7. Na classe Main, criar um cenário em que alguém guarda duas peças, recebe o código e depois retira suas peças.
	
	
	public static void main(String[] args) {
		
		Ex04Roupa roupa1 = new Ex04Roupa("ABCD", "Sobretudo Preto");
		Ex04Roupa roupa2 = new Ex04Roupa("EFGH", "Camisa Regata Branca");
		
		
		Ex04GuardaVolumes guardaVolumes01 = new Ex04GuardaVolumes();
		int identificador = guardaVolumes01.guardarPecas(new ArrayList<>(Arrays.asList(roupa1, roupa2)));
		System.out.println("Número de identificação: " + identificador);
		
		guardaVolumes01.devolverPecas(1);		

	}

}
