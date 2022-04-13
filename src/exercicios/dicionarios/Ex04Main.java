package exercicios.dicionarios;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex04Main {
	// Exerc�cio 4:
	// SaveTheRoupa S.A.
	// A SaveTheRoupa S.A. � uma empresa que deseja implementar um sistema informatizado de guarda-volumes de n�vel 
	// mundial. O sistema permite que uma pessoa guarde seus pertences no guarda-volumes e depois os retire de maneira 
	// simples, bastando apresentar o n�mero de identifica��o recebido.
	// Os pertences s�o representados no sistema por algo abstrato chamado pe�a, que tem marca e modelo. Assim, se a 
	// pessoa perder o n�mero, tamb�m poderia retir�-los com essas informa��es. No entanto, o m�todo de retirada ser� 
	// projetado em outro momento.
	
	// 1. Criar a classe abstrata Pe�a, que contenha as vari�veis marca e modelo, ambas de tipo String e um m�todo 
	// abstrato chamado retirada.
	
	// 2. Criar a classe GuardaVolumes , que contenha como vari�vel um dicion�rio e um contador que ser� utilizado
	// como identificador. As chaves do dicion�rio ser�o Integer e, como valor, haver� uma lista de pe�as.
	
	// 3. Criar o m�todo public Integer guardarPecas(List<Peca> listaDePeca) na Classe GuardaVolumes, que recebe uma
	// lista de pe�as adiciona essa lista de pe�as em nosso dicion�rio e retorna o n�mero de identifica��o, ou seja,
	// a chave do dicion�rio onde guardamos as pe�as, que neste caso � o nosso contador.
	
	// 4. Criar o m�todo public void mostrarPecas() na Classe GuardaVolumes, que imprime na tela todas as pe�as que
	// est�o no guarda-volumes, junto com o n�mero correspondente.
	
	// 5. Criar o m�todo public void mostrarPecas(Integer numero) na Classe GuardaVolumes, que imprima as pe�as que
	// est�o associadas ao n�mero recebido.
	
	// 6. Criar o m�todo public void devolverPecas(Integer numero) na Classe GuardaVolumes, que remova a lista de 
	// pe�as que esta associada ao n�mero recebido.
	
	// 7. Na classe Main, criar um cen�rio em que algu�m guarda duas pe�as, recebe o c�digo e depois retira suas pe�as.
	
	
	public static void main(String[] args) {
		
		Ex04Roupa roupa1 = new Ex04Roupa("ABCD", "Sobretudo Preto");
		Ex04Roupa roupa2 = new Ex04Roupa("EFGH", "Camisa Regata Branca");
		
		
		Ex04GuardaVolumes guardaVolumes01 = new Ex04GuardaVolumes();
		int identificador = guardaVolumes01.guardarPecas(new ArrayList<>(Arrays.asList(roupa1, roupa2)));
		System.out.println("N�mero de identifica��o: " + identificador);
		
		guardaVolumes01.devolverPecas(1);		

	}

}
