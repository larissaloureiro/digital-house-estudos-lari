package aulaPOOBanco;

public class Diretor extends Funcionario{

	// Construtores
	public Diretor() {
		
	}
	
	
	@Override
	public double getBonus() {
		return this.getSalario() * 0.15;
	}
	
	
}
