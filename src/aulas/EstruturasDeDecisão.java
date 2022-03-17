package aulas;

public class EstruturasDeDecis�o {

	public static void main(String[] args) {
		double salario = 2758.33;
		
		//IF
		// Imprimir "acima da m�dia" caso o salario seja maior ou igual a 2500
		if (salario >= 2500) {
			System.out.println("Acima da m�dia");			
		}
		
		// IF-ELSE
		// Imprimir "acima da m�dia" caso o salario seja maior ou igual a 2500,
		// sen�o imprimir "abaixo da m�dia"
		if (salario >= 2500) {
			System.out.println("Acima da m�dia");
		} else {
			System.out.println("Abaixo da m�dia");
		}
		
		// IF-ELSE-IF
		// salario >= 2500  "acima da m�dia" 
		// salario >= 1000 && salario < 2500  "na m�dia" 
		// salario < 1000  "acima da m�dia" 
		
		if (salario >= 2500) {
			System.out.println("Acima da m�dia");
		} else if (salario < 1000){
			System.out.println("Muito abaixo da m�dia");
		} else {
			System.out.println("Na m�dia");
		}
		
		// OPERADOR TERN�RIO
		// Imprimir "acima da m�dia" caso o salario seja maior ou igual a 2500,
		// sen�o imprimir "abaixo da m�dia"
		String resposta = (salario >= 2500) ? "Acima da m�dia" : "Abaixo da m�dia";
		System.out.println(resposta);
		
		// SWITCH
		int opcao = 2;
		
		switch (opcao) {
			case 1:
				System.out.println("Problema t�cnico");
			break;
			case 2:
				System.out.println("Problema financeiro");
			break;
			case 3:
				System.out.println("Promo��es");
			break;
			case 9:
				System.out.println("Fale conosco");
			break;
			default:
				System.out.println("O n�mero digitado � inv�lido");			
		}
	}
}
