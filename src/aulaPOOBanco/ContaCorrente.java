package aulaPOOBanco;

public class ContaCorrente extends Conta {
	private double limite;
	public double saldoComLimite;
	
	// Construtores
	public ContaCorrente() {
		this.limite = 500.00;
		this.saldoComLimite = super.saldo + limite;
	}
	
	// Metodos		
	@Override
	public boolean sacar(double valor) {
		if (valor > 0 && saldo + limite >= valor) {
			saldo -= valor;
			return true;
		} 
		return false;
	}
	
	@Override
	public boolean transferir(double valor, Conta destinatario) {
		if (valor > 0 && saldo + limite >= valor) {
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
		this.saldoComLimite = super.saldo + this.limite;
		return saldoComLimite;
	}
}
