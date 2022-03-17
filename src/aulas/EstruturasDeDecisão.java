package aulas;

public class EstruturasDeDecisão {

	public static void main(String[] args) {
		double salario = 2758.33;
		
		//IF
		// Imprimir "acima da média" caso o salario seja maior ou igual a 2500
		if (salario >= 2500) {
			System.out.println("Acima da média");			
		}
		
		// IF-ELSE
		// Imprimir "acima da média" caso o salario seja maior ou igual a 2500,
		// senão imprimir "abaixo da média"
		if (salario >= 2500) {
			System.out.println("Acima da média");
		} else {
			System.out.println("Abaixo da média");
		}
		
		// IF-ELSE-IF
		// salario >= 2500  "acima da média" 
		// salario >= 1000 && salario < 2500  "na média" 
		// salario < 1000  "acima da média" 
		
		if (salario >= 2500) {
			System.out.println("Acima da média");
		} else if (salario < 1000){
			System.out.println("Muito abaixo da média");
		} else {
			System.out.println("Na média");
		}
		
		// OPERADOR TERNÁRIO
		// Imprimir "acima da média" caso o salario seja maior ou igual a 2500,
		// senão imprimir "abaixo da média"
		String resposta = (salario >= 2500) ? "Acima da média" : "Abaixo da média";
		System.out.println(resposta);
		
		// SWITCH
		int opcao = 2;
		
		switch (opcao) {
			case 1:
				System.out.println("Problema técnico");
			break;
			case 2:
				System.out.println("Problema financeiro");
			break;
			case 3:
				System.out.println("Promoções");
			break;
			case 9:
				System.out.println("Fale conosco");
			break;
			default:
				System.out.println("O número digitado é inválido");			
		}
	}
}
