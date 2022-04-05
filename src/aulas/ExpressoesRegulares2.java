package aulas;

public class ExpressoesRegulares2 {
	
	private String ddd;
	private String numero;
	
	public ExpressoesRegulares2(String ddd, String numero) {
		if (ddd == null || numero == null) {
			System.out.println("Telefone Inválido.");
		}
		if (!ddd.matches("\\d{2}")) {
			System.out.println("DDD Inválido");
		}
		if (!numero.matches("\\d{8}|\\d{9}")) {
			System.out.println("Número Inválido");
		}
		this.ddd = ddd;
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		if (this.numero.length() == 8) {
			return "(" + this.ddd +") " + this.numero.substring(0, 4) + "-" + this.numero.substring(4, 8);
		} else {
			return "(" + this.ddd + ") " + this.numero.substring(0, 5) + "-" + this.numero.substring(5, 9);
		}
		
	}

}
