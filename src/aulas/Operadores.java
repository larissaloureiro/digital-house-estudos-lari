package aulas;

public class Operadores {

	public static void main(String[] args) {
	    
		int valor1 = 10;
        int valor2 = 5;
        
		//Operadores Aritméticos
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-");
        System.out.println("-=-= Operadores Aritméticos =-=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-");
        System.out.println("Resultado soma: " + (valor1 + valor2));
        System.out.println("Resultado subtração: " + (valor1 - valor2));
        System.out.println("Resultado multiplicação: " + (valor1 * valor2));
        System.out.println("Resultado divisão: " + (valor1 / valor2));
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
        
      //Operadores Lógicos
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-");
        System.out.println("-=-=-= Operadores Lógicos =-=-=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-");
        
        float nota = 8.5f;
        float frequencia = 74.0f;
        
        System.out.println("nota >= 7 && frequencia >= 75 ? " + (nota >= 7 && frequencia >= 75));
        System.out.println("nota >= 7 || frequencia >= 75 ? " + (nota >= 7 || frequencia >= 75));
        System.out.println("!(nota >= 7 && frequencia >= 75) ? " + !(nota >= 7 && frequencia >= 75));
        
        
        
        
    }

}
