package exercicios;

public class L01Ex16PesoBagagem {

	public static void main(String[] args) {
		// Em um aeroporto, a balança de bagagem envia a informação de peso da bagagem desacompanhada
		// para um computador que calcula o valor do excesso de peso com os seguintes parâmetros:
		// Faixa de Peso da bagagem ------------ Valor a pagar por quilo em excesso
		// Até 20 Kg (inclusive) --------------- 0,00
		// De 20 Kg a 40 Kg (inclusive) -------- 5.000,00
		// De 40 Kg para cima ... -------------- 10.000,00
		
		double pesoBagagem = 50.0;
		double valorAPagar = 0.0;
		
		if (pesoBagagem <= 20) {
			valorAPagar = 0.0;
		} else if (pesoBagagem > 40) {
			valorAPagar = 10000 * (pesoBagagem - 20);
		} else {
			valorAPagar = 5000 * (pesoBagagem - 20);
		}
		
		System.out.println("Valor a pagar: " + String.format("%.2f", valorAPagar));
		
	}

}
