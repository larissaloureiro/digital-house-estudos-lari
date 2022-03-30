package exercicios.lista01;

public class Ex12AtribuicaoEntreVariaveis {

	public static void main(String[] args) {
		// Considerando um Programa iniciado pelos atributos A 1, B 2, C 3 , complete o de
		// modo que ao final do Programa o conteúdo de A seja 3 , de B seja 1 e de C seja 2 . Use
		// apenas atribuições entre variáveis.
		
		int a = 1;
		int b = 2;
		int c = 3;
		int temp;
		temp = a;
		a = c;
		c = b;
		b = temp;
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);		

	}

}
