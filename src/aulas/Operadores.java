package aulas;

public class Operadores {

	public static void main(String[] args) {
	    
		int valor1 = 10;
        int valor2 = 5;
        
		//Operadores Aritm�ticos
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-");
        System.out.println("-=-= Operadores Aritm�ticos =-=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-");
        System.out.println("Resultado soma: " + (valor1 + valor2));
        System.out.println("Resultado subtra��o: " + (valor1 - valor2));
        System.out.println("Resultado multiplica��o: " + (valor1 * valor2));
        System.out.println("Resultado divis�o: " + (valor1 / valor2));
        System.out.println("Resultado MOD: " + (valor1 % valor2));
        
        //Operadores Relacionais
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-");
        System.out.println("-=-= Operadores Relacionais =-=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-");
        System.out.println("valor1 > valor2 ? " + (valor1 > valor2));
        System.out.println("valor1 >= valor2 ? " + (valor1 >= valor2));
        System.out.println("valor1 < valor2 ? " + (valor1 < valor2));
        System.out.println("valor1 <= valor2 ? " + (valor1 <= valor2));
        System.out.println("valor1 == valor2 ? " + (valor1 == valor2));
        System.out.println("valor1 != valor2 ? " + (valor1 != valor2));
        
      //Operadores L�gicos
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-");
        System.out.println("-=-=-= Operadores L�gicos =-=-=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-");
        
        float nota = 8.5f;
        float frequencia = 74.0f;
        
        System.out.println("nota >= 7 && frequencia >= 75 ? " + (nota >= 7 && frequencia >= 75));
        System.out.println("nota >= 7 || frequencia >= 75 ? " + (nota >= 7 || frequencia >= 75));
        System.out.println("!(nota >= 7 && frequencia >= 75) ? " + !(nota >= 7 && frequencia >= 75));
        
        
        
        
    }

}
