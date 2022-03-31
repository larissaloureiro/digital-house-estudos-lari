package aulaPOOBanco;

public class ContaCorrente extends Conta {
	private double limite;
	
	// Construtores
	public ContaCorrente() {
		this.limite = 500.00;
	}
	
	// Metodos		
	@Override
	public boolean sacar(double valor) {
		if (valor > 0 && getSaldoComLimite() >= valor) {
			saldo -= valor;
			return true;
		} 
		return false;
	}
	
	@Override
	public boolean transferir(double valor, Conta destinatario) {
		if (valor > 0 && getSaldoComLimite() >= valor) {
			saldo -= valor;
			destinatario.depositar(valor);
			return true;
		}
		return false;
	}

	// Getters & Setters
	public double getLimite() {
		return limite;
	}
	
	public double getSaldoComLimite() {
		return super.saldo + this.limite;
	}
}
