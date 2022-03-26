package aulaPOOBanco;

public class Conta {
	// Atributos
	private int agencia;
	private int conta;
	private double saldo;
	private String tipoDeConta;
	
	
	//Construtoress
	public Conta() {
		
	}
	
	public Conta(int agencia, int conta, String tipoDeConta) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.tipoDeConta = tipoDeConta;
	}



	// Getters & Setters
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTipoDeConta() {
		return tipoDeConta;
	}
	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
	
}
